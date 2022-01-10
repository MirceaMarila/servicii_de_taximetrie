package unibuc.servicii_de_taximetrie.service;

import unibuc.servicii_de_taximetrie.exception.CarNotFoundException;
import unibuc.servicii_de_taximetrie.model.Car;
import org.springframework.stereotype.Service;
import unibuc.servicii_de_taximetrie.repository.CarRepository;

import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
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

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }
}
