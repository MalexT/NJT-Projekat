package markovic.aleksa.njtprojekat.service.impl;

import markovic.aleksa.njtprojekat.domain.Angazovanje;
import markovic.aleksa.njtprojekat.domain.AngazovanjePK;
import markovic.aleksa.njtprojekat.dto.AngazovanjeDto;
import markovic.aleksa.njtprojekat.dto.AngazovanjeResponseDto;
import markovic.aleksa.njtprojekat.exceptions.MyEntityAlreadyExist;
import markovic.aleksa.njtprojekat.mapper.AngazovanjeMapper;
import markovic.aleksa.njtprojekat.mapper.OsobljeMapper;
import markovic.aleksa.njtprojekat.mapper.PredmetMapper;
import markovic.aleksa.njtprojekat.repositories.AngazovanjeRepository;
import markovic.aleksa.njtprojekat.repositories.NastavnoOsobljeRepository;
import markovic.aleksa.njtprojekat.repositories.PredmetRepository;
import markovic.aleksa.njtprojekat.service.AngazovanjeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AngazovanjeServiceImpl implements AngazovanjeService {

    AngazovanjeRepository angazovanjeRepository;
    PredmetRepository predmetRepository;
    NastavnoOsobljeRepository nastavnoOsobljeRepository;
    AngazovanjeMapper angazovanjeMapper;
    OsobljeMapper osobljeMapper;
    PredmetMapper predmetMapper;

    public AngazovanjeServiceImpl(AngazovanjeRepository angazovanjeRepository, PredmetRepository predmetRepository, NastavnoOsobljeRepository nastavnoOsobljeRepository, AngazovanjeMapper angazovanjeMapper, OsobljeMapper osobljeMapper, PredmetMapper predmetMapper) {
        this.angazovanjeRepository = angazovanjeRepository;
        this.predmetRepository = predmetRepository;
        this.nastavnoOsobljeRepository = nastavnoOsobljeRepository;
        this.angazovanjeMapper = angazovanjeMapper;
        this.osobljeMapper = osobljeMapper;
        this.predmetMapper = predmetMapper;
    }

    @Override
    public List<AngazovanjeResponseDto> getAll() {

        return angazovanjeRepository.findAll().stream().map(angazovanje ->
                angazovanjeMapper.angozavanjeToAngazovanjeDto(angazovanje)).collect(Collectors.toList());
    }

    @Override
    public void deleteById(AngazovanjePK angazovanjePK) {
        angazovanjeRepository.deleteById(angazovanjePK);
    }

    @Override
    public AngazovanjeResponseDto save(AngazovanjeDto angazovanjeDto) {
        Optional<Angazovanje> angazovanje = angazovanjeRepository.findById(new AngazovanjePK(angazovanjeDto.getPredmet_id(),angazovanjeDto.getNastavno_osoblje_id()));
        if(!angazovanje.isPresent()){
            Angazovanje angazovanje1 = angazovanje.get();
            angazovanje1.setPredmet(predmetRepository.getById((angazovanjeDto.getPredmet_id())));
            angazovanje1.setOblikNastave(angazovanjeDto.getOblikNastave());
            angazovanje1.setNastavnoOsoblje(nastavnoOsobljeRepository.getById(angazovanjeDto.getNastavno_osoblje_id()));
            angazovanjeRepository.save(angazovanje1);
            return angazovanjeMapper.angozavanjeToAngazovanjeDto(angazovanje1);
        }
        else {
            throw new MyEntityAlreadyExist("Angazovanje za dati predmet vec postoji");
        }
    }

}
