package markovic.aleksa.njtprojekat.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PredmetDto {
    private Integer id;
    private String naziv;
    private String opis;
    private int espb;
    private boolean aktivan;
    private List<OblikNastaveDto> obliciNastave;

}
