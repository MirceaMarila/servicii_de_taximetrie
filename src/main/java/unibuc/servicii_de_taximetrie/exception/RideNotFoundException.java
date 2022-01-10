package unibuc.servicii_de_taximetrie.exception;

public class RideNotFoundException extends  RuntimeException{
    public RideNotFoundException(long id){
        super("Ride with id " + id + " was not found.");
    }
}
