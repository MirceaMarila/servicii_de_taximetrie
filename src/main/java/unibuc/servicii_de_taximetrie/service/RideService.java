package unibuc.servicii_de_taximetrie.service;

import org.springframework.stereotype.Service;
import unibuc.servicii_de_taximetrie.exception.RideNotFoundException;
import unibuc.servicii_de_taximetrie.model.Ride;
import unibuc.servicii_de_taximetrie.repository.RideRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RideService {

    private RideRepository rideRepository;

    public RideService(RideRepository rideRepository){
        this.rideRepository = rideRepository;
    }

    public Ride createRide(Ride ride){
        return rideRepository.save(ride);
    }

    public Ride getRide(Long id){
        Optional<Ride> rideOptional = rideRepository.findById(id);
        if(rideOptional.isPresent()){
            return rideOptional.get();
        }
        else{
            throw new RideNotFoundException(id);
        }
    }

    public List<Ride> getAllRides(){
        return rideRepository.findAll();
    }

    public Ride getDistanceByDestionationAndLocation(String destination, String location)
    {
        return rideRepository.getDistanceByDestionationAndLocation(destination, location);
    }
}
