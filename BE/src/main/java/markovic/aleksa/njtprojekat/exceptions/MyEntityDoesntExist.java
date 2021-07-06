package markovic.aleksa.njtprojekat.exceptions;

public class MyEntityDoesntExist extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public MyEntityDoesntExist(String message) {
        super(message);
    }
}
