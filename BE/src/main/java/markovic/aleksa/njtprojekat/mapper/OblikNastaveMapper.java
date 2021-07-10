package markovic.aleksa.njtprojekat.mapper;

import markovic.aleksa.njtprojekat.domain.OblikNastave;
import markovic.aleksa.njtprojekat.dto.OblikNastaveDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OblikNastaveMapper {
    OblikNastaveDto oblikNastaveToDto(OblikNastave oblikNastaveDto);
    OblikNastave dtoToOblikNastave(OblikNastaveDto oblikNastave);
}
