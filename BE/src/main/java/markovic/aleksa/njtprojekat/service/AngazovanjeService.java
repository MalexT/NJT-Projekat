package markovic.aleksa.njtprojekat.service;

import markovic.aleksa.njtprojekat.domain.Angazovanje;
import markovic.aleksa.njtprojekat.domain.AngazovanjePK;
import markovic.aleksa.njtprojekat.dto.AngazovanjeDto;
import markovic.aleksa.njtprojekat.dto.AngazovanjeResponseDto;
import markovic.aleksa.njtprojekat.dto.PredmetDto;

import java.util.List;

public interface AngazovanjeService {

    List<AngazovanjeResponseDto> getAll();
    void deleteById(AngazovanjePK id);
    AngazovanjeResponseDto save(AngazovanjeDto angazovanjeDto);
    AngazovanjeResponseDto update(AngazovanjeDto angazovanjeDto);
}
