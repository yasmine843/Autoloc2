package tn.esprit.actuariat.autolocapi.web.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Reservation;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
@RequiredArgsConstructor
public class ReservationController {

    private final IReservationService reservationService;

    @GetMapping
    public List<Reservation> getAll() {
        return reservationService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getById(@PathVariable Long id) {
        return reservationService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Reservation create(@RequestBody Reservation reservation) {
        return reservationService.save(reservation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reservation> update(
            @PathVariable Long id, @RequestBody Reservation reservation) {
        if (reservationService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(reservationService.save(reservation));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (reservationService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        reservationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
