
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Empleado;
import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    
    //Mostrar todo
    List<Empleado> findAll();
    //Mostrar todos los habilitados
    List<Empleado> findAllCustom();
    //Buscar por nombre
    List<Empleado> findByName();
    //Buscar por codigo
    Optional<Empleado> findById(Long id);
    //Agregar
    Empleado add(Empleado e);
    //Actualizar
    Empleado update(Empleado e);
    //Eliminar
    Empleado delete(Empleado e);
}
