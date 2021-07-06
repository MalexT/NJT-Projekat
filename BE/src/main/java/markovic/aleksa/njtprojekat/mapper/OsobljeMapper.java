package markovic.aleksa.njtprojekat.mapper;

import markovic.aleksa.njtprojekat.domain.NastavnoOsoblje;
import markovic.aleksa.njtprojekat.dto.OsobljeDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OsobljeMapper {
    OsobljeDto osobljeToOsobljeDto(NastavnoOsoblje nastavnoOsoblje);
    NastavnoOsoblje osobljeDtoToOsoblje(OsobljeDto osobljeDto);
}
