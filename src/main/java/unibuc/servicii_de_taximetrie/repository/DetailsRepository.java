package unibuc.servicii_de_taximetrie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import unibuc.servicii_de_taximetrie.model.Client;
import unibuc.servicii_de_taximetrie.model.Details;
import unibuc.servicii_de_taximetrie.model.Ride;

import java.util.List;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Long> {

    @Query(value = "select * from details d join clients c where c.id = d.client_id and c.id = :id", nativeQuery = true)
    List<Details> getAllDetailsWithSpecificClient(long id);

    @Query(value = "select * from details d join drivers c where c.id = d.driver_id and c.id = :id", nativeQuery = true)
    List<Details> getAllDetailsWithSpecificDriver(long id);

    @Query(value = "select * from details d join rides c where c.id = d.ride_id and c.id = :id", nativeQuery = true)
    List<Details> getAllDetailsWithSpecificRide(long id);

}
