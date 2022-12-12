/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author demon
 */

import java.util.*;

public class dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thread[] hilos = null;
        setHilo set;
        Daditos d;
        int jugadores = 0;
        int caras = 0;
        int tiradas = 0;
        Scanner sc;
        
        while(jugadores <= 0 || jugadores > 4){
            System.out.println("Introduce el numero de jugadores (Maximo 4) :");
            
            try{
                
                sc = new Scanner(System.in);
                jugadores = sc.nextInt();
                
                //creo un hilo por cada jugadores
                hilos = new Thread[jugadores];
            }catch(Exception e){
                
                System.out.println("Introduzca un numero valido");
            }
            
            while(caras <= 0 || caras > 20){
                System.out.println("Introduce el numero de caras del dado (maximo 20 caras)");
                
                try{
                    sc = new Scanner(System.in);
                    caras = sc.nextInt();
                    
                }catch(Exception e){
                
                    System.out.println("Introduce un numero valido");
                }
            }
            
            while(tiradas <= 0 || tiradas > 20){
                System.out.println("Introduce el numero de veces que se lanzara el dado (maximo 20 caras)");
                
                try{
                    sc = new Scanner(System.in);
                    tiradas = sc.nextInt();
                    
                }catch(Exception e){
                
                    System.out.println("Introduce un numero valido");
                }
            }
            
            for(int i = 0; i < jugadores; i++){
                System.out.println("**************************");
                d = new Daditos(("Jugador" + (i+1)), caras, tiradas);
                set = new setHilo(d);
                hilos[i] = new Thread(set);
                hilos[i].run();
                
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ex){
                    System.out.println("Error en la ejecucion");
                }
                
                System.out.println("Pasando al siguiente jugador");
                
            }
        
        }
    }
    
}
