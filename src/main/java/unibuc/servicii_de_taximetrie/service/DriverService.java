package unibuc.servicii_de_taximetrie.service;

import org.springframework.stereotype.Service;
import unibuc.servicii_de_taximetrie.exception.DriverNotFoundException;
import unibuc.servicii_de_taximetrie.model.Car;
import unibuc.servicii_de_taximetrie.model.Driver;
import unibuc.servicii_de_taximetrie.repository.DriverRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    private DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository){
        this.driverRepository = driverRepository;
    }

    public Driver createDriver(Driver driver){
        return driverRepository.save(driver);
    }

    public Driver getDriver(Long id){
        Optional<Driver> driverOptional = driverRepository.findById(id);
        if(driverOptional.isPresent()){
            return driverOptional.get();
        }
        else{
            throw new DriverNotFoundException(id);
        }
    }

    public List<Driver> getAllDrivers(){
        return driverRepository.findAll();
    }
}
