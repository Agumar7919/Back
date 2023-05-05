package com.miaplicacion.proyectoFinal.Interface;

import com.miaplicacion.proyectoFinal.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de persona
    public List<Persona> getPersona();
    
    //Guardar un obeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);

    //Buscar una persona por ID
    public Persona findPersona(Long id);
    
    
    
}
