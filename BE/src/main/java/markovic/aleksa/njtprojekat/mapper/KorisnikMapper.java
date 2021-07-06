package markovic.aleksa.njtprojekat.mapper;

import markovic.aleksa.njtprojekat.domain.KorisnickiNalog;
import markovic.aleksa.njtprojekat.dto.KorisnikDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KorisnikMapper {
    KorisnikDto korisnikToKorisnikDto(KorisnickiNalog korisnickiNalog);
    KorisnickiNalog korisnikDtoToKorisnik(KorisnikDto korisnikDto);

}
