package com.jorisanlo.proyecto.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jorisanlo.proyecto.api.model.dto.LoginDTO;
import com.jorisanlo.proyecto.api.model.entity.login.EntUser;
import com.jorisanlo.proyecto.api.repository.UserRepository;
import com.jorisanlo.proyecto.api.response.LoginMessage;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<EntUser> getAll() {
        return repo.findAll();
    }

    public Optional<EntUser> getById(Long id) {
        return repo.findById(id);
    }

    public void saveOrUpdate(EntUser user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repo.save(user);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public LoginMessage loginEmployee(LoginDTO loginDTO) {
        EntUser user = repo.findByEmail(loginDTO.getEmail());
        if (user != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user.getPassword();
            if (passwordEncoder.matches(password, encodedPassword)) {
                Optional<EntUser> employee = repo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginMessage("Login Success", true);
                } else {
                    return new LoginMessage("Login Failed", false);
                }
            } else {
                return new LoginMessage("password Not Match", false);
            }
        } else {
            return new LoginMessage("Email not exits", false);
        }
    }
}
