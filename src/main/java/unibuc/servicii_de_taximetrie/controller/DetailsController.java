package unibuc.servicii_de_taximetrie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unibuc.servicii_de_taximetrie.model.Car;
import unibuc.servicii_de_taximetrie.model.Client;
import unibuc.servicii_de_taximetrie.model.Details;
import unibuc.servicii_de_taximetrie.model.Driver;
import unibuc.servicii_de_taximetrie.service.ClientService;
import unibuc.servicii_de_taximetrie.service.DetailsService;
import unibuc.servicii_de_taximetrie.service.DriverService;
import unibuc.servicii_de_taximetrie.service.RideService;

import java.util.List;

@RestController
@RequestMapping("/details")
public class DetailsController {

    private DetailsService detailsService;
    private ClientService clientService;
    private DriverService driverService;
    private RideService rideService;

    public DetailsController(DetailsService detailsService, ClientService clientService, DriverService driverService, RideService rideService) {
        this.detailsService = detailsService;
        this.clientService = clientService;
        this.driverService = driverService;
        this.rideService = rideService;
    }

    @GetMapping("/{id}")
    public Details details(@PathVariable Long id) {
        return detailsService.getDetails(id);
    }

    @GetMapping
    public List<Details> getDetailsList(){
        return detailsService.getAllDetailss();
    }

    @GetMapping("/client/{id}")
    public List<Details> detailsListClient(@PathVariable Long id){return detailsService.getAllDetailsWithSpecificClient(id);}

    @GetMapping("/driver/{id}")
    public List<Details> detailsListDriver(@PathVariable Long id){return detailsService.getAllDetailsWithSpecificDriver(id);}

    @GetMapping("/ride/{id}")
    public List<Details> detailsListRide(@PathVariable Long id){return detailsService.getAllDetailsWithSpecificRide(id);}


}
