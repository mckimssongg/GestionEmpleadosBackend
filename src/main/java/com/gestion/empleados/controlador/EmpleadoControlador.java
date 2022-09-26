package com.gestion.empleados.controlador;

import com.gestion.empleados.modelo.Empleado;
import com.gestion.empleados.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins="*")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoRepositorio repositorio;

    //este metodo sirve para listar todos los empleados
    @GetMapping("/empleados")
    public List<Empleado> listarTodosLosEmpleados() {
        return repositorio.findAll();
    }
}
