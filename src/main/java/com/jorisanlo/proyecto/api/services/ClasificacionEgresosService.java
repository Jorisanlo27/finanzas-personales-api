package com.jorisanlo.proyecto.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorisanlo.proyecto.api.model.entity.EntClasificacionEgresos;
import com.jorisanlo.proyecto.api.repository.ClasificacionEgresosRepository;

@Service
public class ClasificacionEgresosService {

    @Autowired
    private ClasificacionEgresosRepository repo;

    public List<EntClasificacionEgresos> getAll() {
        return repo.findAll();
    }

    public Optional<EntClasificacionEgresos> getById(Long id) {
        return repo.findById(id);
    }

    public void saveOrUpdate(EntClasificacionEgresos clasificacionEgreso) {
        repo.save(clasificacionEgreso);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
