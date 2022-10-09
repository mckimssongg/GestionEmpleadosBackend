package com.gestion.empleados.controlador;

import com.gestion.empleados.modelo.Empleado;
import com.gestion.empleados.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins="*")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoRepositorio repositorio;

    //Listar todos los empleados: GET
    @GetMapping("/empleados")
    public List<Empleado> listarTodosLosEmpleados() {
        return repositorio.findAll();
    }

    //Guardar empleados: POST
    @PostMapping("/empleados")
    public  Empleado guardarEmpleado(@RequestBody Empleado empleado){
        return repositorio.save(empleado);
    }
}
