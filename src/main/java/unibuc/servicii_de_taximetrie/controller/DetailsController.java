package unibuc.servicii_de_taximetrie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unibuc.servicii_de_taximetrie.model.Details;
import unibuc.servicii_de_taximetrie.service.DetailsService;

import java.util.List;

@RestController
@RequestMapping("/details")
public class DetailsController {

    private DetailsService detailsService;

    public DetailsController(DetailsService detailsService) {
        this.detailsService = detailsService;
    }

    @GetMapping("/{id}")
    public Details details(@PathVariable Long id) {
        return detailsService.getDetails(id);
    }

    @GetMapping
    public List<Details> getDetailsList(){
        return detailsService.getAllDetailss();
    }


}
