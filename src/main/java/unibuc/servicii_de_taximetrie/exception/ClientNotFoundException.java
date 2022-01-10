package unibuc.servicii_de_taximetrie.exception;

public class ClientNotFoundException extends  RuntimeException{
    public ClientNotFoundException(long id){
        super("Client with id " + id + " was not found.");
    }
}
