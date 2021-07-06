package markovic.aleksa.njtprojekat.service;

import markovic.aleksa.njtprojekat.dto.KorisnikDto;

public interface LoginService {

    KorisnikDto login(String username,String password);
}
