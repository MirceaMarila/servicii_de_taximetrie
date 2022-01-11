package unibuc.servicii_de_taximetrie;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import unibuc.servicii_de_taximetrie.model.Details;
import unibuc.servicii_de_taximetrie.repository.DetailsRepository;
import unibuc.servicii_de_taximetrie.service.DetailsService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DetailsServiceTest {

    @Mock
    private DetailsRepository detailsRepository;
    @InjectMocks
    private DetailsService detailsService;

    @Test
    @DisplayName("Create details")
    void create(){

        Details details = new Details();
        details.setDriver("Gelu");
        Details savedDetails = new Details(3212321, "Gelu", "Nelu", "ride", "String preferences", 123, "String carDetails", 321, 421421,5215);

        when(detailsRepository.save(details)).thenReturn(savedDetails);

        Details result = detailsService.createDetails(details);

        assertNotNull(result);
        assertEquals(savedDetails.getId(), result.getId());

    }

}
