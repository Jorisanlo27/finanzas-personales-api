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

import com.jorisanlo.proyecto.api.model.entity.EntFuentesIngresos;
import com.jorisanlo.proyecto.api.services.FuentesIngresosService;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/fuentesIngresos/")
public class FuentesIngresosController {

    @Autowired
    private FuentesIngresosService service;

    @GetMapping
    public List<EntFuentesIngresos> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<EntFuentesIngresos> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public String save(@RequestBody EntFuentesIngresos fuenteIngreso) {
        service.saveOrUpdate(fuenteIngreso);
        return "GRABADO CORRECTAMENTE!";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "ELIMINADO CORRECTAMENTE!";
    }

}
