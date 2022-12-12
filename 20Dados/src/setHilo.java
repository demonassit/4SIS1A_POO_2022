/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author demon
 */

import java.util.logging.Level;
import java.util.logging.Logger;


public class setHilo  implements Runnable{
    
    private Daditos dado;
    private int suma;
    
    public setHilo(){
    
    }
    
    public setHilo(Daditos d){
        this.dado = d;
        this.suma = suma;
    }


    
    

    @Override
    public void run() {
        try{
            
            suma = dado.Tirada(); // hace la tirada de los dados
            //al estar sincranizda solo un hilo puede acceder a ella al mismo tiempo
        
        }catch(InterruptedException ex){
            
            System.out.println("Error en la ejecucion del hilo");
        
        }
    }
    
}
