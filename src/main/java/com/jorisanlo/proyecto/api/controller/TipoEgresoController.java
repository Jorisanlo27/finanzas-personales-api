package com.jorisanlo.proyecto.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorisanlo.proyecto.api.model.entity.EntTipoEgreso;
import com.jorisanlo.proyecto.api.services.TipoEgresoService;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/tiposEgresos/")
public class TipoEgresoController {

    @Autowired
    private TipoEgresoService service;

    @GetMapping
    public List<EntTipoEgreso> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<EntTipoEgreso> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public String save(@RequestBody EntTipoEgreso tipoEgreso) {
        service.saveOrUpdate(tipoEgreso);
        return "GRABADO CORRECTAMENTE!";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "ELIMINADO CORRECTAMENTE!";
    }

}
