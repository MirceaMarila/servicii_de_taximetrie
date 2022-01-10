package unibuc.servicii_de_taximetrie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unibuc.servicii_de_taximetrie.dto.ClientRequest;
import unibuc.servicii_de_taximetrie.mapper.ClientMapper;
import unibuc.servicii_de_taximetrie.model.Client;
import unibuc.servicii_de_taximetrie.service.ClientService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private ClientService clientService;
    private ClientMapper clientMapper;

    public ClientController(ClientService clientService, ClientMapper clientMapper) {
        this.clientService = clientService;
        this.clientMapper = clientMapper;
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody ClientRequest clientRequest) {
        Client client = clientMapper.clientRequestToClient(clientRequest);
        Client createdClient = clientService.createClient(client);
        return ResponseEntity.created(URI.create("/client/" + createdClient.getId())).body(createdClient);
    }

    @GetMapping("/{id}")
    public Client client(@PathVariable Long id) {
        return clientService.getClient(id);
    }

    @GetMapping
    public List<Client> getClientList(){
        return clientService.getAllClients();
    }


}
