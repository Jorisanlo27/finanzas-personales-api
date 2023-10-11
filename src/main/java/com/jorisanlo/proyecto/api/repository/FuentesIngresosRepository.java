package com.jorisanlo.proyecto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.jorisanlo.proyecto.api.model.entity.EntFuentesIngresos;

@EnableJpaRepositories
@Repository
public interface FuentesIngresosRepository extends JpaRepository<EntFuentesIngresos, Long> {

}
