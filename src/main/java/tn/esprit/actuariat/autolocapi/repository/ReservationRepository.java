package tn.esprit.actuariat.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.actuariat.autolocapi.domain.Reservation;

    public interface ReservationRepository
            extends JpaRepository<Reservation, Long> {
    }