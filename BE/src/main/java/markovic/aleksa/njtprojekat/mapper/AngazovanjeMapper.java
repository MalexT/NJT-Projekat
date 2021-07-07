package markovic.aleksa.njtprojekat.mapper;

import markovic.aleksa.njtprojekat.domain.Angazovanje;
import markovic.aleksa.njtprojekat.domain.AngazovanjePK;
import markovic.aleksa.njtprojekat.dto.AngazovanjeDto;
import markovic.aleksa.njtprojekat.dto.AngazovanjeResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Optional;

@Mapper(componentModel = "spring",uses = {OsobljeMapper.class,PredmetMapper.class,OblikNastaveMapper.class})
public interface AngazovanjeMapper {


    @Mapping(source = "angazovanje.predmet", target = "predmetDto")
    @Mapping(source = "angazovanje.nastavnoOsoblje", target = "osobljeDto")
    public AngazovanjeResponseDto angozavanjeToAngazovanjeDto(Angazovanje angazovanje);
}
