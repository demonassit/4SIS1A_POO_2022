/**
 * Vamos a crear una tienda de mascotas para adopcion
 */

public class Animal {
    /*
    
    Encapsulamiento:
    Es poder restringir el acceso a los tipos de datos, vamos a poder agrupar en una clase el acceso a los diferentes metodos, atributos u objetos de clase, para que no puedan ser modificados desde otro lugar*/
    
    //definir variables
    private String nombre, raza, tipo_alimento;
    private int edad;

    /**El constructor nos sirve para poder declarar la existenica de una clase, para poder inicializar las variables de la clase y para crear instancias de la clase, a partir de la obtencion de memoria */

    public Animal(){
        //este es un constructor vacio
    }

    //aplicar sobrecarga al constructor
    public Animal(String nombre, String raza, String tipo_alimento, int edad){
        //vamos a poder obtener acceso a los datos de acuerdo al parametro
        /*para poder obtener el paso de los parametros es necesario acceder a ellos desde la misma clase, derivado de la parte privada a partir de la palabra reservada this*/
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;

    }

    /*para poder acceder a los atributos debemos utilizar los metodos getter and setter
    get -> obtener->recibir
    set -> asugnar->enviar
    */ 

    //recibir
    public String getNombre(){
        return nombre;
    }

    //enviar
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //recibir
    public String getRaza(){
        return raza;
    }

    //enviar
    public void setRaza(String raza){
        this.raza = raza;
    }

    //recibir
    public String getTipo_alimento(){
        return tipo_alimento;
    }

    //enviar
    public void setTipo_alimento(String tipo_alimento){
        this.tipo_alimento = tipo_alimento;
    }

    //recibir
    public int getEdad(){
        return edad;
    }

    //enviar
    public void setEdad(int edad){
        this.edad = edad;
    }


    
}
