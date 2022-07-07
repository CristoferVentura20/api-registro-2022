
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Perfil;
import java.util.List;
import java.util.Optional;

public interface PerfilService {
    
    //Mostrar todo
    List<Perfil> findAll();
    //Mostrar todos los habilitados
    List<Perfil> findAllCustom();
    //Buscar por nombre
    List<Perfil> findByName();
    //Buscar por codigo
    Optional<Perfil> findById(Long id);
    //Agregar
    Perfil add(Perfil p);
    //Actualizar
    Perfil update(Perfil p);
    //Eliminar
    Perfil delete(Perfil p);
}
