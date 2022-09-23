/**Vamos a crear los 14 programas dentro de un menu de seleccion de la tarea, comprendido por:
 * 1.- Bono o descuento por edad
 * 2.- Convertir numeros decimales a binarios
 * 3.- convertir temperaturas
 * 4.- Numero de positivos y negativos
 * 5.- Tienda
 * 6.- Area y Perimetro
 * 7.- Tabla
 * 8.- Factorial
 * 9.- Dibujitos
 * 10.- Figura hueca
 * 11.- Patrones
 * 12.- Diamante
 * 13.- Calculadora
 * 14.- Salir
 */

 import java.util.Scanner;

class EstructuraDatos {

    public static void main(String[] args){
        //objetos
        Scanner entrada = new Scanner(System.in);

        //aqui van a ir las variables
        int opcion, numbinario;
        char letra;
        String binario = "";

        do{
            System.out.println("Bienvenido al programa de las tareas que son para el lunes a las 7 am wiii (n_n)/");
            System.out.println("Por favor elija la opcion deseada: ");
            System.out.println("1.- Descuento por edad ");
            System.out.println("2.- Convertir numero decimal a binario ");
            System.out.println("3.- Conversiones de temperatura ");
            System.out.println("4.- Numeros Positivos y Negativos ");
            System.out.println("5.- Tienda ");
            System.out.println("6.- Area y Perimetro ");
            System.out.println("7.- Tabla ");
            System.out.println("8.- Factorial ");
            System.out.println("9.- Dibujos de codigo ");
            System.out.println("10.- Figura Hueca ");
            System.out.println("11.- Patrones de Codigo ");
            System.out.println("12.- Diamante ");
            System.out.println("13.- Calculadora ");
            System.out.println("14.- Salir ");

            //obtener la respuesta del usuario
            opcion = entrada.nextInt();

            //menu
            switch(opcion){
                case 1:
                    break;
                case 2:
                    //convertir numero a binario
                    System.out.println("Ingrese un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();

                    //tenemos que saber si es positivo
                    if(numbinario > 0){
                        //realizar el algotimo con el mod 2 
                        while(numbinario > 0){
                            if(numbinario%2 == 0){
                                binario ="0" + binario;
                            }else{
                                binario ="1" + binario;
                            }
                            numbinario = (int)numbinario/2;
                        }
                    }else if(numbinario == 0){
                        binario = "0";
                    }else{
                        binario = "No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("El numero convertido a binario es: " + binario);
                    break;
                case 3:
                    break;
                case 4:
                    break;    
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    for(int n = 1; n<=10; n++){
                        System.out.println(n + " " +(n*10) + " " + (n*100) + " " +(n*1000) );
                    }
                    break;
            }

            System.out.println("Deseas repetir el programa, escribe s para si");
            letra = entrada.next().charAt(0);



        }while(letra == 's' || letra == 'S' );

    }
    
}
