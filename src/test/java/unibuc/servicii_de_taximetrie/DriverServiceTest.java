package unibuc.servicii_de_taximetrie;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import unibuc.servicii_de_taximetrie.model.Driver;
import unibuc.servicii_de_taximetrie.repository.DriverRepository;
import unibuc.servicii_de_taximetrie.service.DriverService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DriverServiceTest {

    @Mock
    private DriverRepository driverRepository;
    @InjectMocks
    private DriverService driverService;

    @Test
    @DisplayName("Create driver")
    void create(){

        Driver driver = new Driver();
        driver.setName("Gelu");
        Driver savedDriver = new Driver(124124, "String name", "String carDetails", 214, 421, 532, 453);

        when(driverRepository.save(driver)).thenReturn(savedDriver);

        Driver result = driverService.createDriver(driver);

        assertNotNull(result);
        assertEquals(savedDriver.getId(), result.getId());

    }

}
