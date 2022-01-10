package unibuc.servicii_de_taximetrie.exception;

public class DriverNotFoundException extends  RuntimeException{
    public DriverNotFoundException(long id){
        super("Driver with id" + id + " was not found.");
    }
}
