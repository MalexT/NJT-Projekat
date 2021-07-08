package markovic.aleksa.njtprojekat.controller;


import markovic.aleksa.njtprojekat.dto.OsobljeDto;
import markovic.aleksa.njtprojekat.service.OsobljeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/osoblje")
@CrossOrigin("*")
public class OsobljeController {
    OsobljeService osobljeService;

    public OsobljeController(OsobljeService osobljeService) {
        this.osobljeService = osobljeService;
    }

    @GetMapping
    public List<OsobljeDto> getAll(){
        return osobljeService.getAll();
    }

}
