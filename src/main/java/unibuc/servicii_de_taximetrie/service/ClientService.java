package unibuc.servicii_de_taximetrie.service;

import org.springframework.stereotype.Service;
import unibuc.servicii_de_taximetrie.exception.ClientNotFoundException;
import unibuc.servicii_de_taximetrie.exception.DriverNotFoundException;
import unibuc.servicii_de_taximetrie.model.Car;
import unibuc.servicii_de_taximetrie.model.Client;
import unibuc.servicii_de_taximetrie.model.Driver;
import unibuc.servicii_de_taximetrie.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public Client createClient(Client client){
        return clientRepository.save(client);
    }

    public Client getClient(Long id){
        Optional<Client> clientOptional = clientRepository.findById(id);
        if(clientOptional.isPresent()){
            return clientOptional.get();
        }
        else{
            throw new ClientNotFoundException(id);
        }
    }

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }
}
