package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Client;

import java.util.List;
import java.util.Optional;

public interface IClientService {

    Client save(Client client);

    List<Client> findAll();

    Optional<Client> findById(Long id);

    void deleteById(Long id);
}