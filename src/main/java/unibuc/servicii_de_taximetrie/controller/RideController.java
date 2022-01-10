package unibuc.servicii_de_taximetrie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unibuc.servicii_de_taximetrie.model.Ride;
import unibuc.servicii_de_taximetrie.service.RideService;

import java.util.List;

@RestController
@RequestMapping("/rides")
public class RideController {

    private RideService rideService;

    public RideController(RideService rideService) {
        this.rideService = rideService;
    }

    @GetMapping("/{id}")
    public Ride ride(@PathVariable Long id) {
        return rideService.getRide(id);
    }

    @GetMapping
    public List<Ride> getRideList(){
        return rideService.getAllRides();
    }


}
