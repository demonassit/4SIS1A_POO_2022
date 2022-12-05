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
public class Main {

    /**
     * @param args the command line arguments
     */
    int num_int;
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejemplo de un Hilo");
        
        Proceso hilo1 = new Proceso("Hilo1");
        Proceso hilo2 = new Proceso("Hilo2");
        Proceso hilo3 = new Proceso("Hilo3");
        
        hilo1.valorDecondicion(5);
        hilo2.valorDecondicion(6);
        hilo3.valorDecondicion(7);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        
        
        
    }
    
}
