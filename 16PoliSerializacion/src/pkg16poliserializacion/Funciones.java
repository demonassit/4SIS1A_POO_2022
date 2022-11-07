/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16poliserializacion;

/**
 *
 * @author demon
 */
import java.io.*;
import java.util.*;
import javax.swing.*;



public class Funciones {
    
    //vamos a crear una listad de personas
    ArrayList<Persona> listapersonas = new ArrayList();
    //variables
    String rep = "si";
    String nombre = "";
    int edad, num_empleado, bol;
    
    //aplicamos polimorfismo
    Persona profesor = new Profesor();
    Persona alumno = new Alumno();
    
    void menu(){
        while(true){
            //equalsIgnoreCase es para ignorar mayusculas y minusculas
            while(rep.equalsIgnoreCase("si")){
                try{
                    String var = JOptionPane.showInputDialog("Ingresa la opcion deseada : \n"
                    + "1.- Registrar Nuevo Profesor\n"
                    + "2.- Registrar Nuevo Alumno\n"
                    + "3.- Consultar Alumno\n");
                    if(var == null){
                        System.exit(0);
                    }
                    int opcion = Integer.parseInt(var);
                    
                    switch (opcion) {
                        case 1:
                            //metodos
                            pedirDatosProfesor();
                            //le asigno esos datos
                            profesor = new Profesor(num_empleado, nombre, edad);
                            //guardar
                            guardarProfesor();
                            break;
                        case 2:
                            //metodos
                            pedirDatosAlumno();
                            //le asigno esos datos
                            alumno = new Alumno(bol, nombre, edad);
                            //guardar
                            guardarAlumno();
                            break;
                        case 3:
                             //metodo para leer alumnos
                            leerAlumnos();
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    rep = JOptionPane.showInputDialog("¿Desea repetir?");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                
                }
            }
        }
    }

    private void pedirDatosProfesor() {
        //obtener todos los datos para el registro del profesor
        num_empleado = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de empleado"));
        nombre = JOptionPane.showInputDialog("Ingresa el nombre del profesor");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del profesor:"));
    }

    private void guardarProfesor() throws IOException {
        //vamos a crear un metodo para guardar a todos
        listapersonas.add(profesor);
        guardar();
    }

    private void pedirDatosAlumno() {
        bol = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la boleta del alumno"));
        nombre = JOptionPane.showInputDialog("Ingresa el nombre del alumno");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del alumno:"));
    }

    private void guardarAlumno() throws IOException {
        listapersonas.add(alumno);
        guardar();
    }

    private void leerAlumnos() throws FileNotFoundException, IOException, ClassNotFoundException {
        //aqui es donde vamos aplicar la serializacion del archivo, porque el metodo de
        //guardar es el que se encarga de crear un archivo y el de leer leerlo
        //llamamos a los flujos de lectura de archivos
        FileInputStream archivo = new FileInputStream("archivo.dat");
        //genermoa la lectura del buffer para el archivo
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        //aqui es donde existe esa transofrmacion de bytes a el tipo de dato
        //que vamos a necesitar
        listapersonas = (ArrayList)entrada.readObject();
        
        /*
        como tenemos que saber cuantos objetos hay dentro del archivo, y 
        sus valores tenemos que obtener el tamaño y entre lentgh y size
        */
        
        for(int i = 0; i < listapersonas.size(); i++){
            //vamos recorrriendo la lista, y generamos un objeto del
            //tipo de persona correspondiente a lo que queremos leer
            Alumno obj = (Alumno)listapersonas.get(i);
            //ahora sacamos la informacion
            JOptionPane.showMessageDialog(null, "\n "
                                + "Numero de alumno registado: " + (i+1) + "\n"
                                + "Boleta: " + obj.getBoleta() + "\n"
                                + "Nombre: " + obj.getNombre() + "\n"
                                + "Edad: " + obj.getEdad() + "\n"
                                + "Tipo de persona: " + obj.tipoPersona() + "\n");
        }
        
        
        
    }

    private void guardar() throws FileNotFoundException, IOException {
        //aqui es donde debo de generar una salida de un archivo
        FileOutputStream archivo = new FileOutputStream("archivo.dat");
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        
        //escribir los datos del objeto
        salida.writeObject(listapersonas);
        salida.close();
    }
    
    
    
    
          
    
}
