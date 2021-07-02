package markovic.aleksa.njtprojekat.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Predmet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String naziv;
    private String opis;
    private int espb;

    //vise ka vise sa oblikom nastave

    //vise ka vise sa modulom

    // vise ka vise sa sa nastavnim osobljem



}
