package unibuc.servicii_de_taximetrie.exception;

public class PreferencesNotFoundException extends  RuntimeException{
    public PreferencesNotFoundException(long id){
        super("Preferences with id " + id + " was not found.");
    }
}
