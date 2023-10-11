package com.jorisanlo.proyecto.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorisanlo.proyecto.api.model.entity.EntIngresos;
import com.jorisanlo.proyecto.api.repository.IngresosRepository;

@Service
public class IngresosService {

    @Autowired
    private IngresosRepository repo;

    public List<EntIngresos> getAll() {
        return repo.findAll();
    }

    public Optional<EntIngresos> getById(Long id) {
        return repo.findById(id);
    }

    public void saveOrUpdate(EntIngresos ingreso) {
        repo.save(ingreso);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
