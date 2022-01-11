package unibuc.servicii_de_taximetrie.service;

import unibuc.servicii_de_taximetrie.exception.CarNotFoundException;
import unibuc.servicii_de_taximetrie.exception.DriverNotFoundException;
import unibuc.servicii_de_taximetrie.model.Car;
import org.springframework.stereotype.Service;
import unibuc.servicii_de_taximetrie.model.Driver;
import unibuc.servicii_de_taximetrie.repository.CarRepository;
import unibuc.servicii_de_taximetrie.repository.DriverRepository;

import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

@Service
public class CarService {

    private CarRepository carRepository;
    private DriverRepository driverRepository;

    public CarService(CarRepository carRepository, DriverRepository driverRepository){
        this.carRepository = carRepository;
        this.driverRepository = driverRepository;
    }

    public Car createCar(Car car){
        return carRepository.save(car);
    }

    public Car getCar(Long id){
        Optional<Car> carOptional = carRepository.findById(id);
        if(carOptional.isPresent()){
            return carOptional.get();
        }
        else{
            throw new CarNotFoundException(id);
        }
    }

    public Car getDriverCar(Long id){
        Optional<Driver> driverOptional = driverRepository.findById(id);
        if(driverOptional.isPresent()){
            Optional<Car> carOptional = carRepository.getDriverCar(id);
            return carOptional.get();
        }
        else{
            throw new DriverNotFoundException(id);
        }
    }

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }
}
