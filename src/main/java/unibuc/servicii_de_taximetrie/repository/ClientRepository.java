package unibuc.servicii_de_taximetrie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unibuc.servicii_de_taximetrie.model.Car;
import unibuc.servicii_de_taximetrie.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
