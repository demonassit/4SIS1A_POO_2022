
import java.util.*;

public class arreglosMatriz {
    
    public static void main(String[ ] args){
    
    /*
    // vamos a realizar un arreglo unidimencional y correrlo para ver que hay dentro de cada elemento 
    */ 
     /*    
    //definir un arreglon  
    //tipo de dato nombre tamaño
    int arreglo[] = new int[10];
    int valor;

    Scanner entrada = new Scanner(System.in);

    for(int j = 0; j < arreglo.length; j++){
        
        System.out.println("Ingresa el valor de la posicion del arreglo ");
        arreglo[j] = entrada.nextInt();
    }

    //vamos a recorrerlo
    for(int i = 0; i < arreglo.length; i++){
        System.out.println("La magia: " + arreglo[i] + valor);
    }
    */

    Scanner entrada = new Scanner(System.in);

    int matriz[][] = new int[3][3];

    //es poder sumar las filas del arreglo y sacar el promedio

    //ingresar los valores de la matriz
    for(int i = 0; i < matriz.length; i++){
        //filas
        System.out.println(i);
        //columnas
        for(int j = 0; j < matriz.length; j++){
            //columnas
            System.out.println(j);
            //vamos a llenarla
            System.out.println("Ingresa el valor de la fila: " + i + " ingresa el valor de la columna : " + j );
            matriz[i][j] = entrada.nextInt();
        }

    }
    int sumarfilas=0;
    //vamos a sumar y promediar
    for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz.length; j++){
            //sumar las filas
            sumarfilas += matriz[i][j];
            //sumarfilas = sumarfilas + matriz[i][j]
            System.out.println(String.format("%d", matriz[i][j]));
        }
        //formatos  %d int   %s  String    %c  char   %f  float  
        System.out.println(String.format("\n Suma de las filas %f, Promedio de la fila %.2f ", sumarfilas, sumarfilas/matriz.length));
    }
}
}
