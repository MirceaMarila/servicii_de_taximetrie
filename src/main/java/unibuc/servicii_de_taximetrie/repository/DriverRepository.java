package unibuc.servicii_de_taximetrie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unibuc.servicii_de_taximetrie.model.Client;
import unibuc.servicii_de_taximetrie.model.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {


}
