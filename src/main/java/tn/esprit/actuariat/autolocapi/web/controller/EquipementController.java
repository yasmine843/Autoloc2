package tn.esprit.actuariat.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Equipement;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IEquipementService;

import java.util.List;

@RestController
@RequestMapping("/api/equipements")
@RequiredArgsConstructor
public class EquipementController {

    private final IEquipementService equipementService;

    @GetMapping
    public List<Equipement> getAll() {
        return equipementService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipement> getById(@PathVariable Long id) {
        return equipementService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Equipement create(@RequestBody Equipement equipement) {
        return equipementService.save(equipement);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Equipement> update(
            @PathVariable Long id, @RequestBody Equipement equipement) {
        if (equipementService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(equipementService.save(equipement));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (equipementService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        equipementService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

