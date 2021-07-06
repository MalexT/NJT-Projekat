package markovic.aleksa.njtprojekat.mapper;

import markovic.aleksa.njtprojekat.domain.Predmet;
import markovic.aleksa.njtprojekat.dto.PredmetDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PredmetMapper {

    PredmetDto predmetToPredmetDto(Predmet predmet);

    Predmet predmetDtoToPredmet(PredmetDto predmetDto);
}
