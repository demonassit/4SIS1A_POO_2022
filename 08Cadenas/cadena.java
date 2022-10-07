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



    }
    
}
