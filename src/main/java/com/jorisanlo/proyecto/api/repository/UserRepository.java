package com.jorisanlo.proyecto.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.jorisanlo.proyecto.api.model.entity.login.EntUser;

@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<EntUser, Long> {

    Optional<EntUser> findOneByEmailAndPassword(String email, String password);

    EntUser findByEmail(String email);

}
