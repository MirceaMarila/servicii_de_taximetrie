package unibuc.servicii_de_taximetrie.exception;

public class CarNotFoundException extends RuntimeException{

    public CarNotFoundException(long id){
        super("Car with id" + id + " was not found.");
    }
}
