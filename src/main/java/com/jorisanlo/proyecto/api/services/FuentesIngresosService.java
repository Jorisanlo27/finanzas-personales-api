package com.jorisanlo.proyecto.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorisanlo.proyecto.api.model.entity.EntFuentesIngresos;
import com.jorisanlo.proyecto.api.repository.FuentesIngresosRepository;

@Service
public class FuentesIngresosService {

    @Autowired
    private FuentesIngresosRepository repo;

    public List<EntFuentesIngresos> getAll() {
        return repo.findAll();
    }

    public Optional<EntFuentesIngresos> getById(Long id) {
        return repo.findById(id);
    }

    public void saveOrUpdate(EntFuentesIngresos fuenteIngreso) {
        repo.save(fuenteIngreso);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
