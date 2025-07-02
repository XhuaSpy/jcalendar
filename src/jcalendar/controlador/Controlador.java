/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jcalendar.controlador;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import jcalendar.modelo.Fecha;
import jcalendar.modelo.Tarea;
import jcalendar.modelo.TareaRepositorio;
import jcalendar.vista.FrameMain;

/**
 * <p>
 * Clase principal del controlador de eventos de la aplicación. 
 * Se encarga de organizar la interacción entre la vista y el modelo,
 * escuchando los eventos de los botones y ejecutando las acciones correspondientes.
 * </p>
 * 
 * <p>
 * Acciones manejadas:
 * <ul>
 *   <li>Seleccionar día en el calendario</li>
 *   <li>Cargar tarea</li>
 *   <li>Eliminar tarea</li>
 *   <li>Buscar tarea</li>
 *   <li>Recargar tabla de tareas</li>
 * </ul>
 * </p>
 *
 * @author Jesus Peraza
 */
public class Controlador implements ActionListener {
    /**
     * Atributo de Controlador que almacena el Jframe de la aplicacion
     */
    private FrameMain frameMain;
      /**
     * Atributo de Controlador que almacena el repositorio con la estructura de datos 
     * que almacenara las tareas
     */
    private TareaRepositorio repositorio;

    /**
     *Constructor basico de controlador que instacia los atributos de la clase
     *con sus respectivos constructures basicos
     */
    public Controlador() {
        frameMain = new FrameMain();
        repositorio = new TareaRepositorio();
    }

    /**
     *Metodo que permite iniciar la conexión entre el modelo y la vista, 
    *añadiendo también actionListener a los componentes de la interfaz 
    *que desencadenen eventos, tambien se desabilita los editores en los 
    *componentes de Jcalendar, calendar al ser un componente con varios componentes
    *este se puede desarmar y configurar cada uno por aparte.
     */
    public void iniciar() {
        frameMain.setTitle("JCalendar");
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setLocationRelativeTo(null);
        iniciarListener(frameMain, this);
        frameMain.getPanelTareas().setVisible(false);
        ((JTextField)frameMain.getEscogerDiaDeBusqueda().getDateEditor().getUiComponent()).setEnabled(false);
        ((JTextField) ((JSpinner)frameMain.getCalendario().getYearChooser().getSpinner()).getEditor()).setEnabled(false);
        ((JTextField) ((JSpinner)frameMain.getEscogerDiaDeBusqueda().getJCalendar().getYearChooser().getSpinner()).
        getEditor()).setEnabled(false);
        frameMain.setVisible(true);
    }

