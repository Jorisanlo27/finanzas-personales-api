package com.jorisanlo.proyecto.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorisanlo.proyecto.api.model.dto.LoginDTO;
import com.jorisanlo.proyecto.api.model.entity.login.EntUser;
import com.jorisanlo.proyecto.api.response.LoginMessage;
import com.jorisanlo.proyecto.api.services.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/v1/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<EntUser> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<EntUser> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public String save(@RequestBody EntUser persona) {
        service.saveOrUpdate(persona);
        return "GRABADO CORRECTAMENTE!";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "ELIMINADO CORRECTAMENTE!";
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginMessage loginResponse = service.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }

}
