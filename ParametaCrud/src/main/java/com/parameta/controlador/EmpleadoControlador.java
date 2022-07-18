package com.parameta.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parameta.modelos.Empleado;
import com.parameta.repositorio.InterfaceEmpleado;

@RestController
@RequestMapping("/Empleado")
public class EmpleadoControlador {
	
	@Autowired
	private InterfaceEmpleado interfaceEmpleado;
	
	@GetMapping
	public List <Empleado> empleados(){
		return (List<Empleado>) interfaceEmpleado.findAll();
	}
	
	@PostMapping
	public ResponseEntity insertar(@Valid @RequestBody Empleado em) {
		
		Empleado savedEm = interfaceEmpleado.save(em);
		return new ResponseEntity(savedEm, HttpStatus.CREATED);
	}
	
	
}