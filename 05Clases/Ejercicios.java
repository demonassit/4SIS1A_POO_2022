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
            do{
                System.out.println("Para detener la multiplicacion ingrese el numero 0");
                System.out.println("Escriba los numeros que desee multiplicar");
                num1 = entrada.nextDouble();
                multi *= num1;
                //multi = multi * num1;


            }while(num1 != 0);
            System.out.println("El resultado es: " + multi);
                break;
            case 'c':
            //ahi lo hacen yo voy a mimir
                break;
            default:
                System.out.println("Opcion no valida. ayos w_w");
                break;
            
        }

    }

    public void Ejercicio2(){
        /*
        vamos a crear un programa que se encargue de convertir 
        kg a libras y gramos
        m/s a km/s
        tarea
        m a yardas y millas
        */ 
        double metros = 0.00, kg = 0.00, velocidad = 0.00, cm = 100.00, pulgada = 39.37, gramos = 1000.00, libra = 2.20, ms = 0.00;
        double a, b;
        System.out.println("Seleccione la cantidad que desea convertir de acuerdo a las siguientes unidades : ");
        System.out.println("a. Metros a cm y pulgadas");
        System.out.println("b. Kilogramos a libras y gramos");
        System.out.println("c. m/s a km/h");
        System.out.println("d. ahi va la tarea");

        op = entrada.next().charAt(0);

        switch(op){
            case 'a':
                System.out.println("Ingrese los metros a transformar: ");
                metros = entrada.nextDouble();
                a = metros * cm;
                b = metros * pulgada;

                System.out.println("La cantidad en metros es: " + metros + " de m a cm son :" + a + " de m a pulgadas son : " +b  );

                break;
            case 'b':
            System.out.println("Ingrese los kilogramos a transformar: ");
            kg = entrada.nextDouble();
            a = kg * gramos;
            b = kg * libra;

            System.out.println("La cantidad en kg es: " + kg + " de kg a gramos son :" + a + " de kg a libras son : " +b  );
                break;
            case 'c':
            System.out.println("Ingrese la velocidad en m/s: ");
                ms = entrada.nextDouble();
                a = ms*(3600/1000);    

                System.out.println("La conversion de m/s a km/h es de: " + a );
                break;
            case 'd':
            //ahi lo hacen
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public void Ejercicio3(){
        /**
         * Aqui va mas tarea porque ya se acabo la clase wiiiii 
         * Deberan de ingresar un numero de * / para que se arme un cuadrado por ejemplo debe de poder aceptar del 1 al 1000
         * 
         ***********
        ///////////
        ***********
        ///////////
        **********
        //////////
         
         */
        
    }

    public void Ejercicio4(){
        
    }

}
