import java.util.Scanner;

public class cadena {

    Scanner entrada = new Scanner(System.in);

    //metodo de cadenas
    public void cadenas(){
        String s1 = "Hola habia una vez un patito que decia miau, y queria mimir; pero no lo dejaban y por eso estaba triste";

        System.out.println("El tamaño de la cadena es: " + s1.length());

        //si comienza con ????
        System.out.println("La cadena inicia V o F con Hola?..." + s1.startsWith("Hola"));

        //si finaliza
        System.out.println("La cadena termina V o F con gato?" + s1.endsWith("gato"));

        //vamos a ller una variable
        System.out.println("Ingrese una palabra: ");
        String s2 = entrada.nextLine();

        System.out.println("La palabra es: " + s2);

        //vamos a obtener subcadenas de la palabra
        System.out.println("Parte de una subcadena de s1: " + s1.indexOf("tito") );

        //vamos a sustraer palabras
        System.out.println("Primera parte:" + s1.substring(12));

        System.out.println("Segunda parte:" + s1.substring(7 , 20));

        //convertir una variable de la cadena

        int valor = 24;

        String s3 = String.valueOf(valor);

        System.out.println("El valor es de : " + s3 + " como cadena");

        /**
         *  2 + 2 = 22   cadena
         * 2 + 2 = 4 int
         */

         //de cadena a numero
        String s4 = "20";

        int numero = Integer.parseInt(s4);

        System.out.println("El valor de: " +numero + " ahora es un numero");

        String s5 = "20.89";

        Double numero1 = Double.parseDouble(s5);
        
        System.out.println("El valor de: " +numero1 + " ahora es un decimal");

        numero1 = numero1 + numero;

        System.out.println("El resultado es: " + numero1);

        //convertir de otra forma entero a una cadena
        Integer x = 5;
        
        System.out.println("El valor de: " + x.toString() + "ahora es una cadena");

        System.out.println("El valor de: "+ Integer.toString(12) + "ahora es una cadena");




    }
    
}
