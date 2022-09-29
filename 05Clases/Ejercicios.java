import java.util.Scanner;

class Ejercicios {

    /** Vamos a hacer una calculadora, un conversor de unidades creacion de cuadros y de movimiento */
    
    //los metodos son las operaciones de un objeto o de una clase, tambien llamado comportamiento

    //objetos
    Scanner entrada = new Scanner(System.in);

    //variables globales
    char op;

    //vamos a ser un metodo para el menu del programa
    public void menu(){
        //menu del programa
        System.out.println("Ejercicios de yo para tu");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Crear cuadros magicos");
        System.out.println("d.- Desplazamiento de cuadro");
        System.out.println("Elija una opción");

        op = entrada.next().charAt(0);

        switch(op){
            case 'a' :
                 //implementamos metodos
                Ejercicio1();
                break;
            case 'b' :
                //implementamos metodos
               Ejercicio2();
               break;
            case 'c' :
               //implementamos metodos
              Ejercicio3();
              break;
            case 'd' :
              //implementamos metodos
             Ejercicio4();
             break;
            default: 
                System.out.println("Gracias por jugar :3");
        }
    }

    public void Ejercicio1(){
        //variable local
        double num1 = 0.00, suma = 0.00, multi=1.00;
        char operacion;

        System.out.println("Selecciona la operacion que desees realizar");
        System.out.println("a.- Suma y Resta");
        System.out.println("b.- Multiplicacion");
        System.out.println("c.- Division ahi la hacen");

        operacion = entrada.next().charAt(0);
        switch(operacion){
            case 'a':
            do{
                System.out.println("Para detener la suma o resta ingrese el numero 0");
                System.out.println("Escriba los numeros que desee sumar o restar");
                num1 = entrada.nextDouble();
                suma += num1;
                //suma = suma + num1;


            }while(num1 != 0);
            System.out.println("El resultado es: " + suma);
                break;
            case 'b':
                break;
            case 'c':
                break;
            case 'd':
                break;
        }

    }

    public void Ejercicio2(){
        
    }

    public void Ejercicio3(){
        
    }

    public void Ejercicio4(){
        
    }

}
