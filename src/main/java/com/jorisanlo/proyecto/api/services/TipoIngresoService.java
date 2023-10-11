package com.jorisanlo.proyecto.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorisanlo.proyecto.api.model.entity.EntTipoIngreso;
import com.jorisanlo.proyecto.api.repository.TipoIngresoRepository;

@Service
public class TipoIngresoService {

    @Autowired
    private TipoIngresoRepository repo;

    public List<EntTipoIngreso> getAll() {
        return repo.findAll();
    }

    public Optional<EntTipoIngreso> getById(Long id) {
        return repo.findById(id);
    }

    public void saveOrUpdate(EntTipoIngreso tipoIngreso) {
        repo.save(tipoIngreso);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
