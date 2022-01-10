package unibuc.servicii_de_taximetrie.exception;

public class DetailsNotFoundException extends  RuntimeException{
    public DetailsNotFoundException(long id){
        super("Details with id " + id + " was not found.");
    }
}
