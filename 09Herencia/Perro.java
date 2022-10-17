
/** Para poder aplicar la herencia de una clase, se utiliza la palabra reservada 
 * 
 * extends 
 * 
 * un perro se extiende de un animal
 * animal es la clase padre
 * perro es la clase hija
 */


public class Perro extends Animal{
    //aqui deberia de venir String
    String ladrido;

    public Perro(){

    }

    public Perro(String nombre, String raza, String tipo_alimento, int edad, String ladrido){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.ladrido = ladrido;
    }

    //recibir
    public String getLadrido(){
        return ladrido;
    }

    //enviar
    public void setLadrido(String ladrido){
        this.ladrido = ladrido;
    }

    //el metodo propio del perro
    public void mostrarPerro(){
        System.out.println("El nombre del perro es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "Su ladrido es: " + ladrido);
    }




    
}
