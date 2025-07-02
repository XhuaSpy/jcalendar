package jcalendar;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.UIManager;
import jcalendar.controlador.Controlador;

/**
 *Clase que permite ejecutar la aplicacion
 * @author Juan Rodriguez
 */
public class JCalendar {
 
    /**
     *Metodo principal en el cual se crea un objeto de tipo
     *controlador para poder inciar la aplicacion, tambien se añade
     *un Look and Feel de la libreria flatlaf para incoparar
     *un estilo a la interfaz, con algunas llaves del administrador de diseño
     *de Swing
     * @param args
     */
    public static void main(String[] args) {
     try {
        FlatLightLaf.setup();
        UIManager.put( "Component.arc", 999 );
        UIManager.put( "TextComponent.arc", 999 );
        UIManager.put("TableHeader.background", new Color(223,223,223));
        UIManager.put("Table.alternateRowColor", new Color(255,153,153));
    } catch (Exception ex) {
        System.err.println("No se pudo activar el Look and Feel");
    }
            new Controlador().iniciar();
    }
}
