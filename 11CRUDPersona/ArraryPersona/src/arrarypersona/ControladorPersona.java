/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrarypersona;

import java.util.ArrayList;

/**
 *
 * @author demon
 */
public class ControladorPersona {
    
    /*
    un controlador es una clase la cual se encarga de realizar las operaciones
    de un objeto en particular por ejemplo
    
    Registrar una nueva persona
    Consultar perfil de una persona
    Buscar por id una persona
    Editar los datos del perfil de una persona
    Mostrar la lista de personas
    
    CRUD
    
    Consult, Register, Update, Delete
    */
    
    //vamos a necesitar un objeto que sea capaz de almacenar de forma dinamica
    //el objeto persona dentro de una lista 
    
    public static ArrayList<Persona> listaPersona = new ArrayList<Persona>();
    
    //el metodo para mostrar a todas las personas de la lista
    
    public ArrayList<Persona> mostrarPersonas(){
        //que debe de devolverme
        return listaPersona;
    }
    
    //metodo que se encarga de registrar una nueva persona
    public void registrarPersona(Persona p){
        listaPersona.add(p);
    
    }
    
    //metodo para buscar a una persona por id
    public Persona buscarPersona(int id){
        //lo primero que necesito es un objeto de persona
        Persona encontrada = new Persona();
        //recorre a la persona p hasta terminar la lista de personas
        for(Persona p : listaPersona){
            if(id == p.getId()){
                encontrada = p;
            }else{
                //si es cierto se va a imprimir mucho :3
                System.out.println("Persona no encontrada, registro invalido");
            }
        }
        return encontrada;
    }
    
    //ahora necesito actualizar los datos de una persona
    //primero se debe buscar el registro por id, obtiene, se borra, se escribe
    public  void actualizarPersona(Persona personaActualizada){
        Persona personaActualizar = buscarPersona(personaActualizada.getId());
        listaPersona.remove(personaActualizar);
        listaPersona.add(personaActualizada);
    }
    
    //eliminar un registro de una persona
    public  void eliminarPersona(Persona personaEliminar){
        listaPersona.remove(personaEliminar);
    }
    
}
