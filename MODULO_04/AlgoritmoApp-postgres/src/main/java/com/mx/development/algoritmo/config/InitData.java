package com.mx.development.algoritmo.config;

import com.mx.development.algoritmo.entity.Empleado;
import com.mx.development.algoritmo.repository.EmpleadoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

/**
 * @author josesaidolanogarcia
 */
@Component
@Slf4j
public class InitData {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @PostConstruct
    public void init() {
        empleadoRepository.save(new Empleado(null, "Juan", "Pérez", "García"));
        empleadoRepository.save(new Empleado(null, "Ana", "López", "Martínez"));
        empleadoRepository.save(new Empleado(null, "Pedro", "Picapiedra", "Xavier"));
        log.info("Se han creado los datos de prueba");
    }

}

