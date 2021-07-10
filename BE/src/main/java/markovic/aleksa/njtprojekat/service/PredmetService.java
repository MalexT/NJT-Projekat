package markovic.aleksa.njtprojekat.service;

import markovic.aleksa.njtprojekat.domain.Predmet;
import markovic.aleksa.njtprojekat.dto.PredmetDto;

import java.util.List;
import java.util.Optional;

public interface PredmetService {

    List<PredmetDto> getAll();
    void deleteById(int id);
    PredmetDto save(PredmetDto predmetDto);
    PredmetDto update(PredmetDto predmetDto);
    PredmetDto findById(int id);
}
