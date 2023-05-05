
package com.miaplicacion.proyectoFinal.Repository;

import com.miaplicacion.proyectoFinal.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
