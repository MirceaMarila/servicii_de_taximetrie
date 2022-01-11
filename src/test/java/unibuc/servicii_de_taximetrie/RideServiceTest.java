package unibuc.servicii_de_taximetrie;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import unibuc.servicii_de_taximetrie.model.Ride;
import unibuc.servicii_de_taximetrie.repository.RideRepository;
import unibuc.servicii_de_taximetrie.service.RideService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RideServiceTest {

    @Mock
    private RideRepository rideRepository;
    @InjectMocks
    private RideService rideService;

    @Test
    @DisplayName("Create ride")
    void create(){

        Ride ride = new Ride();
        ride.setLocation("locatie");
        Ride savedRide = new Ride(3213123, "String location", "String destination");

        when(rideRepository.save(ride)).thenReturn(savedRide);

        Ride result = rideService.createRide(ride);

        assertNotNull(result);
        assertEquals(savedRide.getId(), result.getId());

    }

}
