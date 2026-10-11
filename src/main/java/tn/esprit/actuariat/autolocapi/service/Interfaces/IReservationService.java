package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Reservation;

import java.util.List;
import java.util.Optional;

public interface IReservationService {

    Reservation save(Reservation reservation);

    List<Reservation> findAll();

    Optional<Reservation> findById(Long id);

    void deleteById(Long id);
}