package markovic.aleksa.njtprojekat.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Univerzitet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String naziv;

    @OneToMany(mappedBy = "univerzitet")
    private List<Fakultet> fakulteti;
}
