package repository;

import model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {


}
