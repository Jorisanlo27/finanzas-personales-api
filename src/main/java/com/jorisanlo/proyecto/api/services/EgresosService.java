package com.jorisanlo.proyecto.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorisanlo.proyecto.api.model.entity.EntEgresos;
import com.jorisanlo.proyecto.api.repository.EgresosRepository;

@Service
public class EgresosService {

    @Autowired
    private EgresosRepository repo;

    public List<EntEgresos> getAll() {
        return repo.findAll();
    }

    public Optional<EntEgresos> getById(Long id) {
        return repo.findById(id);
    }

    public void saveOrUpdate(EntEgresos egreso) {
        repo.save(egreso);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
