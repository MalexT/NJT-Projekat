package markovic.aleksa.njtprojekat.controller;


import markovic.aleksa.njtprojekat.domain.Predmet;
import markovic.aleksa.njtprojekat.service.PredmetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/predmet")
public class PredmetController {

    private PredmetService predmetService;

    public PredmetController(PredmetService predmetService) {
        this.predmetService = predmetService;
    }

    @GetMapping
    public List<Predmet> getAll(){
        return predmetService.getAll();
    }
}
