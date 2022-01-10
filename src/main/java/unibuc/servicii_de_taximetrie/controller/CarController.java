package unibuc.servicii_de_taximetrie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unibuc.servicii_de_taximetrie.dto.CarRequest;
import unibuc.servicii_de_taximetrie.model.Car;
import unibuc.servicii_de_taximetrie.service.CarService;
import unibuc.servicii_de_taximetrie.mapper.CarMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private CarService carService;
    private CarMapper carMapper;

    public CarController(CarService carService, CarMapper carMapper) {
        this.carService = carService;
        this.carMapper = carMapper;
    }

    @GetMapping("/{id}")
    public Car car(@PathVariable Long id) {
        return carService.getCar(id);
    }

    @GetMapping
    public List<Car> getCarList(){
        return carService.getAllCars();
    }


}
