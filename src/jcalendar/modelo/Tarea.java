package jcalendar.modelo;

import java.util.Date;

/**
  *Permite crear una instacia de tipo Tarea con los siguientes datos:
 * fecha,mombre,contenido
 * @author Juan Rodriguez
 */
public class Tarea {
     /**
     * Atributo de Tarea que almacena la fecha en la que se realizara la tarea
     */
     private Fecha fecha;
     /**
     * Atributo de Tarea que almacena el nombre de la tarea.
     */
    private String nombre;
     /**
     * Atributo de Tarea que almacena el contenido o descripcion de la tarea.
     */
    private String contenido;

    /**
     *Constructor basico que crea una instacia del la Tare con datos nulos en el
     *caso de los datos de tipo String y la fecha con su respectivo constructor basico.
     */
    public Tarea() {
        this.fecha=new Fecha();
        this.nombre="";
        this.contenido="";
    }

    /**
     * Constructor parametrico que crea una instacia del la Tarea a partir de los siguientes datos:
     * @param nombre Nombre de la tarea
     * @param contenido Descripcion o contenido de la tarea
     */
    public Tarea(String nombre, String contenido) {
        this.nombre = nombre;
        this.contenido = contenido;
    }

    /**
     *Constructor parametrico que crea una instacia del la Tarea a partir de los siguientes datos:
     * @param fecha Fecha en la que se va realizar la tarea
     * @param nombre Nombre de la tarea
     * @param contenido Descripcion o contenido de la tarea
     */
    public Tarea(Fecha fecha, String nombre, String contenido) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.contenido = contenido;
    }

    /**
     *Retorna el nombre de la tarea
     * @return Nombre de la tarea
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *Asigna el nombre de la tarea
     * @param nombre Nombre de la tarea
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna el contenido o descripcion de la tarea
     * @return contenido o descripcion de la tarea
     */
    public String getContenido() {
        return contenido;
    }

    /**
     *Asigna el contenido o descripcion de la tarea
     * @param contenido contenido o descripcion de la tarea
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Retorna fecha de la tarea
     * @return Fecha de la tarea
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * Asignala fecha de la tarea
     * @param fecha Fecha de la tarea
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    /**
     * Retorna los datos de la tarea en una cadena de caracteres
     * @return Datos de la tarea
     */
    @Override
    public String toString() {
        return "Tarea{" + "fecha=" + fecha.toString() + ", nombre=" + nombre + ", contenido=" + contenido + '}';
    }

    
}
