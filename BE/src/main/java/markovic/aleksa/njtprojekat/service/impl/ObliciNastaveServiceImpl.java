package markovic.aleksa.njtprojekat.service.impl;

import markovic.aleksa.njtprojekat.dto.OblikNastaveDto;
import markovic.aleksa.njtprojekat.mapper.OblikNastaveMapper;
import markovic.aleksa.njtprojekat.mapper.OsobljeMapper;
import markovic.aleksa.njtprojekat.repositories.NastavnoOsobljeRepository;
import markovic.aleksa.njtprojekat.repositories.ObliciNastaveRepository;
import markovic.aleksa.njtprojekat.service.ObliciNastaveService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ObliciNastaveServiceImpl implements ObliciNastaveService {
   ObliciNastaveRepository obliciNastaveRepository;
   OblikNastaveMapper oblikNastaveMapper;

    public ObliciNastaveServiceImpl(ObliciNastaveRepository obliciNastaveRepository, OblikNastaveMapper oblikNastaveMapper) {
        this.obliciNastaveRepository = obliciNastaveRepository;
        this.oblikNastaveMapper = oblikNastaveMapper;
    }

    @Override
    public List<OblikNastaveDto> getAll() {
        return  obliciNastaveRepository.findAll().stream().map(oblikNastave -> oblikNastaveMapper.oblikNastaveToDto(oblikNastave)).collect(Collectors.toList());

    }
}
