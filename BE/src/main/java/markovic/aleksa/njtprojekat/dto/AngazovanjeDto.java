package markovic.aleksa.njtprojekat.dto;

import lombok.Data;
import markovic.aleksa.njtprojekat.domain.OblikNastave;

@Data
public class AngazovanjeDto {
    private int nastavno_osoblje_id;
    private int predmet_id;
    private OblikNastave oblikNastave;
}
