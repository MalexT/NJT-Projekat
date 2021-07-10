package markovic.aleksa.njtprojekat.controller;

import markovic.aleksa.njtprojekat.dto.OblikNastaveDto;
import markovic.aleksa.njtprojekat.service.ObliciNastaveService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/oblikNastave")
@CrossOrigin("*")
public class OblikNastaveController {
    ObliciNastaveService obliciNastaveService;

    public OblikNastaveController(ObliciNastaveService obliciNastaveService) {
        this.obliciNastaveService = obliciNastaveService;
    }

    @GetMapping
    List<OblikNastaveDto> getAll(){
        return obliciNastaveService.getAll();

    }
}
