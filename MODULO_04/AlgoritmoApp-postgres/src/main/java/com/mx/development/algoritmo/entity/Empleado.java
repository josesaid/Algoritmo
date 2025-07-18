package com.mx.development.algoritmo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author josesaidolanogarcia
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String apellidoPaterno;

    @Column
    private String apellidoMaterno;



}
