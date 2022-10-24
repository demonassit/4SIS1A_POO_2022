import java.util.*;

public class manipularPrograma {

    public void menu(){
        Scanner entrada = new Scanner(System.in);

        //instancias de mis clases de Persona y de AccionesPersona

        AccionesPersona control = new AccionesPersona();

        System.out.println("Bienvenido al programa de registro de dormiditos UTC");
        System.out.println("Elija una opcion: ");
        System.out.println("1.- Mostrar Todas las Personas Dormiditas");
        System.out.println("2.- Registrar nuevo dormidito");
        System.out.println("3.- Editar dormidito");
        System.out.println("4.- Despertar al dormidito");
        System.out.println("5.- Salir");
        
        int opcion = entrada.nextInt();
        //int opcion = Integer.parseInt(entrada.nextLine());

        switch(opcion){
            case 1:
                //mostrar todas las personas
                System.out.println("mimir");
                ArrayList<Persona> listadepersonas = control.mostrarPersonas();
                //falta imprimir la lista de personas, recorrer el objeto del arraylist
                System.out.println("hola");
                for(Persona objeto : listadepersonas){
                    System.out.println("El id es: " + objeto.getId() + "\n" 
                    + "El nombre es: " + objeto.getNombre() + "\n"
                    + "Su edad es: " + objeto.getEdad() + "\n");

                }
                menu();
                break;
            case 2:
                //debemos agregar a la persona
                System.out.println("Ingrese el ID del dormidito: ");
                int idpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese el nombre el dormidito: ");
                String nombrepersona = entrada.nextLine();
                System.out.println("Ingrese la edad del dormidito: ");
                int edadpersona = Integer.parseInt(entrada.nextLine());

                //guardarlo en el objeto correspondiente de persona
                Persona personaDormidito = new Persona(idpersona, nombrepersona, edadpersona);

                control.agregarPersona(personaDormidito);
                menu();
                break;
            case 3:
                //primero debo de buscar a la persona que quiero editar
                System.out.println("Ingresa el ID del Dormidito que deseas buscar:");
                idpersona = Integer.parseInt(entrada.nextLine());

                //mando a llamar al metodo de busqueda
                Persona personabuscar = control.buscarPersona(idpersona);

                System.out.println("La informacion del dormidito es: \n"
                + "ID: " + personabuscar.getId() + "\n"
                + "Nombre: " + personabuscar.getNombre() + "\n"
                + "Edad: " + personabuscar.getEdad() + "\n");

                //cambio de los datos
                System.out.println("Ingresa el nuevo nombre: ");
                String nuevonombre = entrada.nextLine();
                System.out.println("Ingresa la nueva edad: ");
                int nuevaedad = Integer.parseInt(entrada.nextLine());

                //como ya tengo los nuevos datos tengo que pasarlos
                personabuscar.setNombre(nuevonombre);
                personabuscar.setEdad(nuevaedad);

                //ahora si actualizo
                control.actualizarPersona(personabuscar);
                menu();
                break;
            case 4:
                System.out.println("Ingrese el id del dormidito que desea despertar:");
                idpersona = Integer.parseInt(entrada.nextLine());

                //creo el objeto para despertarlo
                Persona personaEliminar = control.buscarPersona(idpersona);

                //la elimino
                control.eliminarPersona(personaEliminar);

                System.out.println("El dormidito ya desperto");
                menu();
                break;
            default:
                System.out.println("Opcion no valida");
                break;


                
        }


    }
    
}
