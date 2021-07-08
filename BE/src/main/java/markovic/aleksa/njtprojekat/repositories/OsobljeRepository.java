package markovic.aleksa.njtprojekat.repositories;

import markovic.aleksa.njtprojekat.domain.NastavnoOsoblje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OsobljeRepository extends JpaRepository<NastavnoOsoblje,Integer> {
}
