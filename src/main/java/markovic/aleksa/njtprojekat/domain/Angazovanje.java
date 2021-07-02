package markovic.aleksa.njtprojekat.domain;

import javax.persistence.*;

@Entity
public class Angazovanje {
    @EmbeddedId
    private AngazovanjePK angazovanjePK;

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
