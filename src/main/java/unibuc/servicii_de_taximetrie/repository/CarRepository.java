package unibuc.servicii_de_taximetrie.repository;

import org.springframework.data.jpa.repository.Query;
import unibuc.servicii_de_taximetrie.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;
import unibuc.servicii_de_taximetrie.model.Ride;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query(value = "select * from cars c join drivers d where c.id = d.id and d.id = :id", nativeQuery = true)
    Optional<Car> getDriverCar(long id);

}
