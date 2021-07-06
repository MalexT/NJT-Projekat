package markovic.aleksa.njtprojekat.repositories;

import markovic.aleksa.njtprojekat.domain.KorisnickiNalog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface KorisnikRepository extends JpaRepository<KorisnickiNalog,Integer> {
    Optional<KorisnickiNalog> findKorisnickiNalogByUsernameAndPassword(String username, String password);

}
