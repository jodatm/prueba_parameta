package com.parameta.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.parameta.modelos.Empleado;

@Repository
public interface InterfaceEmpleado extends CrudRepository<Empleado, String>{

}
