package markovic.aleksa.njtprojekat.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Angazovanje {
    @EmbeddedId
    private AngazovanjePK angazovanjePK = new AngazovanjePK();

    @ManyToOne
    @MapsId("predmet_id")
    private Predmet predmet;

    @ManyToOne
    @MapsId("nastavno_osoblje_id")
    private NastavnoOsoblje nastavnoOsoblje;

    @ManyToOne
    @JoinColumn(name = "oblik_nastave_id")
    private OblikNastave oblikNastave;
}
