package unibuc.servicii_de_taximetrie;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import unibuc.servicii_de_taximetrie.model.Client;
import unibuc.servicii_de_taximetrie.repository.ClientRepository;
import unibuc.servicii_de_taximetrie.service.ClientService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {

    @Mock
    private ClientRepository clientRepository;
    @InjectMocks
    private ClientService clientService;

    @Test
    @DisplayName("Create client")
    void create(){

        Client client = new Client();
        client.setMoney(10);
        Client savedClient = new Client(112221, "Gelu", 0, 200, 5, 3);

        when(clientRepository.save(client)).thenReturn(savedClient);

        Client result = clientService.createClient(client);

        assertNotNull(result);
        assertEquals(savedClient.getId(), result.getId());

    }

}
