/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inmvipi.CrearCoodeudores;

import inmvipi.Conex_DB.Conex_DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import inmvipi.IVP.IVP;
/**
 *
 * @author USER
 */
public class JF_Coodeudores extends javax.swing.JFrame {
    
    Conex_DB cc = new Conex_DB();
    Connection con = cc.Conexion();
    private String idContrato;
    private String idClienteTipo;
    private String idInmuebl;
    private String idCliente;
    private String idCood1;
    private String idCood2;
    private String idClienteTip;
    /**
     * Creates new form Coodeudores
     */
    public JF_Coodeudores(String idContract, String idInmueble, String idClient, String idClienteTipo) {
        this.idContrato = idContrato;
        this.idInmuebl = idInmuebl;
        this.idCliente = idCliente;
        this.idCood1 = idCood1;
        this.idCood2 = idCood2;
        this.idClienteTip = idClienteTip;
        initComponents();
        idContrato = idContract;
        idInmuebl = idInmueble;
        idCliente= idClient;
        idClienteTip = idClienteTipo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        botonGuardarContrato = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        inCor1Cood1 = new javax.swing.JTextField();
        inIngresosCood1 = new javax.swing.JTextField();
        inNomCood1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        inCiudExpCood1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inTipoIdCood1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        inNumIdCood1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        inCor2Cood1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NumIdCood1 = new javax.swing.JLabel();
        inTel1Cood1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        inTel2Cood1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        inTipoIdCood2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        inTel2Cood2 = new javax.swing.JTextField();
        inNumIdCood2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        inCor2Cood2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        inCor1Cood2 = new javax.swing.JTextField();
        inIngresosCood2 = new javax.swing.JTextField();
        NumIdCood2 = new javax.swing.JLabel();
        inNomCood2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        inCiudExp1Cood2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inTel1Cood2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel17.setText("INGRESOS");

        botonGuardarContrato.setText("GUARDAR CONTRATO");
        botonGuardarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarContratoActionPerformed(evt);
            }
        });

        jLabel18.setText("CORREO 1");

        jLabel11.setText("COODEUDOR 1");

        inCiudExpCood1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inCiudExpCood1ActionPerformed(evt);
            }
        });

        jLabel3.setText("TIPO DE DOCUMENTO");

        inTipoIdCood1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "NI", "CE", "PP", "PA" }));
        inTipoIdCood1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inTipoIdCood1ActionPerformed(evt);
            }
        });

        jLabel19.setText("CIUDAD EXPEDICION");

        inNumIdCood1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inNumIdCood1ActionPerformed(evt);
            }
        });

        jLabel20.setText("CORREO 2");

        jLabel21.setText("TELEFONO 1");

        jLabel12.setText("INSERTAR COODEUDORES DEL NUEVO CONTRATO PERSONA");

        NumIdCood1.setText("NUMERO DE IDENTIFICACION");

        jLabel22.setText("TELEFONO 2");

        jLabel13.setText("NOMBRES COMPLETOS");

        jLabel23.setText("TELEFONO 2");

        inTipoIdCood2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "NI", "CE", "PP", "PA" }));
        inTipoIdCood2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inTipoIdCood2ActionPerformed(evt);
            }
        });

        jLabel14.setText("NOMBRES COMPLETOS");

        jLabel24.setText("CIUDAD EXPEDICION");

        inNumIdCood2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inNumIdCood2ActionPerformed(evt);
            }
        });

        jLabel25.setText("CORREO 2");

        jLabel26.setText("INGRESOS");

        jLabel27.setText("CORREO 1");

        jLabel28.setText("TELEFONO 1");

        NumIdCood2.setText("NUMERO DE IDENTIFICACION");

        jLabel15.setText("COODEUDOR 2");

        inCiudExp1Cood2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inCiudExp1Cood2ActionPerformed(evt);
            }
        });

        jLabel5.setText("TIPO DE DOCUMENTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(219, 219, 219))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(213, 213, 213)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(NumIdCood1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(inNumIdCood1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(9, 9, 9))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(inNomCood1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(inIngresosCood1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(inCor1Cood1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(inCor2Cood1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(inTel1Cood1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(inTel2Cood1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inTipoIdCood1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel19)
                                        .addGap(4, 4, 4)
                                        .addComponent(inCiudExpCood1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inTipoIdCood2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)
                                .addGap(3, 3, 3)
                                .addComponent(inCiudExp1Cood2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(NumIdCood2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inNumIdCood2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inNomCood2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inIngresosCood2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inCor1Cood2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inCor2Cood2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inTel1Cood2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inTel2Cood2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(botonGuardarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumIdCood1)
                            .addComponent(inNumIdCood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(inTipoIdCood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(inCiudExpCood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(inNomCood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(inIngresosCood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(inCor1Cood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(inCor2Cood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(inTel1Cood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(inTel2Cood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumIdCood2)
                            .addComponent(inNumIdCood2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(inTipoIdCood2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(inCiudExp1Cood2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(inNomCood2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(inIngresosCood2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(inCor1Cood2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(inCor2Cood2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(inTel1Cood2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(inTel2Cood2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60)
                .addComponent(botonGuardarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void insertarCoodeudores () throws SQLException{
        con.setAutoCommit(false);
        try{
            String SQL = "INSERT INTO COODEUDOR (COODEUDOR_NUMERO_ID,COODEUDOR_NOMBRE_COMPLETO,COODEUDOR_CONTRATO_ID"
                      + ",COODEUDOR_INMUEBLE_ID,COODEUDOR_CORREO1,COODEUDOR_CORREO2,COODEUDOR_INGRESOS,COODEUDOR_TELEFONO1"
                      + ",COODEUDOR_TELEFONO2,COODEUDOR_LUGAR_EXP_ID) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.execute("USE IVP_DB");
            pst.setString(1, inNumIdCood1.getText());                    
            pst.setString(2, inNomCood1.getText());
            pst.setString(3, idContrato);                    
            pst.setString(4, idInmuebl);
            pst.setString(5, inCor1Cood1.getText());
            pst.setString(6, inCor2Cood1.getText());
            pst.setString(7, inIngresosCood1.getText());
            pst.setString(8, inTel1Cood1.getText());
            pst.setString(9, inTel2Cood1.getText());
            pst.setString(10, inTipoIdCood1.getSelectedItem().toString());;
            pst.execute();
            idCood1 = inNumIdCood1.getText();
            //JOptionPane.showMessageDialog(null,"Coodeudor1 insertado");
             String SQL2 = "INSERT INTO COODEUDOR (COODEUDOR_NUMERO_ID,COODEUDOR_NOMBRE_COMPLETO,COODEUDOR_CONTRATO_ID"
                      + ",COODEUDOR_INMUEBLE_ID,COODEUDOR_CORREO1,COODEUDOR_CORREO2,COODEUDOR_INGRESOS,COODEUDOR_TELEFONO1"
                      + ",COODEUDOR_TELEFONO2,COODEUDOR_LUGAR_EXP_ID) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst2 = con.prepareStatement(SQL2);
            pst2.execute("USE IVP_DB");
            pst2.setString(1, inNumIdCood2.getText());                    
            pst2.setString(2, inNomCood2.getText());
            pst2.setString(3, idContrato);                    
            pst2.setString(4, idInmuebl);
            pst2.setString(5, inCor1Cood2.getText());
            pst2.setString(6, inCor2Cood2.getText());
            pst2.setString(7, inIngresosCood2.getText());
            pst2.setString(8, inTel1Cood2.getText());
            pst2.setString(9, inTel2Cood2.getText());
            pst2.setString(10, inTipoIdCood2.getSelectedItem().toString());
            pst2.execute();
            idCood2 = inNumIdCood2.getText();
            //JOptionPane.showMessageDialog(null,"Coodeudor2 insertado");
            con.commit();
            String SQL3 = "UPDATE contrato SET CONTRATO_CLIENTE_ID = '"+idCliente+
                                                 "',CONTRATO_TIPO_ID = '"+idClienteTip+ 
                                            "',CONTRATO_COODEUDOR_ID1 = '"+idCood1+
                                           "',CONTRATO_COODEUDOR_ID2 = '"+idCood2+
                                                    "',CONTRATO_ANIO = right(contrato_numero_id,4) WHERE CONTRATO_NUMERO_ID = "+idContrato;
            PreparedStatement pst3 = con.prepareStatement(SQL3);
            System.out.println(SQL3);
            pst3.execute("USE IVP_DB");
            pst3.execute();
            con.commit();
            JOptionPane.showMessageDialog(null,"CONTRATO ACTUALIZADO");
            this.setVisible(false);
            IVP sistema = new IVP();
            sistema.setVisible(true);
        }catch (SQLException ex) {
            con.rollback(); 
            JOptionPane.showMessageDialog(null,"Error al insertar coodeudor: "+ex.getMessage());
        }
    }
    private void botonGuardarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarContratoActionPerformed
        try {
            insertarCoodeudores();
        } catch (SQLException ex) {
            Logger.getLogger(JF_Coodeudores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonGuardarContratoActionPerformed

    private void inNumIdCood1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inNumIdCood1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inNumIdCood1ActionPerformed

    private void inCiudExpCood1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inCiudExpCood1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inCiudExpCood1ActionPerformed

    private void inTipoIdCood1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inTipoIdCood1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inTipoIdCood1ActionPerformed

    private void inTipoIdCood2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inTipoIdCood2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inTipoIdCood2ActionPerformed

    private void inNumIdCood2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inNumIdCood2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inNumIdCood2ActionPerformed

    private void inCiudExp1Cood2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inCiudExp1Cood2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inCiudExp1Cood2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_Coodeudores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Coodeudores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Coodeudores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Coodeudores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Coodeudores("idContrato","idInmuebl","idClient","idClienteTipo").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NumIdCood1;
    private javax.swing.JLabel NumIdCood2;
    private javax.swing.JButton botonGuardarContrato;
    private javax.swing.JTextField inCiudExp1Cood2;
    private javax.swing.JTextField inCiudExpCood1;
    private javax.swing.JTextField inCor1Cood1;
    private javax.swing.JTextField inCor1Cood2;
    private javax.swing.JTextField inCor2Cood1;
    private javax.swing.JTextField inCor2Cood2;
    private javax.swing.JTextField inIngresosCood1;
    private javax.swing.JTextField inIngresosCood2;
    private javax.swing.JTextField inNomCood1;
    private javax.swing.JTextField inNomCood2;
    private javax.swing.JTextField inNumIdCood1;
    private javax.swing.JTextField inNumIdCood2;
    private javax.swing.JTextField inTel1Cood1;
    private javax.swing.JTextField inTel1Cood2;
    private javax.swing.JTextField inTel2Cood1;
    private javax.swing.JTextField inTel2Cood2;
    private javax.swing.JComboBox<String> inTipoIdCood1;
    private javax.swing.JComboBox<String> inTipoIdCood2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
