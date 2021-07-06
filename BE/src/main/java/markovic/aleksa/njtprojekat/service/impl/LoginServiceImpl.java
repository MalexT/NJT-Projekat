package markovic.aleksa.njtprojekat.service.impl;

import markovic.aleksa.njtprojekat.domain.KorisnickiNalog;
import markovic.aleksa.njtprojekat.dto.KorisnikDto;
import markovic.aleksa.njtprojekat.exceptions.MyEntityDoesntExist;
import markovic.aleksa.njtprojekat.mapper.KorisnikMapper;
import markovic.aleksa.njtprojekat.repositories.KorisnikRepository;
import markovic.aleksa.njtprojekat.service.LoginService;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {
    private KorisnikRepository korisnikRepository;
    private KorisnikMapper korisnikMapper;

    public LoginServiceImpl(KorisnikRepository korisnikRepository,KorisnikMapper korisnikMapper) {
        this.korisnikRepository = korisnikRepository;
        this.korisnikMapper = korisnikMapper;
    }


    @Override
    public KorisnikDto login(String username, String password) {
        Optional<KorisnickiNalog> korisnickiNalog = korisnikRepository.findKorisnickiNalogByUsernameAndPassword(username,password);
        if(korisnickiNalog.isPresent()){
            return korisnikMapper.korisnikToKorisnikDto(korisnickiNalog.get());
        }
        else
            throw new MyEntityDoesntExist("Korisnik sa datim korisnickim imenom i lozinkom ne postoji");
    }
}
