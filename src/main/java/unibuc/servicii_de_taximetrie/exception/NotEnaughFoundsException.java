package unibuc.servicii_de_taximetrie.exception;

public class NotEnaughFoundsException extends  RuntimeException{
    public NotEnaughFoundsException(double price, double balance){
        super("Not enaugh founds! Price:" + price + ", Balance:" + balance);
    }
}
