package tn.esprit.actuariat.autolocapi.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.actuariat.autolocapi.domain.Maintenance;
import tn.esprit.actuariat.autolocapi.repository.MaintenanceRepository;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IMaintenanceService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceService {

    private final MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance save(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public List<Maintenance> findAll() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Optional<Maintenance> findById(Long id) {
        return maintenanceRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        maintenanceRepository.deleteById(id);
    }
}