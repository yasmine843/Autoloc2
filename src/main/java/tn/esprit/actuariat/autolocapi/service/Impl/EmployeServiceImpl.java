package tn.esprit.actuariat.autolocapi.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.actuariat.autolocapi.domain.Employe;
import tn.esprit.actuariat.autolocapi.repository.EmployeRepository;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IEmployeService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements IEmployeService {

    private final EmployeRepository employeRepository;

    @Override
    public Employe save(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> findAll() {
        return employeRepository.findAll();
    }

    @Override
    public Optional<Employe> findById(Long id) {
        return employeRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        employeRepository.deleteById(id);
    }
}