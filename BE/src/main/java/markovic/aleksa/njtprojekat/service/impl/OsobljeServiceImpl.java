package markovic.aleksa.njtprojekat.service.impl;

import markovic.aleksa.njtprojekat.dto.OsobljeDto;
import markovic.aleksa.njtprojekat.mapper.OsobljeMapper;
import markovic.aleksa.njtprojekat.repositories.OsobljeRepository;
import markovic.aleksa.njtprojekat.service.OsobljeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OsobljeServiceImpl implements OsobljeService {

    OsobljeRepository osobljeRepository;
    OsobljeMapper osobljeMapper;

    public OsobljeServiceImpl(OsobljeRepository osobljeRepository,OsobljeMapper osobljeMapper) {
        this.osobljeRepository = osobljeRepository;
        this.osobljeMapper = osobljeMapper;
    }

    @Override
    public List<OsobljeDto> getAll() {
        return osobljeRepository.findAll().stream().map(osoblje -> osobljeMapper.osobljeToOsobljeDto(osoblje)).collect(Collectors.toList());
    }
}
