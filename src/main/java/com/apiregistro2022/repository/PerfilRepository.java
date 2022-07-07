
package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Perfil;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PerfilRepository extends JpaRepository<Perfil, Long>{
    
    @Query("Select p from Perfil p where p.estado = '1'")
    List<Perfil> findAllCustom();
    
    @Query("Select p from Perfil p where upper(p.nombre) like upper(:nombre) and p.estado = '1'")
    List<Perfil> findByName();
}