    /**
     *Permite gestionar los diferentes eventos que se presenten en la interaccion
     *del usuario con la interfaz.
     * @param e Evento
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(frameMain.getBtnSeleccionarDia())) {
            accionSeleccionarDia();
        }
        if (e.getSource().equals(frameMain.getBtnCargar())) {
            accionCargar();
        }
        if (e.getSource().equals(frameMain.getBtnEliminar())) {
            accionEliminar();
        }
        if (e.getSource().equals(frameMain.getBtnBuscarTarea())) {
            accionBuscarTarea();
        }
        if (e.getSource().equals(frameMain.getBtnRecargarTabla())) {
            accionRecargarTabla();
        }

    }
     /**
     * Convierte datos de tipo calendar extraidos de un JDateChooser o JCalendar,
     * en un dato de tipo Fecha
     * @param Obj componete de la libreria Jcalendar
     * @return Fecha Retorna un objecto de tipo Fecha
     */
    public Fecha Tomar_Fecha(Object Obj) {
         Calendar fecha=null;
        if(Obj instanceof JDateChooser){
            fecha = ((JDateChooser)Obj).getCalendar();
        }else if(Obj instanceof JCalendar ){
            fecha = ((JCalendar)Obj).getCalendar();
        }
        return new Fecha(
                fecha.get(Calendar.DAY_OF_MONTH),
                (1 + fecha.get(Calendar.MONTH)),
                fecha.get(Calendar.YEAR)
        );
    }
    /**
     * Metodo que permite la seleccion de una fecha para cargar una tarea 
     * si la tarea ya existe dentro del panel de tareas muestra los datos de 
     * la tarea existente si no los muestra vacios
     */
    private void accionSeleccionarDia() {
        limpiarFormulario(this.frameMain.getPanelTareas());
        frameMain.getPanelTareas().setVisible(true);
        frameMain.getTextoFecha().setText(Tomar_Fecha(frameMain.getCalendario()).toString());
        Tarea tarea = repositorio.buscar(Tomar_Fecha(frameMain.getCalendario()).toString());
        if (tarea == null) {
            return;
        }
        frameMain.getNombreTarea().setText(tarea.getNombre());
        frameMain.getContenidoTarea().setText(tarea.getContenido());
    }
    /**
     * Metodo que permite insertar una tarea en el repositorio,
     * si inserta la tarea con datos incompletos muestra error y se sale del motodo
     * sino crea un dato de tipo tarea y la carga en el repositorio
     */
    private void accionCargar() {

        if (frameMain.getNombreTarea().getText().isBlank()
                || frameMain.getContenidoTarea().getText().isBlank()) {
            JOptionPane.showMessageDialog(
                    frameMain,
                    "Error: no agregaste parte de la informacion",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        Fecha fecha=Tomar_Fecha(frameMain.getCalendario());
        Tarea tarea = new Tarea(
                fecha,
                frameMain.getNombreTarea().getText(),
                frameMain.getContenidoTarea().getText()
        );
        repositorio.cargar(tarea);
        JOptionPane.showMessageDialog(
                frameMain, "Se cargó la tarea perfectamente", "Good",
                JOptionPane.PLAIN_MESSAGE);
        frameMain.getPanelTareas().setVisible(false);
    }
    /**
     * Metodo que permite elimianr una tarea, donde primero
     * verifica que exista una tarea en esa fecha, si existe la elimina
     * si no muetra error y sale del metodo
     */
    private void accionEliminar() {
        if (!repositorio.eliminar(Tomar_Fecha(frameMain.getCalendario()).toString())) {
            JOptionPane.showMessageDialog(
                    frameMain, "Error: no había taréa asignada",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(frameMain, "Se eliminó la tarea",
                "Good", JOptionPane.PLAIN_MESSAGE);

        frameMain.getPanelTareas().setVisible(false);
    }
  /**
     * Metodo que permite buscar la tarea a traves de la fecha 
     * donde primero se toma la fecha seleccionada del componente de JCalendar
     * para luego enviar los datos de esa fecha como una cadena de caracteres al 
     * metodo buscar del repositorio sino existe ninguna tarea se muestra en pantalla 
     * que no existe ninguna tarea programada para esa respectiva fecha, pero si existe
     * se muestran sus datos.
     */
    private void accionBuscarTarea() {
        limpiarFormulario(this.frameMain.getPanelTareas());
        Tarea tarea = repositorio.buscar(Tomar_Fecha(frameMain.getEscogerDiaDeBusqueda()).toString());
      if(tarea!=null){
        frameMain.getNombreBuscado().setText(tarea.getNombre());
        frameMain.getContenidoBuscado().setText(tarea.getContenido());
      }else{
       JOptionPane.showMessageDialog(
                    frameMain,
                    "No existe ninguna tarea programada para "+Tomar_Fecha(frameMain.getEscogerDiaDeBusqueda()).toString()
                    );
      }
    }
 /**
     * Metodo que permite actualizar la tabla de tareas, 
     * si no existe ninguna tarea registrada muestra en pantalla
     * no hay ninguna tarea registrada
     */
    private void accionRecargarTabla() {
        if(repositorio.listar().isEmpty()){
           if(frameMain.getTablaTareas().getRowCount()!=0){
           ((DefaultTableModel)frameMain.getTablaTareas().getModel()).setRowCount(0);
           }
        JOptionPane.showMessageDialog(
                    frameMain,
                    "No hay ninguna tarea registrada."
                    );
        }else{
        DefaultTableModel plantilla = (DefaultTableModel)frameMain.getTablaTareas().getModel();

        plantilla.setRowCount(0); // Limpia la tabla

        for (Tarea tarea : repositorio.listar()) {

            Object[] datos = {
                tarea.getFecha().toString(),
                tarea.getNombre(),};

            plantilla.addRow(datos);
        }
    }
    }
 /**
     * Limpia todos los campos de texto en el contenedor dado.
     * @param container contenedor que puede tener JTextField y otros
     * componentes
     */
    public static void limpiarFormulario(Container container) {
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            } else if (c instanceof JTextArea) {
                ((JTextArea) c).setText("");
            } else if (c instanceof Container ) {
                limpiarFormulario((Container) c);
            }
        }
    }

    /**
     * Asocia este controlador como listener de todos los botones y menús del
     * contenedor.
     *
     * @param container contenedor base (ej. JFrame o JPanel) donde buscar
     * componentes
     * @param listener el ActionLisener asociado, sera el que escucha los
     * eventos de los componentes.
     */
    public static void iniciarListener(Container container, ActionListener listener) {
        for (Component c : container.getComponents()) {
            if (c instanceof JButton) {
                ((JButton) c).addActionListener(listener);
            } else if (c instanceof JMenu) {
                for (int i = 0; i < ((JMenu) c).getItemCount(); i++) {
                    if (((JMenu) c).getItem(i) != null) {
                        ((JMenu) c).getItem(i).addActionListener(listener);
                    }
                }
            } else if (c instanceof Container) {
                iniciarListener((Container) c, listener);
            }
        }
    }
}
