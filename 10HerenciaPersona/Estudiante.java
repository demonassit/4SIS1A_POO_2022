
public class Estudiante extends Persona {
    
    private int numBoleta;
    private String chillon;

    public Estudiante(){

    }

    public Estudiante(int numBoleta, String nombre, int edad, char genero, String chillon){
        super(nombre, edad, genero);
        this.numBoleta = numBoleta;
        this.chillon = chillon;
    }

    public Estudiante(int numBoleta, String nombre, int edad, char genero){
        super(nombre, edad, genero);
        this.numBoleta = numBoleta;
        //this.chillon = chillon;
    }

    public int getNumBoleta(){
        return numBoleta;
    }

    public void setNumBoleta(int numBoleta){
        this.numBoleta = numBoleta;
    }

    public String getChillon(){
        return chillon;
    }

    public void setChillon(String chillon){
        this.chillon = chillon;
    }
}
