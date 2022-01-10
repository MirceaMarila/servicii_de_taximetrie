package unibuc.servicii_de_taximetrie.mapper;

import unibuc.servicii_de_taximetrie.dto.CarRequest;
import unibuc.servicii_de_taximetrie.model.Car;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    public Car carRequestToCar(CarRequest carRequest){
        return new Car(carRequest.getBrandModel(), carRequest.getPlate(), carRequest.getColor(), carRequest.getYear());
    }
}
