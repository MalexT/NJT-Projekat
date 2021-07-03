package markovic.aleksa.njtprojekat.exceptions;

public class MyEntityAlreadyExist extends RuntimeException{
    public MyEntityAlreadyExist(String message) {
        super(message);
    }
}
