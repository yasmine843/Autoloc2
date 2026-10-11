package tn.esprit.actuariat.autolocapi.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.actuariat.autolocapi.domain.Contrat;
import tn.esprit.actuariat.autolocapi.repository.ContratRepository;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IContratService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContratServiceImpl implements IContratService {

    private final ContratRepository contratRepository;

    @Override
    public Contrat save(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> findAll() {
        return contratRepository.findAll();
    }

    @Override
    public Optional<Contrat> findById(Long id) {
        return contratRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        contratRepository.deleteById(id);
    }
}