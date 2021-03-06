package markovic.aleksa.njtprojekat.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PredmetDto {
    private int id;
    private String naziv;
    private String opis;
    private int espb;
    private List<OblikNastaveDto> obliciNastave;

}
