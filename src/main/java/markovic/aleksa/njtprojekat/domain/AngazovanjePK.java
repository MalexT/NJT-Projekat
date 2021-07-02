package markovic.aleksa.njtprojekat.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AngazovanjePK implements Serializable {

    private int nastavno_osoblje_id;
    private int predmet_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AngazovanjePK that = (AngazovanjePK) o;
        return nastavno_osoblje_id == that.nastavno_osoblje_id && predmet_id == that.predmet_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nastavno_osoblje_id, predmet_id);
    }
}
