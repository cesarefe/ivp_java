package inmvipi.IVP_GUI;

import inmvipi.Conex_DB.Conex_DB;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import inmvipi.Menu.JF_Menu;

public class sistema extends javax.swing.JFrame {
    //Instanciar el objeto de conexion
    Conex_DB cc = new Conex_DB();
    Connection con = cc.Conexion();
    JF_Menu JF_Menu = new JF_Menu();

    public sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());
        consultaRapida();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsulRap = new javax.swing.JTable();
        ckboxVenta = new javax.swing.JCheckBox();
        ckboxArriendo = new javax.swing.JCheckBox();
        txtBarrio = new javax.swing.JLabel();
        txtTipo = new javax.swing.JLabel();
        txtDesc = new javax.swing.JLabel();
        txtMenorQue = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JLabel();
        txtNomProp = new javax.swing.JLabel();
        inBarrio = new javax.swing.JTextField();
        inTipo = new javax.swing.JTextField();
        inDesc = new javax.swing.JTextField();
        inMenorQue = new javax.swing.JTextField();
        inCiudad = new javax.swing.JTextField();
        inNomProp = new javax.swing.JTextField();
        botonLogin = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        txtClave = new javax.swing.JLabel();
        inUser = new javax.swing.JTextField();
        inClave = new javax.swing.JTextField();
        botonConsulta = new javax.swing.JButton();
        botonInsert = new javax.swing.JButton();
        limpiarConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaConsulRap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaConsulRap);

        ckboxVenta.setText("Venta");
        ckboxVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckboxVentaActionPerformed(evt);
            }
        });

        ckboxArriendo.setText("Arriendo");

        txtBarrio.setText("Barrio");

        txtTipo.setText("Tipo");

        txtDesc.setText("Descripcion");

        txtMenorQue.setText("Menor que");

        txtCiudad.setText("Ciudad");

        txtNomProp.setText("Nombrepropietario");

        inBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inBarrioActionPerformed(evt);
            }
        });

        inMenorQue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inMenorQueActionPerformed(evt);
            }
        });

        botonLogin.setText("Autenticarse");
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });

        txtUsuario.setText("Usuario");

        txtClave.setText("Clave");

        botonConsulta.setText("Buscar");
        botonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultaActionPerformed(evt);
            }
        });

        botonInsert.setText("Insertar");
        botonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertActionPerformed(evt);
            }
        });

        limpiarConsulta.setText("Limpiar");
        limpiarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ckboxVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckboxArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonConsulta)
                .addGap(18, 18, 18)
                .addComponent(botonInsert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonLogin)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 119, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtNomProp, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inNomProp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtMenorQue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inMenorQue, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtUsuario)
                                .addGap(33, 33, 33)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inUser, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inClave, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCiudad)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(limpiarConsulta)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckboxVenta)
                    .addComponent(ckboxArriendo)
                    .addComponent(botonLogin)
                    .addComponent(botonConsulta)
                    .addComponent(botonInsert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBarrio)
                    .addComponent(inBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario)
                    .addComponent(inUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo)
                    .addComponent(inTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClave)
                    .addComponent(inClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesc)
                    .addComponent(inDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMenorQue)
                    .addComponent(inMenorQue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCiudad)
                    .addComponent(inCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomProp)
                    .addComponent(inNomProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(limpiarConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckboxVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckboxVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckboxVentaActionPerformed

    private void inBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inBarrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inBarrioActionPerformed

    private void botonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertActionPerformed
        insertardatos();
        //consultaRapida();
    }//GEN-LAST:event_botonInsertActionPerformed

    private void limpiarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarConsultaActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_limpiarConsultaActionPerformed
    public void autenticar() {
         
        int exe = 0;    
        String [] titulosAut = {"RESULT"};//String resultadoo;
            String [] registrosAut = new String[1];
            String SQL = "SELECT 1 AS RESULT FROM usuario WHERE Usuario_Usuario= '" + inUser.getText() + "' AND usuario_Clave = '"+inClave.getText() + "' AND usuario_Estado = 'A'";
            try {                
            Statement st = con.createStatement();
            st.execute("USE IVP_DB");
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()){
                    registrosAut[0] = rs.getString("RESULT");
                    JOptionPane.showMessageDialog(null, "Autenticacion exitosa");
                    exe = 1;
            }
            if (exe == 1) {
                //JF_Menu.setSize(500,300);
                JF_Menu.setLocationRelativeTo(null);
                this.setVisible(false);
                JF_Menu.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Falla al autenticar: "+e.getMessage());
        }
    }
    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
        autenticar();
    }//GEN-LAST:event_botonLoginActionPerformed

    private void botonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultaActionPerformed
     consultaRapida2();
    }//GEN-LAST:event_botonConsultaActionPerformed

    private void inMenorQueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inMenorQueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inMenorQueActionPerformed
    public void limpiarCajas() {
    inBarrio.setText("");
    inTipo.setText("");
    inDesc.setText("");
    inMenorQue.setText("");
    inCiudad.setText("");
    inNomProp.setText("");
}
    public void insertardatos (){
        
        try{
            String SQL = 
                    "INSERT INTO inmueble (Inmueble_Tipo,inmueble_Barrio,Inmueble_Resumen,Inmueble_Valor_Negocio,Inmueble_Ciudad,inmueble_Client_id,inmueble_direccion,inmueble_localidad,inmueble_departamento,inmueble_zona,inmueble_Fecha_Creacion,inmueble_tipo_negocio ) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.execute("USE IVP_DB");
            pst.setString(1, inTipo.getText());
            pst.setString(2, inBarrio.getText());
            pst.setString(3, inDesc.getText());
            pst.setString(4, inMenorQue.getText());
            pst.setString(5, inCiudad.getText());
            pst.setString(6, "1014250252");
            pst.setString(7, "direccion aleatoria");
            pst.setString(8, "Engativa");
            pst.setString(9, "Cundinamarca");
            pst.setString(10, "Occidente");
            pst.setString(11, "18/03/18 10:00");
            pst.setString(12, "Arriendo");
             
            pst.execute();
            JOptionPane.showMessageDialog(null,"Ejecutado exitosamente");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al insertar inmueble: "+e.getMessage());
        }
    }
    public void consultaRapida(){
        String [] titulos = {"Tipo","Dirección","Barrio","Valor","Resumen"};
        String [] registros = new String[5];
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        String SQL = "SELECT Inmueble_Tipo,Inmueble_Direccion,Inmueble_Barrio,Inmueble_Valor_Negocio,Inmueble_Resumen FROM inmueble WHERE Inmueble_Tipo = 'Apto' ";
        try {                
            Statement st = con.createStatement();
            st.execute("USE IVP_DB");
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()){
                    registros[0] = rs.getString("Inmueble_Tipo");
                    registros[1] = rs.getString("Inmueble_Direccion");
                    registros[2] = rs.getString("Inmueble_Barrio");
                    registros[3] = rs.getString("Inmueble_Valor_Negocio");
                    registros[4] = rs.getString("Inmueble_Resumen");
                    
                    modelo.addRow(registros);
                }
           tablaConsulRap.setModel(modelo);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error al consultar inmueble: "+e.getMessage());
            }
            
    }
    public void consultaRapida2(){
        String [] titulos = {"Tipo","Dirección","Barrio","Valor","Resumen"};
        String [] registros = new String[5];
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        if (inMenorQue.getText().length() > 0) {
        //inMenorQue.setText("0");
        } else {
            inMenorQue.setText("0");
        }

        String SQL = "SELECT Inmueble_Tipo,Inmueble_Direccion,Inmueble_Barrio,Inmueble_Valor_Negocio,Inmueble_Resumen "
                     + "FROM inmueble "
                    + "WHERE LOWER(Inmueble_Tipo) = LOWER('" + inTipo.getText() +"') "
                      + "AND (LOWER(Inmueble_Barrio) LIKE LOWER('% "+inBarrio.getText()+"%') "
                       + "OR LOWER(Inmueble_Resumen) LIKE LOWER('% "+inDesc.getText()  +"%') "
                       + "OR Inmueble_Valor_Negocio <= "+inMenorQue.getText() + " );"
                ;
        try {                
            Statement st = con.createStatement();
            st.execute("USE IVP_DB");
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()){
                    registros[0] = rs.getString("Inmueble_Tipo");
                    registros[1] = rs.getString("Inmueble_Direccion");
                    registros[2] = rs.getString("Inmueble_Barrio");
                    registros[3] = rs.getString("Inmueble_Valor_Negocio");
                    registros[4] = rs.getString("Inmueble_Resumen");
                    
                    modelo.addRow(registros);
                }
           tablaConsulRap.setModel(modelo);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error al consultar inmueble: "+e.getMessage());
            }
            
    }
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
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConsulta;
    private javax.swing.JButton botonInsert;
    private javax.swing.JButton botonLogin;
    private javax.swing.JCheckBox ckboxArriendo;
    private javax.swing.JCheckBox ckboxVenta;
    private javax.swing.JTextField inBarrio;
    private javax.swing.JTextField inCiudad;
    private javax.swing.JTextField inClave;
    private javax.swing.JTextField inDesc;
    private javax.swing.JTextField inMenorQue;
    private javax.swing.JTextField inNomProp;
    private javax.swing.JTextField inTipo;
    private javax.swing.JTextField inUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarConsulta;
    private javax.swing.JTable tablaConsulRap;
    private javax.swing.JLabel txtBarrio;
    private javax.swing.JLabel txtCiudad;
    private javax.swing.JLabel txtClave;
    private javax.swing.JLabel txtDesc;
    private javax.swing.JLabel txtMenorQue;
    private javax.swing.JLabel txtNomProp;
    private javax.swing.JLabel txtTipo;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
