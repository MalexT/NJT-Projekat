package markovic.aleksa.njtprojekat.dto;

import lombok.Data;
import markovic.aleksa.njtprojekat.domain.OblikNastave;
@Data
public class AngazovanjeResponseDto {
   private PredmetDto predmetDto;
    private OblikNastaveDto oblikNastave;
    private OsobljeDto osobljeDto;
}
