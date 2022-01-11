package unibuc.servicii_de_taximetrie;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.stereotype.Service;
import unibuc.servicii_de_taximetrie.exception.CarNotFoundException;
import unibuc.servicii_de_taximetrie.exception.DriverNotFoundException;
import unibuc.servicii_de_taximetrie.model.Car;
import unibuc.servicii_de_taximetrie.model.CarColors;
import unibuc.servicii_de_taximetrie.model.Driver;
import unibuc.servicii_de_taximetrie.repository.CarRepository;
import unibuc.servicii_de_taximetrie.repository.DriverRepository;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import unibuc.servicii_de_taximetrie.service.CarService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class CarServiceTest {

    @Mock
    private CarRepository carRepository;
    @InjectMocks
    private CarService carService;

    @Test
    @DisplayName("Create car")
    void create(){

        Car car = new Car();
        car.setPlate("B 02 ERU");
        Car savedCar = new Car(1000,"Dacia Logan", "B 01 ERU", CarColors.BLUE, 2004);

        when(carRepository.save(car)).thenReturn(savedCar);

        Car result = carService.createCar(car);

        assertNotNull(result);
        assertEquals(savedCar.getId(), result.getId());

    }

}
