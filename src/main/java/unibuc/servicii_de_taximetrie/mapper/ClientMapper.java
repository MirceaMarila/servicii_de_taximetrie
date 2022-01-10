package unibuc.servicii_de_taximetrie.mapper;

import org.springframework.stereotype.Component;
import unibuc.servicii_de_taximetrie.dto.ClientRequest;
import unibuc.servicii_de_taximetrie.model.Client;

@Component
public class ClientMapper {

    public Client clientRequestToClient(ClientRequest clientRequest){
        return new Client(clientRequest.getName(), 0, clientRequest.getMoney(), 0, 0);
    }
}
