package unibuc.servicii_de_taximetrie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unibuc.servicii_de_taximetrie.dto.DriverRequest;
import unibuc.servicii_de_taximetrie.mapper.CarMapper;
import unibuc.servicii_de_taximetrie.mapper.DriverMapper;
import unibuc.servicii_de_taximetrie.model.Car;
import unibuc.servicii_de_taximetrie.model.Driver;
import unibuc.servicii_de_taximetrie.service.CarService;
import unibuc.servicii_de_taximetrie.service.DriverService;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/drivers")
public class DriverController {

    private DriverService driverService;
    private DriverMapper driverMapper;
    private CarService carService;
    private CarMapper carMapper;

    public DriverController(DriverService driverService, DriverMapper driverMapper, CarService carService, CarMapper carMapper) {
        this.driverService = driverService;
        this.driverMapper = driverMapper;
        this.carService = carService;
        this.carMapper = carMapper;
    }

    @PostMapping
    public ResponseEntity<Driver> createDriver(@RequestBody DriverRequest driverRequest) {
        Car car = carMapper.carRequestToCar(driverRequest.getCar());
        Car createdCar = carService.createCar(car);
        URI.create("/cars/" + createdCar.getId());

        Driver driver = driverMapper.driverRequestToDriver(driverRequest);
        Driver createdDriver = driverService.createDriver(driver);
        return ResponseEntity.created(URI.create("/driver/" + createdDriver.getId())).body(createdDriver);
    }

    @GetMapping("/{id}")
    public Driver driver(@PathVariable Long id) {
        return driverService.getDriver(id);
    }

    @GetMapping
    public List<Driver> getDriverList(){
        return driverService.getAllDrivers();
    }


}
