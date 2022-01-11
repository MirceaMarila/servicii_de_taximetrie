package unibuc.servicii_de_taximetrie;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import unibuc.servicii_de_taximetrie.model.MusicalGenres;
import unibuc.servicii_de_taximetrie.model.Preferences;
import unibuc.servicii_de_taximetrie.repository.PreferencesRepository;
import unibuc.servicii_de_taximetrie.service.PreferencesService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PreferencesServiceTest {

    @Mock
    private PreferencesRepository preferencesRepository;
    @InjectMocks
    private PreferencesService preferencesService;

    @Test
    @DisplayName("Create preferences")
    void create(){

        Preferences preferences = new Preferences();
        preferences.setFastRide(true);
        Preferences savedPreferences = new Preferences(321321, MusicalGenres.POP, 12, true, true, true);

        when(preferencesRepository.save(preferences)).thenReturn(savedPreferences);

        Preferences result = preferencesService.createPreferences(preferences);

        assertNotNull(result);
        assertEquals(savedPreferences.getId(), result.getId());

    }

}
