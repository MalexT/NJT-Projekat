package markovic.aleksa.njtprojekat.domain;

import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.List;

@Entity
public class Predmet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String naziv;
    private String opis;
    private int espb;

    //vise ka vise sa oblikom nastave
    @ManyToMany
    @JoinTable(name="predmet_oblik_nastave",joinColumns =@JoinColumn(name = "predmet_id"),inverseJoinColumns = @JoinColumn(name = "oblik_nastave_id"))
    private List<OblikNastave> obliciNastave;

    //vise ka vise sa modulom
    @ManyToMany
    @JoinTable(name="predmet_modul",joinColumns =@JoinColumn(name = "predmet_id"),inverseJoinColumns = @JoinColumn(name = "modul_id"))
    private List<Modul> moduli;

    // vise ka vise sa sa nastavnim osobljem - anagazovanje pravi se tabela



}
