package unibuc.servicii_de_taximetrie.mapper;

import org.springframework.stereotype.Component;
import unibuc.servicii_de_taximetrie.dto.DriverRequest;
import unibuc.servicii_de_taximetrie.model.Driver;

@Component
public class DriverMapper {

    public Driver driverRequestToDriver(DriverRequest driverRequest){
        return new Driver(driverRequest.getName(), driverRequest.get_car_details(), 0, 0, 0, driverRequest.getMoney());
    }
}
