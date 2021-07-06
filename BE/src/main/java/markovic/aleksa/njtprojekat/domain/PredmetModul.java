package markovic.aleksa.njtprojekat.domain;

import javax.persistence.*;

@Entity
public class PredmetModul {


    @EmbeddedId
    private PredmetModulPK predmetModulPK;

    private int semestar;

    @ManyToOne
    @MapsId("predmet_id")
    private Predmet predmet;

    @ManyToOne
    @MapsId("modul_id")
    private Modul modul;
}
