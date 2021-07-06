package markovic.aleksa.njtprojekat.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class PredmetModulPK implements Serializable {

    private static final long serialVersionUID = 1L;


    private int predmet_id;
    private int modul_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PredmetModulPK that = (PredmetModulPK) o;
        return predmet_id == that.predmet_id && modul_id == that.modul_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(predmet_id, modul_id);
    }
}
