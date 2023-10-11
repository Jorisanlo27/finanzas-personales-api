package com.jorisanlo.proyecto.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorisanlo.proyecto.api.model.entity.EntTipoPago;
import com.jorisanlo.proyecto.api.repository.TipoPagoRepository;

@Service
public class TipoPagoService {

    @Autowired
    private TipoPagoRepository repo;

    public List<EntTipoPago> getAll() {
        return repo.findAll();
    }

    public Optional<EntTipoPago> getById(Long id) {
        return repo.findById(id);
    }

    public void saveOrUpdate(EntTipoPago tipoPago) {
        repo.save(tipoPago);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
