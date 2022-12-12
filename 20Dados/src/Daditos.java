
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author demon
 */
public class Daditos {
    
    private String jugador;
    private int caras;
    private int resultado;
    private int numTiradas;
    private int suma;
    private Random r = new Random();

    
    public Daditos(){
    
    }

    public Daditos(String jugador, int caras, int numTiradas, int suma) {
        this.jugador = jugador;
        this.caras = caras;
        this.numTiradas = numTiradas;
        this.suma = suma;
    }
    
    public Daditos(String jugador, int caras, int numTiradas) {
        this.jugador = jugador;
        this.caras = caras;
        this.numTiradas = numTiradas;
       
    }

  

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getNumTiradas() {
        return numTiradas;
    }

    public void setNumTiradas(int numTiradas) {
        this.numTiradas = numTiradas;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
    
    //un metodo para calcular la cantidad de x tiradas en un dado con un 
    //num de caras definido
    
    public synchronized int Tirada() throws InterruptedException{
        
        int tirada;
        int i;
        for(i = numTiradas; i > 0; i--){
            tirada = r.nextInt(caras)+1;
            System.out.println("El " + this.jugador + " ha sacado " + tirada);
            suma = suma + tirada;
            System.out.println("Suma actual de " + this.jugador + " : " + suma);
            Thread.sleep(1000);
        }
        return suma;
        
    }
    
    
    
    
}
