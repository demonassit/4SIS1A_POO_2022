
public class Principal {

    public static void main(String[] args){
        //hago la instancia del animal perro
        Perro dog = new Perro("Pulgas", "de la calle", "Croquetas", 1, "gua gua");
        Gato cat = new Gato("Michi", "de la calle", "Atun", 1, 7);

        //muestro
        dog.mostrarPerro();
        cat.mostrarGato();

    }
    
}
