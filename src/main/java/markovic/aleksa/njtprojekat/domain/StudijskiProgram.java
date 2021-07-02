package markovic.aleksa.njtprojekat.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class StudijskiProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String naziv;
    private boolean modul;
    private String status;

    //ako nam treba da izlistamo koje sve module ima neki studijski program
    @OneToMany(mappedBy = "studijskiProgram")
    private List<Modul> moduli;
    //id fakulteta,vise ka jedan

    //id nivo studija, vise ka jedan
    @ManyToOne
    @JoinColumn(name = "studijski_program_id")
    private NivoStudija nivoStudija;
}
