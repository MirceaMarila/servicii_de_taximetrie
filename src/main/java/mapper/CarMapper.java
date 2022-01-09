package mapper;

import dto.CarRequest;
import model.Car;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    public Car carRequestToCar(CarRequest carRequest){
        return new Car(carRequest.getMarca(), carRequest.getModel(), carRequest.getCuloare(), carRequest.getAn_fabricatie());
    }
}
