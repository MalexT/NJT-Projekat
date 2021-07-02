package markovic.aleksa.njtprojekat.domain;



import javax.persistence.*;
import java.util.List;

@Entity
public class NivoStudija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String naziv;

    @OneToMany(mappedBy = "nivoStudija")
    private List<StudijskiProgram> studijskiProgrami;

}
