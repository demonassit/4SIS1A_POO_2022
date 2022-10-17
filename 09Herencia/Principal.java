
public class Principal {

    public static void main(String[] args){
        //hago la instancia del animal perro
        Perro dog = new Perro("Pulgas", "de la calle", "Croquetas", 1, "gua gua");
        Gato cat = new Gato("Michi", "de la calle", "Atun", 1, 7);

        /*Quiero que se cree un menu mediante el cual el usuario pueda ingresar los datos de los animales:
         * 
         * 1.- Perro
         * 2.- Gato
         * 3.- Hamster
         * 4.- Conejo
         * 5.- Cuyo
         * 6.- Uron
         * 7.- Otro
         * 
         * Debera de poder ingresar cada uno de los datos y asi mismo deberan de entregar el diagrama de clases hecho en star uml aplicando la herencia correspondiente y el programa
        */

        //muestro
        dog.mostrarPerro();
        cat.mostrarGato();

    }
    
}
