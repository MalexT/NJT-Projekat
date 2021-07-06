package markovic.aleksa.njtprojekat.dto;

import lombok.Data;
import markovic.aleksa.njtprojekat.domain.Rola;
@Data
public class KorisnikDto {
    private int id;
    private String username;
    private Rola rola;
    private OsobljeDto nastavnoOsoblje;

}
