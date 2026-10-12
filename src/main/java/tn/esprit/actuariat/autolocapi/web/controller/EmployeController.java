package tn.esprit.actuariat.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Employe;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IEmployeService;

import java.util.List;

@RestController
@RequestMapping("/api/employes")
@RequiredArgsConstructor
public class EmployeController {

    private final IEmployeService employeService;

    @GetMapping
    public List<Employe> getAll() {
        return employeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employe> getById(@PathVariable Long id) {
        return employeService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Employe create(@RequestBody Employe employe) {
        return employeService.save(employe);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employe> update(
            @PathVariable Long id, @RequestBody Employe employe) {
        if (employeService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(employeService.save(employe));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (employeService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        employeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

