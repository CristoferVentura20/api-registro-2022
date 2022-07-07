
package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
    //Creamos una funcion para mostrar todas las categorias habilitadas
    
    
    @Query("Select c from Categoria c where c.estado = '1'")
    List<Categoria> findAllCustom();
    
    @Query("Select c from Categoria c where upper(c.nombre) like upper(:nombre) and c.estado = '1'")
    List<Categoria> findByName();
}
