/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladordado;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.sql.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author max98
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.fncInsertarPicture(this.panelImgCaras, "/Imagenes/"+ 1 +".GIF", true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        listResultadosCaras = new javax.swing.JList<>();
        bntIniciar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnInforme = new javax.swing.JButton();
        panelImgCaras = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBackground.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setText("Dado");

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "", "", null},
                {"2", "", "", null},
                {"3", "", "", null},
                {"4", "", "", null},
                {"5", "", "", null},
                {"6", "", "", null}
            },
            new String [] {
                "Cara", "ni", "fi", "Fi"
            }
        ));
        jScrollPane1.setViewportView(tblResultado);

        listResultadosCaras.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listResultadosCaras);

        bntIniciar.setBackground(new java.awt.Color(153, 51, 0));
        bntIniciar.setForeground(new java.awt.Color(255, 255, 255));
        bntIniciar.setText("Iniciar");
        bntIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bntIniciarMouseReleased(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 51, 153));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarMousePressed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNuevoMouseReleased(evt);
            }
        });

        btnInforme.setBackground(new java.awt.Color(255, 204, 0));
        btnInforme.setForeground(new java.awt.Color(255, 255, 255));
        btnInforme.setText("Informe");
        btnInforme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnInformeMouseReleased(evt);
            }
        });

        panelImgCaras.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelImgCarasLayout = new javax.swing.GroupLayout(panelImgCaras);
        panelImgCaras.setLayout(panelImgCarasLayout);
        panelImgCarasLayout.setHorizontalGroup(
            panelImgCarasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImgCarasLayout.setVerticalGroup(
            panelImgCarasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1)
                        .addGap(0, 116, Short.MAX_VALUE))
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInforme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntIniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelImgCaras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane1))
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addComponent(panelImgCaras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(bntIniciar)
                        .addGap(18, 18, 18)
                        .addComponent(btnInforme)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntIniciarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntIniciarMouseReleased
        // TODO add your handling code here:
        
        ActionListener tarea = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int min=1, max=6;
                int cara = (int) ( (max-min+1)*Math.random()+min );
                intTotalDeResultados ++;
                fncInsertarPicture(panelImgCaras, "/Imagenes/"+ cara +".GIF", true);

                modeloLista.addElement("Salio el dado con " +  cara + " caras.");
                listResultadosCaras.setModel(modeloLista);
                fncContador( cara );
            }
        };
        
        tiempo.addActionListener(tarea);
        tiempo.start();
        this.Run = true;
     
    }//GEN-LAST:event_bntIniciarMouseReleased

    private void btnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMousePressed
        
        // * Si el programa ya se ha inicializado se guardan los datos
        // de lo contrario marca un error....
        if( this.Run ){
            
            // Guardar los datos a la base de datos
            this.fncEliminarDatos();
            this.fncGuardarDatos();
        
        }else{
            
            JOptionPane.showMessageDialog(null, "Lo siento, el programa aun no ha iniciado");
        
        }
        
    }//GEN-LAST:event_btnGuardarMousePressed

    private void btnInformeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformeMouseReleased
        
            
        // Generar el reporte de los datos a la base de datos.
        this.fncGenerarReporteVa();
        
    }//GEN-LAST:event_btnInformeMouseReleased

    private void btnNuevoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseReleased
        // TODO add your handling code here:
        this.fncLimpiarTodo();
    }//GEN-LAST:event_btnNuevoMouseReleased
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntIniciar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listResultadosCaras;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelImgCaras;
    private javax.swing.JTable tblResultado;
    // End of variables declaration//GEN-END:variables
   private DefaultListModel modeloLista = new DefaultListModel();
   private int intTotalDeResultados;
   private ActionListener escucha;
   private Timer tiempo = new Timer(1000, escucha);
   private boolean Run = false;
   
   public void fncGenerarReporteVa(){
        File master=null;
        try {
            master = new File(getClass().getResource("rptva.jasper").toURI());
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se puede abrir el archivo ó No existe en esta ruta","Error",JOptionPane.ERROR_MESSAGE);
        }
        try{
            JasperReport masterReport = null;
            try{
                masterReport = (JasperReport) JRLoader.loadObject(master);
            }
            catch (JRException e){
                System.out.println("Error al cargar el archivo de reporte maestro: " + e.getMessage());
            }
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,null, DriverManager.getConnection("jdbc:mysql://localhost/bdva", "root", "") );
            JasperViewer jviewer = new JasperViewer(jasperPrint,false);
            jviewer.setTitle("Reporte de usuarios");
            jviewer.setVisible(true);
        }
        catch (Exception j){
            System.out.println("Mensaje de Error:"+j.getMessage());
        }
    }
   
   private void fncContador(int cara){      
        
        for(int item = 0; item < 6; item++){
            
            if( this.tblResultado.getValueAt(item,1).toString().isEmpty()){
                this.tblResultado.setValueAt(0,item,1);
            }else if( this.tblResultado.getValueAt(item,2).toString().isEmpty()){
                this.tblResultado.setValueAt(0,item,2);
            }
            
            // Contador de caras
            if( cara == (item + 1) ) {
                this.tblResultado.setValueAt( Integer.parseInt(this.tblResultado.getValueAt(item ,1).toString()) + 1, item, 1);
            }
            
            // Frecuencia relativa
            double parse = Double.parseDouble(this.tblResultado.getValueAt(item ,1).toString()) / this.intTotalDeResultados;
            this.tblResultado.setValueAt( String.format("%.2f", parse ) , item, 2);

        }
        
        // Frecuencia relativa acumulada
        this.tblResultado.setValueAt( String.format("%.2f", fncSumas(0) ), 0, 3);
        this.tblResultado.setValueAt( String.format("%.2f", fncSumas(1) ), 1, 3);
        this.tblResultado.setValueAt( String.format("%.2f", fncSumas(2) ), 2, 3);
        this.tblResultado.setValueAt( String.format("%.2f", fncSumas(3) ), 3, 3);
        this.tblResultado.setValueAt( String.format("%.2f", fncSumas(4) ), 4, 3);
        this.tblResultado.setValueAt( String.format("%.2f", fncSumas(5) ), 5, 3);

    }
    
    private double fncSumas(int items){
        double suma = 0;
        for(int item = 0; item <= items; item++){
            suma += Double.parseDouble(this.tblResultado.getValueAt(item ,2).toString());
        }
        return suma;
    }
    
    private void fncInsertarPicture(JPanel contenedor, String url, boolean vaciar){
        
        if(vaciar) contenedor.removeAll();
        
        ImageIcon icono = new ImageIcon( getClass().getResource(url) );
        JLabel etiquetaImagen = new JLabel();
        etiquetaImagen.setBounds(0, 0, contenedor.getWidth(), contenedor.getHeight());
        etiquetaImagen.setIcon( new ImageIcon(icono.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_SMOOTH)) );
        contenedor.add(etiquetaImagen);
        
        if(vaciar) contenedor.validate();
        if(vaciar) contenedor.repaint();
    }
    
    private void fncGuardarDatos(){
        
        // TODO add your handling code here:
        tiempo.stop();
        
        try{
            
            for( int item=0; item < 6; item++ ){
                Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/bdva", "root", "");
                PreparedStatement query = connect.prepareStatement("INSERT into `tblva` VALUES(?,?,?,?,?)");
                
                query.setString(1, "0" );
                query.setString(2, this.tblResultado.getValueAt(item, 0).toString().trim() );
                query.setString(3, this.tblResultado.getValueAt(item, 1).toString().trim() );
                query.setString(4, this.tblResultado.getValueAt(item, 2).toString().trim() );
                query.setString(5, this.tblResultado.getValueAt(item, 3).toString().trim() );
                
                query.executeUpdate();
            }
            
            System.out.println("Datos registrados...");
            
        }catch(Exception e){
            System.out.println("Error de mysql : " + e.getMessage());
        }    
    
    }
    
    private void fncEliminarDatos(){
        
        try {
            
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdva", "root", "");
            PreparedStatement query = conexion.prepareStatement("DELETE FROM `tblva`");
            query.executeUpdate();
            
        } catch (Exception e) {
        }
        
    }

    private void fncLimpiarTodo() {
        
    }
    
}
