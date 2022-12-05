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
class Cliente {
    
    private String nombre;
    private int[] carrocompas;
    
    public Cliente(){
    
    }

    public Cliente(String nombre, int[] carrocompas) {
        super();
        this.nombre = nombre;
        this.carrocompas = carrocompas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCarrocompas() {
        return carrocompas;
    }

    public void setCarrocompas(int[] carrocompas) {
        this.carrocompas = carrocompas;
    }
    
    
    
    
    
}
