package tn.esprit.actuariat.autolocapi.web.controller;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tn.esprit.actuariat.autolocapi.domain.Client;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IClientService;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
@AllArgsConstructor
public class ClientController {

    private final IClientService clientService;

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(
            @PathVariable Long id) {
        return clientService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientService.save(client);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(
            @PathVariable Long id,
            @RequestBody Client client) {

        if (clientService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(clientService.save(client));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(
            @PathVariable Long id) {

        if (clientService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        clientService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
