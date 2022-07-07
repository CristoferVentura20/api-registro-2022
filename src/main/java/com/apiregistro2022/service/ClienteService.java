
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {
    
    //Mostrar todo
    List<Cliente> findAll();
    //Mostrar todos los habilitados
    List<Cliente> findAllCustom();
    //Buscar por nombre
    List<Cliente> findByName();
    //Buscar por codigo
    Optional<Cliente> findById(Long id);
    //Agregar
    Cliente add(Cliente cl);
    //Actualizar
    Cliente update(Cliente cl);
    //Eliminar
    Cliente delete(Cliente cl);
}
