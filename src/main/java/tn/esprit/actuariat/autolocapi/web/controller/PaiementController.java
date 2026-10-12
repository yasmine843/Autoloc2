package tn.esprit.actuariat.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Paiement;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IPaiementService;

import java.util.List;

@RestController
@RequestMapping("/api/paiements")
@RequiredArgsConstructor
public class PaiementController {

    private final IPaiementService paiementService;

    @GetMapping
    public List<Paiement> getAll() {
        return paiementService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paiement> getById(@PathVariable Long id) {
        return paiementService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Paiement create(@RequestBody Paiement paiement) {
        return paiementService.save(paiement);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Paiement> update(
            @PathVariable Long id, @RequestBody Paiement paiement) {
        if (paiementService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(paiementService.save(paiement));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (paiementService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        paiementService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
