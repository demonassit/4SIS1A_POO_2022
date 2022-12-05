/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19hilos;

/**
 *
 * @author demon
 */
public class Proceso extends Thread {
    
    /*
    Los hilos nos permiten crear procesos independientes que se
    pueden ejecutar como elementos de objetos
    
    Cada hilo puede tener su propia serie de operaciones 
    Cada hilo puede mandar a llamar a mas hilos
    */
    
    public Proceso(){
    
    }
    
    public Proceso(String nombreHilo){
        super(nombreHilo);
    }
    
    //correr el hilo
    int num_int;
    
    public void run(){
        for(int i = 0; i <= num_int; i++){
            System.out.println(" + " + this.getName());
        }
        System.out.println("");
    }
    
    public void valorDecondicion(int valor){
        this.num_int = valor;
    }
    
    
}
