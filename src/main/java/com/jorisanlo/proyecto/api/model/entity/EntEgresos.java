package com.jorisanlo.proyecto.api.model.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TBL_EGRESOS")
public class EntEgresos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tipoEgreso_id", referencedColumnName = "id", nullable = false)
    private EntTipoEgreso tipoEgreso;

    @ManyToOne
    @JoinColumn(name = "clasificacionEgresos_id", referencedColumnName = "id", nullable = false)
    private EntClasificacionEgresos clasificacionEgresos;

    @ManyToOne
    @JoinColumn(name = "tipoPago_id", referencedColumnName = "id", nullable = false)
    private EntTipoPago tipoPago;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private float monto;

    @Column(nullable = false)
    private boolean estado;

    @Column(nullable = false)
    private Date fecha;

}
