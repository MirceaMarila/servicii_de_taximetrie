package unibuc.servicii_de_taximetrie.service;

import unibuc.servicii_de_taximetrie.model.Car;
import org.springframework.stereotype.Service;
import unibuc.servicii_de_taximetrie.repository.CarRepository;

@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public Car createCar(Car car){
        return carRepository.save(car);
    }
}
