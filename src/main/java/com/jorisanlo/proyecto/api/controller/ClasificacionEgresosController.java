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

import com.jorisanlo.proyecto.api.model.entity.EntClasificacionEgresos;
import com.jorisanlo.proyecto.api.services.ClasificacionEgresosService;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/clasificacionEgresos/")
public class ClasificacionEgresosController {

    @Autowired
    private ClasificacionEgresosService service;

    @GetMapping
    public List<EntClasificacionEgresos> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<EntClasificacionEgresos> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public String save(@RequestBody EntClasificacionEgresos clasificacionEgreso) {
        service.saveOrUpdate(clasificacionEgreso);
        return "GRABADO CORRECTAMENTE!";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "ELIMINADO CORRECTAMENTE!";
    }

}
