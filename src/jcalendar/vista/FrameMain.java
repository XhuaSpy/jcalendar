package jcalendar.vista;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Jesus Peraza
 */
public class FrameMain extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrameMain.class.getName());

    public FrameMain() {
        initComponents();
    }

    public JScrollPane getSPaneContenidoTarea() {
        return SPaneContenidoTarea;
    }

    public void setSPaneContenidoTarea(JScrollPane SPaneContenidoTarea) {
        this.SPaneContenidoTarea = SPaneContenidoTarea;
    }

    public JTabbedPane getTabbedPane() {
        return TabbedPane;
    }

    public void setTabbedPane(JTabbedPane TabbedPane) {
        this.TabbedPane = TabbedPane;
    }

    public JTable getTablaTareas() {
        return TablaTareas;
    }

    public void setTablaTareas(JTable TablaTareas) {
        this.TablaTareas = TablaTareas;
    }

    public JButton getBtnBuscarTarea() {
        return btnBuscarTarea;
    }

    public void setBtnBuscarTarea(JButton btnBuscarTarea) {
        this.btnBuscarTarea = btnBuscarTarea;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnRecargarTabla() {
        return btnRecargarTabla;
    }

    public void setBtnRecargarTabla(JButton btnRecargarTabla) {
        this.btnRecargarTabla = btnRecargarTabla;
    }

    public JButton getBtnSeleccionarDia() {
        return btnSeleccionarDia;
    }

    public void setBtnSeleccionarDia(JButton btnSeleccionarDia) {
        this.btnSeleccionarDia = btnSeleccionarDia;
    }

    public JCalendar getCalendario() {
        return calendario;
    }

    public void setCalendario(JCalendar calendario) {
        this.calendario = calendario;
    }

    public JLabel getContenidoBuscado() {
        return contenidoBuscado;
    }

    public void setContenidoBuscado(JLabel contenidoBuscado) {
        this.contenidoBuscado = contenidoBuscado;
    }

    public JLabel getContenidoBuscadoLabel() {
        return contenidoBuscadoLabel;
    }

    public void setContenidoBuscadoLabel(JLabel contenidoBuscadoLabel) {
        this.contenidoBuscadoLabel = contenidoBuscadoLabel;
    }

    public JTextArea getContenidoTarea() {
        return contenidoTarea;
    }

    public void setContenidoTarea(JTextArea contenidoTarea) {
        this.contenidoTarea = contenidoTarea;
    }

    public JLabel getContenidoTareaLabel() {
        return contenidoTareaLabel;
    }

    public void setContenidoTareaLabel(JLabel contenidoTareaLabel) {
        this.contenidoTareaLabel = contenidoTareaLabel;
    }

    public JDateChooser getEscogerDiaDeBusqueda() {
        return escogerDiaDeBusqueda;
    }

    public void setEscogerDiaDeBusqueda(JDateChooser escogerDiaDeBusqueda) {
        this.escogerDiaDeBusqueda = escogerDiaDeBusqueda;
    }

    public JLabel getEscogerDiaLabel() {
        return escogerDiaLabel;
    }

    public void setEscogerDiaLabel(JLabel escogerDiaLabel) {
        this.escogerDiaLabel = escogerDiaLabel;
    }

    public JLabel getNombreBuscado() {
        return nombreBuscado;
    }

    public void setNombreBuscado(JLabel nombreBuscado) {
        this.nombreBuscado = nombreBuscado;
    }

    public JLabel getNombreBuscadoLabel() {
        return nombreBuscadoLabel;
    }

    public void setNombreBuscadoLabel(JLabel nombreBuscadoLabel) {
        this.nombreBuscadoLabel = nombreBuscadoLabel;
    }

    public JTextField getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(JTextField nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public JLabel getNombreTareaLabel() {
        return nombreTareaLabel;
    }

    public void setNombreTareaLabel(JLabel nombreTareaLabel) {
        this.nombreTareaLabel = nombreTareaLabel;
    }

    public JPanel getPaneCalendario() {
        return paneCalendario;
    }

    public void setPaneCalendario(JPanel paneCalendario) {
        this.paneCalendario = paneCalendario;
    }

    public JPanel getPaneHerramientas() {
        return paneHerramientas;
    }

    public void setPaneHerramientas(JPanel paneHerramientas) {
        this.paneHerramientas = paneHerramientas;
    }

    public JPanel getPaneListaTareas() {
        return paneListaTareas;
    }

    public void setPaneListaTareas(JPanel paneListaTareas) {
        this.paneListaTareas = paneListaTareas;
    }

    public JScrollPane getPaneTablaTareas() {
        return paneTablaTareas;
    }

    public void setPaneTablaTareas(JScrollPane paneTablaTareas) {
        this.paneTablaTareas = paneTablaTareas;
    }

    public JPanel getPanelTareas() {
        return panelTareas;
    }

    public void setPanelTareas(JPanel panelTareas) {
        this.panelTareas = panelTareas;
    }

    public JLabel getTextoFecha() {
        return textoFecha;
    }

    public void setTextoFecha(JLabel textoFecha) {
        this.textoFecha = textoFecha;
    }

    public JLabel getTituloLabel() {
        return tituloLabel;
    }

    public void setTituloLabel(JLabel tituloLabel) {
        this.tituloLabel = tituloLabel;
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpfondo = new javax.swing.JPanel();
        TabbedPane = new javax.swing.JTabbedPane();
        paneCalendario = new javax.swing.JPanel();
        calendario = new com.toedter.calendar.JCalendar();
        panelTareas = new javax.swing.JPanel();
        nombreTareaLabel = new javax.swing.JLabel();
        nombreTarea = new javax.swing.JTextField();
        contenidoTareaLabel = new javax.swing.JLabel();
        SPaneContenidoTarea = new javax.swing.JScrollPane();
        contenidoTarea = new javax.swing.JTextArea();
        btnCargar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSeleccionarDia = new javax.swing.JButton();
        textoFecha = new javax.swing.JLabel();
        paneHerramientas = new javax.swing.JPanel();
        escogerDiaLabel = new javax.swing.JLabel();
        escogerDiaDeBusqueda = new com.toedter.calendar.JDateChooser();
        nombreBuscadoLabel = new javax.swing.JLabel();
        nombreBuscado = new javax.swing.JLabel();
        contenidoBuscadoLabel = new javax.swing.JLabel();
        contenidoBuscado = new javax.swing.JLabel();
        btnBuscarTarea = new javax.swing.JButton();
        paneListaTareas = new javax.swing.JPanel();
        btnRecargarTabla = new javax.swing.JButton();
        paneTablaTareas = new javax.swing.JScrollPane();
        TablaTareas = new javax.swing.JTable();
        tituloLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        setResizable(false);

        Jpfondo.setBackground(new java.awt.Color(199, 3, 3));
        Jpfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        TabbedPane.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        paneCalendario.setBackground(new java.awt.Color(255, 255, 255));
        paneCalendario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        calendario.setBackground(new java.awt.Color(255, 255, 255));
        calendario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        calendario.setOpaque(false);
        calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarioPropertyChange(evt);
            }
        });

        panelTareas.setBackground(new java.awt.Color(255, 255, 255));
        panelTareas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreTareaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombreTareaLabel.setText("Nombre:");
        panelTareas.add(nombreTareaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        nombreTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTareaActionPerformed(evt);
            }
        });
        panelTareas.add(nombreTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 16, 436, -1));

        contenidoTareaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        contenidoTareaLabel.setText("Contenido:");
        panelTareas.add(contenidoTareaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        contenidoTarea.setColumns(20);
        contenidoTarea.setRows(5);
        SPaneContenidoTarea.setViewportView(contenidoTarea);

        panelTareas.add(SPaneContenidoTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 57, 436, 140));

        btnCargar.setBackground(new java.awt.Color(199, 3, 3));
        btnCargar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setText("Cargar");
        panelTareas.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 16, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(199, 3, 3));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        panelTareas.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 57, -1, -1));

        btnSeleccionarDia.setBackground(new java.awt.Color(199, 3, 3));
        btnSeleccionarDia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSeleccionarDia.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionarDia.setText("Seleccionar día");
        btnSeleccionarDia.setToolTipText("");
        btnSeleccionarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneCalendarioLayout = new javax.swing.GroupLayout(paneCalendario);
        paneCalendario.setLayout(paneCalendarioLayout);
        paneCalendarioLayout.setHorizontalGroup(
            paneCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCalendarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneCalendarioLayout.createSequentialGroup()
                        .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(paneCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSeleccionarDia)
                            .addComponent(textoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(paneCalendarioLayout.createSequentialGroup()
                        .addComponent(panelTareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        paneCalendarioLayout.setVerticalGroup(
            paneCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCalendarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneCalendarioLayout.createSequentialGroup()
                        .addComponent(btnSeleccionarDia)
                        .addGap(28, 28, 28)
                        .addComponent(textoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(panelTareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPane.addTab("Calendario", paneCalendario);

        paneHerramientas.setBackground(new java.awt.Color(255, 255, 255));

        escogerDiaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        escogerDiaLabel.setText("Escoger día");

        escogerDiaDeBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        escogerDiaDeBusqueda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        nombreBuscadoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombreBuscadoLabel.setText("Nombre");

        nombreBuscado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombreBuscado.setText("-");

        contenidoBuscadoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        contenidoBuscadoLabel.setText("Contenido");

        contenidoBuscado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        contenidoBuscado.setText("-");

        btnBuscarTarea.setBackground(new java.awt.Color(199, 3, 3));
        btnBuscarTarea.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscarTarea.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarTarea.setText("Buscar tarea");
        btnBuscarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneHerramientasLayout = new javax.swing.GroupLayout(paneHerramientas);
        paneHerramientas.setLayout(paneHerramientasLayout);
        paneHerramientasLayout.setHorizontalGroup(
            paneHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneHerramientasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(paneHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(escogerDiaLabel)
                    .addComponent(nombreBuscadoLabel)
                    .addComponent(contenidoBuscadoLabel))
                .addGap(43, 43, 43)
                .addGroup(paneHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(escogerDiaDeBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(nombreBuscado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenidoBuscado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addComponent(btnBuscarTarea)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        paneHerramientasLayout.setVerticalGroup(
            paneHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneHerramientasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(paneHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(escogerDiaDeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escogerDiaLabel)
                    .addComponent(btnBuscarTarea))
                .addGap(30, 30, 30)
                .addGroup(paneHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreBuscadoLabel)
                    .addComponent(nombreBuscado))
                .addGap(26, 26, 26)
                .addGroup(paneHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contenidoBuscadoLabel)
                    .addComponent(contenidoBuscado))
                .addContainerGap(353, Short.MAX_VALUE))
        );

        escogerDiaDeBusqueda.getAccessibleContext().setAccessibleParent(escogerDiaDeBusqueda);

        TabbedPane.addTab("Herramientas", paneHerramientas);

        paneListaTareas.setBackground(new java.awt.Color(255, 255, 255));
        paneListaTareas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRecargarTabla.setBackground(new java.awt.Color(199, 3, 3));
        btnRecargarTabla.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRecargarTabla.setForeground(new java.awt.Color(255, 255, 255));
        btnRecargarTabla.setText("Recargar tareas");
        paneListaTareas.add(btnRecargarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 26, -1, -1));

        TablaTareas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TablaTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaTareas.setGridColor(new java.awt.Color(153, 153, 153));
        TablaTareas.setSelectionBackground(new java.awt.Color(200, 227, 253));
        TablaTareas.setShowHorizontalLines(true);
        TablaTareas.setShowVerticalLines(true);
        TablaTareas.getTableHeader().setReorderingAllowed(false);
        paneTablaTareas.setViewportView(TablaTareas);
        if (TablaTareas.getColumnModel().getColumnCount() > 0) {
            TablaTareas.getColumnModel().getColumn(0).setMinWidth(2);
        }

        paneListaTareas.add(paneTablaTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 640, 410));

        TabbedPane.addTab("Tareas", paneListaTareas);

        Jpfondo.add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 640, 520));
        TabbedPane.getAccessibleContext().setAccessibleName("Calendario");

        tituloLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("JCalendar");
        Jpfondo.add(tituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -20, 445, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarTareaActionPerformed

    private void btnSeleccionarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeleccionarDiaActionPerformed

    private void calendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarioPropertyChange

    }//GEN-LAST:event_calendarioPropertyChange

    private void nombreTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTareaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpfondo;
    private javax.swing.JScrollPane SPaneContenidoTarea;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JTable TablaTareas;
    private javax.swing.JButton btnBuscarTarea;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRecargarTabla;
    private javax.swing.JButton btnSeleccionarDia;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JLabel contenidoBuscado;
    private javax.swing.JLabel contenidoBuscadoLabel;
    private javax.swing.JTextArea contenidoTarea;
    private javax.swing.JLabel contenidoTareaLabel;
    private com.toedter.calendar.JDateChooser escogerDiaDeBusqueda;
    private javax.swing.JLabel escogerDiaLabel;
    private javax.swing.JLabel nombreBuscado;
    private javax.swing.JLabel nombreBuscadoLabel;
    private javax.swing.JTextField nombreTarea;
    private javax.swing.JLabel nombreTareaLabel;
    private javax.swing.JPanel paneCalendario;
    private javax.swing.JPanel paneHerramientas;
    private javax.swing.JPanel paneListaTareas;
    private javax.swing.JScrollPane paneTablaTareas;
    private javax.swing.JPanel panelTareas;
    private javax.swing.JLabel textoFecha;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
