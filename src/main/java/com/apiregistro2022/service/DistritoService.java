
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Distrito;
import java.util.List;
import java.util.Optional;

public interface DistritoService {
    
    //Mostrar todo
    List<Distrito> findAll();
    //Mostrar todos los habilitados
    List<Distrito> findAllCustom();
    //Buscar por nombre
    List<Distrito> findByName();
    //Buscar por codigo
    Optional<Distrito> findById(Long id);
    //Agregar
    Distrito add(Distrito d);
    //Actualizar
    Distrito update(Distrito d);
    //Eliminar
    Distrito delete(Distrito d);
}
