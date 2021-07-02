package markovic.aleksa.njtprojekat.repositories;

import markovic.aleksa.njtprojekat.domain.Predmet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PredmetRepository extends JpaRepository<Predmet,Integer> {
}
