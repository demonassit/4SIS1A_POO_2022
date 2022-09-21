/**
 * 
 * Vamos a ver como poder hacer instancias para la entrada y salida de informacion de un programa en java
 */

 class EntradaTexto{
    //metodo principal
    public static void main(String[] args){
        //estructura basica
        //declaracion de variables
        String nombre;
        //Mensaje para el usuario
        System.out.println("Por favor introduce tu nombre: ");
        //ln es salto de linea

        nombre = System.console().readLine();

        //tenemos que concatenar los elementos

        System.out.println("Hola " + nombre + " Bienvenido a la tronadera T_T");
    }
 }