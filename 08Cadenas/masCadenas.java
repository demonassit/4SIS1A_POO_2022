import java.util.*;

public class masCadenas {
    
    Scanner entrada = new Scanner(System.in);

    public void masFunciones(){
        String s1 = new String("Hola porque hay que pagar tanto por un gansito T_T");
        String s2 = "Harry popote tiene un ajedrez magico";
        String s3 = "Feliz no cumpleaños";
        String s4 = "FELIZ NO CUMPLEAÑOS";

        //vamos a concatenar

        String salida = "Cadenas: " + s1 + "\n" 
        + s2 + "\n" +  s3+ "\n" + s4 +"\n";

        //probar la igual de una cadena
        if(s1.equals("Solo juguito contigo")){
            //si es verdad
            salida += "Si es igual a la cadena\n";
            System.out.println(salida);
        }else{
            salida += "No es la misma cadena\n";
            System.out.println(salida);
        }

        //probar con == solo sirve para objetos no para cadenas

        if(s1=="Hola porque hay que pagar tanto por un gansito T_T"){
            salida += "Si es igual a la cadena\n";
            System.out.println(salida);
        }else{
            salida += "No es la misma cadena\n";
            System.out.println(salida);
        }

        //probar la igualdad ignorando mayusculas
        if(s3.equalsIgnoreCase(s4)){
            salida += "Si es igual a la cadena\n";
            System.out.println(salida);
        }else{
            salida += "No es la misma cadena\n";
            System.out.println(salida);
        }


        //vamos a usar compareTo

        salida += "\n s1 compareTo (s2) : "+ s1.compareTo(s2) +
        "\n s2 compareTo (s1) : "+ s2.compareTo(s1)+
        "\n s3 compareTo (s4) : "+ s3.compareTo(s4)+
        "\n s4 compareTo (s3) : "+ s4.compareTo(s3);

        System.out.println(salida);

        //obtener la posicion de un caracter repetido
        String s5 = "Patito patito color de cafe";
        int pos = 0;

        pos = s5.indexOf('t' , pos+1);

        System.out.println("La segunda aparicion de la t es: " + pos);

    }
}
