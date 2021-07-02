package markovic.aleksa.njtprojekat.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Predmet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String naziv;
    private String opis;
    private int espb;


}
