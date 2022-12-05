/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20cajerio;

/**
 *
 * @author demon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente cliente1 = new Cliente("Cliente Michell", new int[] {2,2,1,5,2});
        
        Cliente cliente2 = new Cliente("Cliente Eduardo", new int[] {1, 3, 5,1 ,1});
        
        Cliente cliente3 = new Cliente("Cliente Ramon", new int[] {8,2,6,9,4});
        
        Cajera cajero1 = new Cajera("Cajero Cesar");
        
        Cajera cajero2 = new Cajera("Cajero Isidoro");
        
        Cajera cajero3 = new Cajera("Cajero Jose");
        
        //inicializamos el tiempo
        long initialTime = System.currentTimeMillis();
        
        cajero1.procesarCompra(cliente1, initialTime);
        cajero2.procesarCompra(cliente2, initialTime);
        cajero3.procesarCompra(cliente3, initialTime);
    }
    
}
