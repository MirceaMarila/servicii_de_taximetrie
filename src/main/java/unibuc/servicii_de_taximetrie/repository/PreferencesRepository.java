package unibuc.servicii_de_taximetrie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unibuc.servicii_de_taximetrie.model.Preferences;
import unibuc.servicii_de_taximetrie.model.Ride;

@Repository
public interface PreferencesRepository extends JpaRepository<Preferences, Long> {


}
