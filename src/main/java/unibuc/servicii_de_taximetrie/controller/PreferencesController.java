package unibuc.servicii_de_taximetrie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unibuc.servicii_de_taximetrie.model.Preferences;
import unibuc.servicii_de_taximetrie.service.PreferencesService;

import java.util.List;

@RestController
@RequestMapping("/preferences")
public class PreferencesController {

    private PreferencesService preferencesService;

    public PreferencesController(PreferencesService preferencesService) {
        this.preferencesService = preferencesService;
    }

    @GetMapping("/{id}")
    public Preferences preferences(@PathVariable Long id) {
        return preferencesService.getPreferences(id);
    }

    @GetMapping
    public List<Preferences> getPreferencesList(){
        return preferencesService.getAllPreferencess();
    }


}
