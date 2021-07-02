package markovic.aleksa.njtprojekat.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NastavnoOsoblje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String ime;
    private String prezime;
    private String jmbg;

    //vise ka vise sa predmetom - angazovanje tabela

    //korisnicki nalog many to one sa ignorom
}
