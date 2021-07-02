package markovic.aleksa.njtprojekat.service.impl;

import markovic.aleksa.njtprojekat.domain.Predmet;
import markovic.aleksa.njtprojekat.repositories.PredmetRepository;
import markovic.aleksa.njtprojekat.service.PredmetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PredmetServiceImpl implements PredmetService {
    private PredmetRepository predmetRepository;

    public PredmetServiceImpl(PredmetRepository predmetRepository) {
        this.predmetRepository = predmetRepository;
    }

    @Override
    public List<Predmet> getAll() {
        return predmetRepository.findAll();
    }
}
