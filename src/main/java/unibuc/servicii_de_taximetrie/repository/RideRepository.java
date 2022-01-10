package unibuc.servicii_de_taximetrie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import unibuc.servicii_de_taximetrie.model.Driver;
import unibuc.servicii_de_taximetrie.model.Ride;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {

    @Query(value = "select * from rides r where r.destination = :ddestionation and r.location = :llocation", nativeQuery = true)
    Ride getDistanceByDestionationAndLocation(String ddestionation, String llocation);

}
