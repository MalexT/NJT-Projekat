package markovic.aleksa.njtprojekat.controller;

import markovic.aleksa.njtprojekat.domain.Angazovanje;
import markovic.aleksa.njtprojekat.domain.AngazovanjePK;
import markovic.aleksa.njtprojekat.dto.AngazovanjeDto;
import markovic.aleksa.njtprojekat.dto.AngazovanjeResponseDto;
import markovic.aleksa.njtprojekat.dto.PredmetDto;
import markovic.aleksa.njtprojekat.service.AngazovanjeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/angazovanje")
@CrossOrigin("*")
public class AngazovanjeController {
    AngazovanjeService angazovanjeService;

    public AngazovanjeController(AngazovanjeService angazovanjeService) {
        this.angazovanjeService = angazovanjeService;
    }

    @GetMapping
    public List<AngazovanjeResponseDto> getAll(){
        return angazovanjeService.getAll();
    }

    @PostMapping("/delete")
    public ResponseEntity<Object> deleteById(@RequestBody AngazovanjePK angazovanjePK) {
        System.out.println(angazovanjePK);
        angazovanjeService.deleteById(angazovanjePK);
        return ResponseEntity.status(HttpStatus.OK).body("Angazovanje za dati predmet je izbrisano");

    }

    @PostMapping
    public ResponseEntity addNewAngazovanje(@RequestBody AngazovanjeDto angazovanjeDto){
        return ResponseEntity.status(201).body(angazovanjeService.save(angazovanjeDto));
    }
    @PutMapping
    public ResponseEntity updateAngazovanje(@RequestBody AngazovanjeDto angazovanjeDto){
        return ResponseEntity.status(201).body(angazovanjeService.update(angazovanjeDto));
    }



    @PutMapping
    public ResponseEntity updateAngazovanje(@RequestBody AngazovanjeDto angazovanjeDto){
        return ResponseEntity.status(201).body(angazovanjeService.update(angazovanjeDto));
    }

}
