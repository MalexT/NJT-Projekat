package markovic.aleksa.njtprojekat.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Modul {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String naziv;
    private int semestar;
    //id od studijskog programa, vise ka jedan
    @ManyToOne()
    @JoinColumn(name ="studijski_program_id")
    private StudijskiProgram studijskiProgram;
    //id predmeta, vise ka vise

    @ManyToMany(mappedBy = "moduli")
    private List<Predmet> predmeti;

}
