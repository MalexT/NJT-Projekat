package markovic.aleksa.njtprojekat.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class OblikNastave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String naziv;

    //id predmeta, vise ka vise
    @ManyToMany(mappedBy = "obliciNastave")
    private List<Predmet> predmeti;
}

