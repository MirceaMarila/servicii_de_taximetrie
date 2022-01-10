package unibuc.servicii_de_taximetrie.service;

import org.springframework.stereotype.Service;
import unibuc.servicii_de_taximetrie.dto.OrderRequest;
import unibuc.servicii_de_taximetrie.exception.ClientNotFoundException;
import unibuc.servicii_de_taximetrie.exception.DriverNotFoundException;
import unibuc.servicii_de_taximetrie.exception.NoDriversAvailableException;
import unibuc.servicii_de_taximetrie.exception.NotEnaughFoundsException;
import unibuc.servicii_de_taximetrie.model.*;
import unibuc.servicii_de_taximetrie.repository.ClientRepository;
import unibuc.servicii_de_taximetrie.repository.DriverRepository;
import unibuc.servicii_de_taximetrie.repository.RideRepository;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class OrderService {

    private ClientRepository clientRepository;
    private DriverRepository driverRepository;
    private RideService rideService;
    private DriverService driverService;
    private PreferancesService preferancesService;
    private DetailsService detailsService;

    public OrderService(ClientRepository clientRepository, DriverRepository driverRepository, RideService rideService, DriverService driverService, PreferancesService preferancesService, DetailsService detailsService) {
        this.clientRepository = clientRepository;
        this.driverRepository = driverRepository;

        this.rideService = rideService;
        this.driverService = driverService;
        this.preferancesService = preferancesService;
        this.detailsService = detailsService;
    }

    public Details process_order(OrderRequest orderRequest){

        double distance;
        double duration;

        Ride rideRequested = rideService.getDistanceByDestionationAndLocation(orderRequest.getDestination(), orderRequest.getLocation());
        if(rideRequested != null) {
            distance = rideRequested.getDistance();
            duration = rideRequested.getDuration();
        }

        else{
            Ride ride = new Ride(orderRequest.getLocation(), orderRequest.getDestination());
            rideService.createRide(ride);

            distance = ride.getDistance();
            duration = ride.getDuration();

            if(orderRequest.isFastRide()){
                duration -= duration/2;
            }
        }

        double price = get_ride_price(distance, orderRequest.isSandwich(), orderRequest.isWater());
        Optional<Client> clientOptional = clientRepository.findById((long) orderRequest.getIdClient());


        if(clientOptional.isPresent()){
            double balance = clientOptional.get().getMoney();
            if(price > balance){
                throw new NotEnaughFoundsException(price, balance);
            }
        }
        else{
            throw new ClientNotFoundException(orderRequest.getIdClient());
        }

        Driver driver;

        if(orderRequest.getIdDriver() != 0) {
            Optional<Driver> driverOptional = driverRepository.findById((long) orderRequest.getIdDriver());
            if (driverOptional.isEmpty())
                throw new DriverNotFoundException(orderRequest.getIdDriver());

            driver = driverService.getDriver((long) orderRequest.getIdDriver());
        }

        else{
            List<Driver> drivers = driverService.getAllDrivers();
            if(drivers.size() == 0)
                throw new NoDriversAvailableException();

            Random r = new Random();
            int randomDriver =  1 + r.nextInt(drivers.size());

            driver = driverService.getDriver((long) randomDriver);
        }

        Preferences preferences = new Preferences(orderRequest.getMusic(), orderRequest.getTemperature(), orderRequest.isFastRide(),
                orderRequest.isSandwich(), orderRequest.isWater());
        preferancesService.createPreferences(preferences);

        Details details = new Details(driver.getName(), clientOptional.get().getName(), get_ride_details(orderRequest.getLocation(),
                orderRequest.getDestination(), distance, duration), get_preferences(orderRequest.isWater(), orderRequest.isSandwich(),
                orderRequest.getMusic(), orderRequest.getTemperature(), orderRequest.isFastRide()), price, driver.getCarDetails());

        return detailsService.createDetails(details);


    }

    private double get_ride_price(double distance, boolean sandwich, boolean water){
        double pret = distance * 2;
        LocalTime now = LocalTime.now();

        if(now.getHour() >= 22 || now.getHour() <= 6){
            pret += pret/2;
        }

        if(sandwich)
            pret += 10;

        if(water)
            pret += 5;

        return pret;
    }

    private String get_ride_details(String location, String destination, double distance, double duration){
        DecimalFormat df = new DecimalFormat("#.#");
        return location + " -> " + destination + ", " + df.format(distance) + " km, " + df.format(duration) + " min";
    }

    private String get_preferences(boolean water, boolean sandwich, MusicalGenres music, int temperature, boolean fastRide){
        String return_string = "Music: " + music.name() + ", FastRide: " + fastRide + ", Water: " + water + ", Sandwich: " + sandwich + ", Temperature: ";
        if(temperature != 0 )
            return_string += temperature;
        else return_string += "ANY";

        return return_string;
    }

}
