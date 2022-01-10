package unibuc.servicii_de_taximetrie.repository;

import unibuc.servicii_de_taximetrie.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {


}
