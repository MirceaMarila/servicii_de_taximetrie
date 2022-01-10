package unibuc.servicii_de_taximetrie.exception;

public class NoDriversAvailableException extends  RuntimeException{
    public NoDriversAvailableException(){
        super("No drivers available.");
    }
}
