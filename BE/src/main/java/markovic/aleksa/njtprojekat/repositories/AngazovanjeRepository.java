package markovic.aleksa.njtprojekat.repositories;

import markovic.aleksa.njtprojekat.domain.Angazovanje;
import markovic.aleksa.njtprojekat.domain.AngazovanjePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AngazovanjeRepository extends JpaRepository<Angazovanje, AngazovanjePK> {
}
