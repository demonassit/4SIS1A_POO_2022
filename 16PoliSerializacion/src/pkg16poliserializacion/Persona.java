/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16poliserializacion;

/**
 *
 * @author demon
 */

import java.io.Serializable;
//nos ayuda a crear archivos desde 0

public abstract class Persona implements Serializable {
    
    //vamos a hacer que esta persona sea polimorfica
    private String nombre;
    private int edad;
    
    public Persona(){
    
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //metodo abstracto que es el que se encarga de saber 
    //que persona es que persona
    abstract String tipoPersona();
    
    
    
}
