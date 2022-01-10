package unibuc.servicii_de_taximetrie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unibuc.servicii_de_taximetrie.model.Details;
import unibuc.servicii_de_taximetrie.model.Ride;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Long> {


}
