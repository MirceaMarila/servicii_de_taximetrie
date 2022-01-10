package unibuc.servicii_de_taximetrie.service;

import org.springframework.stereotype.Service;
import unibuc.servicii_de_taximetrie.exception.DetailsNotFoundException;
import unibuc.servicii_de_taximetrie.model.Details;
import unibuc.servicii_de_taximetrie.repository.DetailsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DetailsService {

    private DetailsRepository detailsRepository;

    public DetailsService(DetailsRepository detailsRepository){
        this.detailsRepository = detailsRepository;
    }

    public Details createDetails(Details details){
        return detailsRepository.save(details);
    }

    public Details getDetails(Long id){
        Optional<Details> detailsOptional = detailsRepository.findById(id);
        if(detailsOptional.isPresent()){
            return detailsOptional.get();
        }
        else{
            throw new DetailsNotFoundException(id);
        }
    }

    public List<Details> getAllDetailss(){
        return detailsRepository.findAll();
    }
}
