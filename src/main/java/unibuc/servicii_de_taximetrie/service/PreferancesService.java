package unibuc.servicii_de_taximetrie.service;

import org.springframework.stereotype.Service;
import unibuc.servicii_de_taximetrie.exception.PreferencesNotFoundException;
import unibuc.servicii_de_taximetrie.model.Preferences;
import unibuc.servicii_de_taximetrie.repository.PreferencesRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PreferancesService {

    private PreferencesRepository preferencesRepository;

    public PreferancesService(PreferencesRepository preferencesRepository){
        this.preferencesRepository = preferencesRepository;
    }

    public Preferences createPreferences(Preferences preferences){
        return preferencesRepository.save(preferences);
    }

    public Preferences getPreferences(Long id){
        Optional<Preferences> preferencesOptional = preferencesRepository.findById(id);
        if(preferencesOptional.isPresent()){
            return preferencesOptional.get();
        }
        else{
            throw new PreferencesNotFoundException(id);
        }
    }

    public List<Preferences> getAllPreferencess(){
        return preferencesRepository.findAll();
    }
}
