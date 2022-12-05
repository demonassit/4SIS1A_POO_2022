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
public class Cajera {
    
    private String nombre;
    
    public Cajera(){
    
    }

    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void procesarCompra(Cliente cliente, long timeStamp){
        System.out.println("La cajera " + this.nombre 
                + "Comienza la compra del cliente " +cliente.getNombre() 
                + "En el tiempo " + (System.currentTimeMillis() - timeStamp) / 1000 + "segundos");
        //productos
        for(int i = 0; i < cliente.getCarrocompas().length; i++ ){
            this.esperarXsegundos(cliente.getCarrocompas()[i]);
            System.out.println("Procesando el producto " + (i +1) 
                    + " -> Tiempo "+ (System.currentTimeMillis() - timeStamp) / 1000 + "segundos");
        }
        //que termine la cajera
        System.out.println("La cajera " + this.nombre + "HA TERMINADO DE PROCESAR LA COMPRA"
        + cliente.getNombre() + "En el tiempo : " + (System.currentTimeMillis() - timeStamp)/1000 + "segundos");
    }

    private void esperarXsegundos(int segundos) {
        //meter en try el hilo para que se duerma
        try{
            Thread.sleep(segundos*1000);
        }catch(InterruptedException ex){
            System.out.println("Mensaje : " + ex.getMessage());
            Thread.currentThread().interrupt();
        
        }
    }
    
    
}
