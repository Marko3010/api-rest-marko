package com.apirest.app.controller;

import com.apirest.app.entytis.Empleados;
import com.apirest.app.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/usuario/empleado")
@RestController
public class EmpleadoController {

    @Autowired // inyecta a esta clase
    private EmpleadoService service;


    @PostMapping
    public Empleados nuevosUsaurios(@RequestBody Empleados empleados){
        return service.crearEmpleadoNuevo(empleados);

    }

    @GetMapping
    public List<Empleados> BuscartodoLaLista(){
    return service.buscarLista();
    }

    @PutMapping("buscar/{id}")
    public Empleados actualizarEmpleado(@PathVariable ("id") Integer id,@RequestBody Empleados empleados){
        return service.actualizarEmpleado(id, empleados);
    }

    @DeleteMapping("borrar/{id}")
    public void borrarEmpleado(@PathVariable ("id") Integer id){
        service.borrarId(id);

    }
}
