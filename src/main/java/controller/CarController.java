package controller;

import dto.CarRequest;
import mapper.CarMapper;
import model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CarService;

import java.net.URI;

@RestController
@RequestMapping("/cars")
public class CarController {

    private CarService carService;
    private CarMapper carMapper;

    public CarController(CarService carService, CarMapper carMapper) {
        this.carService = carService;
        this.carMapper = carMapper;
    }

    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody CarRequest carRequest) {
        Car car = carMapper.carRequestToCar(carRequest);
        Car createdCar = carService.createCar(car);
        return ResponseEntity.created(URI.create("/car/" + createdCar.getId())).body(createdCar);
    }

    @GetMapping("/hello")
    private String hello(){
        return "Hello!";
    }


}
