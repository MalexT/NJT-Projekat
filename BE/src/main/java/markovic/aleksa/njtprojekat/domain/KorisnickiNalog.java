package markovic.aleksa.njtprojekat.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class KorisnickiNalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;

    // korisnicki nalog ima jednu rolu
    @ManyToOne
    @JoinColumn(name="rola_id")
    private Rola rola;

    @OneToOne(optional = false)
    @JoinColumn(name = "nastavno_osoblje_id")
    private NastavnoOsoblje nastavnoOsoblje;
}
