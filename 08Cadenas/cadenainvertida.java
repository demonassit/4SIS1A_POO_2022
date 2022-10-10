
import java.util.*;

public class cadenainvertida {

    Scanner entrada = new Scanner(System.in);

    public void cadenaInvertidadePalabras(){
        String cadena = "";
        System.out.println("Ingresa la oracion que quieres invertir: ");

        cadena = entrada.nextLine();

        String invertida = "";

    for(int i = cadena.length()-1; i >=0; i--){
        //obtener las posiciones de los char
        char car = cadena.charAt(i);
        //lo concateno
        invertida += car;
    }        

    System.out.println("Cadena invertida es: " + invertida);

    }
}
