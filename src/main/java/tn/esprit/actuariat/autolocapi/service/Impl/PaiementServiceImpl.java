package tn.esprit.actuariat.autolocapi.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.actuariat.autolocapi.domain.Paiement;
import tn.esprit.actuariat.autolocapi.repository.PaiementRepository;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IPaiementService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaiementServiceImpl implements IPaiementService {

    private final PaiementRepository paiementRepository;

    @Override
    public Paiement save(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> findAll() {
        return paiementRepository.findAll();
    }

    @Override
    public Optional<Paiement> findById(Long id) {
        return paiementRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        paiementRepository.deleteById(id);
    }
}