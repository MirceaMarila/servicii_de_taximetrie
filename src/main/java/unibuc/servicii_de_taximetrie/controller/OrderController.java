package unibuc.servicii_de_taximetrie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unibuc.servicii_de_taximetrie.dto.DriverRequest;
import unibuc.servicii_de_taximetrie.dto.OrderRequest;
import unibuc.servicii_de_taximetrie.mapper.CarMapper;
import unibuc.servicii_de_taximetrie.mapper.DriverMapper;
import unibuc.servicii_de_taximetrie.model.Car;
import unibuc.servicii_de_taximetrie.model.Details;
import unibuc.servicii_de_taximetrie.model.Driver;
import unibuc.servicii_de_taximetrie.service.CarService;
import unibuc.servicii_de_taximetrie.service.DriverService;
import unibuc.servicii_de_taximetrie.service.OrderService;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Details> createDriver(@RequestBody OrderRequest orderRequest) {
        Details createdDetails = orderService.process_order(orderRequest);
        return ResponseEntity.created(URI.create("/orders/" + createdDetails.getId())).body(createdDetails);
    }


}
