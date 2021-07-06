package markovic.aleksa.njtprojekat.controller;

import markovic.aleksa.njtprojekat.dto.KorisnikDto;
import markovic.aleksa.njtprojekat.dto.LoginDto;
import markovic.aleksa.njtprojekat.service.LoginService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/login")
public class LoginController {

    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public KorisnikDto login(@RequestBody LoginDto loginDto){
        return loginService.login(loginDto.getUsername(),loginDto.getPassword());
    }
}
