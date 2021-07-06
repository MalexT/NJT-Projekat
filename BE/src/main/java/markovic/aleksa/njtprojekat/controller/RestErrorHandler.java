package markovic.aleksa.njtprojekat.controller;

import markovic.aleksa.njtprojekat.exceptions.MyEntityAlreadyExist;
import markovic.aleksa.njtprojekat.exceptions.MyEntityDoesntExist;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestErrorHandler {

    @ExceptionHandler(MyEntityDoesntExist.class)
    @ResponseBody
    public ResponseEntity notFound(MyEntityDoesntExist ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(MyEntityAlreadyExist.class)
    @ResponseBody
    public ResponseEntity alreadyExist(MyEntityAlreadyExist ex) {
        return ResponseEntity.status(409).body(ex.getMessage());
    }


}
