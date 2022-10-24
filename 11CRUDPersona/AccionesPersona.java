/**
 * Esta clase es un controlador de las acciones de la clase Persona para ello vamos a ocupar ArrayList
 * es un tipo de objeto que es dinamico en cuation de crecimiento y memoria para diversos tipos de datos u objetos
 * 
 */

 import java.util.ArrayList;

public class AccionesPersona {
    /**
     * Vamos a hacer un CRUD de la persona
     * C -> consult
     * R -> Register
     * U -> Update
     * D -> Delete
     * 
     * declaracion de mi objeto persona, pero como un tipo arraylist
     */

     public ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

     //declarar mis metodos
     public void agregarPersona(Persona p){
        //voy a ocupar  ami objeto de lsita de persona para invocar un metodo para agregarlo a la lista
        listaPersonas.add(p);
     }

     //buscar  auna persona por id
     public Persona buscarPersona(int id){
        //necesito una instancia de Persona para poder buscarla
        Persona encontrada = new Persona();
        //necesito recorrer todo el arreglo de personas hasta encontrar el id que sea id = parametro
        for(Persona p : listaPersonas){
            //condicion id = parametro
            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("No existe ese registro de la persona");
            }
        }
        return encontrada;
     }

     //vamos actualizar los datos de la persona
     public void actualizarPersona(Persona actualizada){
        //primero debeo de buscar a la persona creo mi instancia de la persona que voy a buscar
        Persona actualizar = buscarPersona(actualizada.getId());

        //cambiar los datos
        listaPersonas.remove(actualizar);

        //guarda los nuevos
        listaPersonas.add(actualizar);
     }

     //eliminar una persona
     public void eliminarPersona(Persona eliminar){
        listaPersonas.remove(eliminar);
     }

     //quiero mostrar a todas las personas
     public ArrayList<Persona> mostrarPersonas(){
        return listaPersonas;
     }


    
}
