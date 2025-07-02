package jcalendar.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Repositorio de tareas con almacenamiento en memoria usando un HashMap.
 * 
 * Permite realizar operaciones CRUD básicas:
 * <ul>
 *   <li><b>listar</b>: obtener todas las tareas</li>
 *   <li><b>cargar</b>: insertar o actualizar una tarea</li>
 *   <li><b>buscar</b>: buscar una tarea por fecha</li>
 *   <li><b>eliminar</b>: eliminar una tarea por fecha o por objeto</li>
 * </ul>
 * 
 * @author Jesus Peraza
 */
public class TareaRepositorio {
     /**
     * Atributo de TareaRepositorio que almacena as tareas usando su fecha como clave única,
     * siendo a su vez tambien una variable de tipo final es decir una vez instaciada esta no puede
     * ser cambiada esto debido a que es la estructura de datos que va almacenar las tareas .
     */
    
    private final HashMap<String, Tarea> tareas;

    /**
     *Constructor basico del repositorio instacia el repositorio como un hashMap vacio
     */
    public TareaRepositorio() {
        tareas = new HashMap<>();
    }

    /**
     * Lista todas las tareas almacenadas.
     * @return lista de todas las tareas
     */
    public List<Tarea> listar() {
        return new ArrayList<>(tareas.values());
    }

    /**
     * Carga una tarea al repositorio. Si ya existe una tarea con la misma fecha,
     * se sobrescribe.
     * 
     * @param tarea la tarea a guardar o actualizar
     */
    public void cargar(Tarea tarea) {
        tareas.put(tarea.getFecha().toString(), tarea);
    }

    /**
     * Busca una tarea por fecha.
     * 
     * @param fecha la fecha de la tarea que se desea buscar
     * @return la tarea encontrada, o null si no existe
     */
    public Tarea buscar(String fecha) {
        return tareas.get(fecha);
    }

    /**
     * Busca una tarea usando la fecha del objeto Tarea proporcionado.
     * 
     * @param tarea la tarea cuyo campo fecha se usará como clave de búsqueda
     * @return la tarea encontrada, o null si no existe
     */
    public Tarea buscar(Tarea tarea) {
        return tareas.get(tarea.getFecha().toString());
    }

    /**
     * Elimina una tarea usando su fecha como clave.
     * 
     * @param fecha la fecha de la tarea que se desea eliminar
     * @return true si la tarea existía y fue eliminada, false en caso contrario
     */
    public boolean eliminar(String fecha) {
        return tareas.remove(fecha) != null;
    }

    /**
     * Elimina una tarea usando la fecha contenida en el objeto Tarea.
     * 
     * @param tarea la tarea a eliminar
     * @return true si la tarea existía y fue eliminada, false si no se encontró
     */
    public boolean eliminar(Tarea tarea) {
        return tareas.remove(tarea.getFecha().toString()) != null;
    }
}
