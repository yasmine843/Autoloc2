package tn.esprit.actuariat.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Maintenance;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IMaintenanceService;

import java.util.List;

@RestController
@RequestMapping("/api/maintenances")
@RequiredArgsConstructor
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;

    @GetMapping
    public List<Maintenance> getAll() {
        return maintenanceService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Maintenance> getById(@PathVariable Long id) {
        return maintenanceService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Maintenance create(@RequestBody Maintenance maintenance) {
        return maintenanceService.save(maintenance);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Maintenance> update(
            @PathVariable Long id, @RequestBody Maintenance maintenance) {
        if (maintenanceService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(maintenanceService.save(maintenance));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (maintenanceService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        maintenanceService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}