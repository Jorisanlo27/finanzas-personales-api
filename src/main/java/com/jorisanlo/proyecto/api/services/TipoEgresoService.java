package com.jorisanlo.proyecto.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorisanlo.proyecto.api.model.entity.EntTipoEgreso;
import com.jorisanlo.proyecto.api.repository.TipoEgresoRepository;

@Service
public class TipoEgresoService {

    @Autowired
    private TipoEgresoRepository repo;

    public List<EntTipoEgreso> getAll() {
        return repo.findAll();
    }

    public Optional<EntTipoEgreso> getById(Long id) {
        return repo.findById(id);
    }

    public void saveOrUpdate(EntTipoEgreso tipoEgreso) {
        repo.save(tipoEgreso);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
