package markovic.aleksa.njtprojekat.domain;

import javax.persistence.*;

@Entity
public class NastavnoOsoblje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String ime;
    private String prezime;
    private String jmbg;

    //vise ka vise sa predmetom - angazovanje tabela

    //moze a i ne mora imati korisnicki nalog
    @OneToOne(optional = true)
    private KorisnickiNalog korisnickiNalog;


    @ManyToOne
    @JoinColumn(name="zvanje_id")
    private Zvanje zvanje;
}
