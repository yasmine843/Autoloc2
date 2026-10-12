package tn.esprit.actuariat.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Contrat;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IContratService;

import java.util.List;

@RestController
@RequestMapping("/api/contrats")
@RequiredArgsConstructor
public class ContratController {

    private final IContratService contratService;

    @GetMapping
    public List<Contrat> getAll() {
        return contratService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contrat> getById(@PathVariable Long id) {
        return contratService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Contrat create(@RequestBody Contrat contrat) {
        return contratService.save(contrat);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contrat> update(
            @PathVariable Long id, @RequestBody Contrat contrat) {
        if (contratService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(contratService.save(contrat));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (contratService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        contratService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
