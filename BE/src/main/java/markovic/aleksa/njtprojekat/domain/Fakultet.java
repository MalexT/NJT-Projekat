package markovic.aleksa.njtprojekat.domain;

import javax.persistence.*;

@Entity
public class Fakultet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String naziv;
    private String adresa;

    //id od univerziteta, vise ka jedan

    @ManyToOne
    @JoinColumn(name="univerzitet_id")
    private Univerzitet univerzitet;


}
