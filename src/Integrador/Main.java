/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrador;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Faith
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        ConOrigen = new PostgrDriver(this.txtx_NombreInstanciaOrigen, this.txt_NombreBDOrigen, this.txt_PuertoOrigen, this.txt_UsuarioOrigen, this.txt_ContraseniaOrigen, txt_BitConexion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Conexion = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtx_NombreInstanciaOrigen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_NombreBDOrigen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_PuertoOrigen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_UsuarioOrigen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_ContraseniaOrigen = new javax.swing.JTextField();
        txt_NombreBDDestino = new javax.swing.JTextField();
        txt_PuertoDestino = new javax.swing.JTextField();
        txt_UsuarioDestino = new javax.swing.JTextField();
        txt_ContraseniaDestino = new javax.swing.JTextField();
        txt_NombreInstacniaDestino = new javax.swing.JTextField();
        btn_GuardarConexion = new javax.swing.JButton();
        btn_RegresarC = new javax.swing.JButton();
        btn_Sincronizar = new javax.swing.JButton();
        btn_ProbarOrigen = new javax.swing.JButton();
        btn_ProbarDestino = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_BitConexion = new javax.swing.JTextArea();
        jd_Integracion = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Replicar = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_NoReplicar = new javax.swing.JList<>();
        btn_AgregarTablaNOReplica = new javax.swing.JButton();
        btn_AgregarTablaRepliaca = new javax.swing.JButton();
        btn_GuardarSincronizacion = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_RegresarS = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtA_Consola = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        lbl_Titulo = new javax.swing.JLabel();
        mb_Menu = new javax.swing.JMenuBar();
        mi_Integrador = new javax.swing.JMenu();
        mi_Salida = new javax.swing.JMenu();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Conexion de Bases de Datos");

        jLabel2.setText("Origen");

        jLabel3.setText("Nombre Instancia");

        txtx_NombreInstanciaOrigen.setText("database-1.ck0fj32e7uo3.us-east-1.rds.amazonaws.com ");

        jLabel4.setText("Nombre Bases de Datos");

        txt_NombreBDOrigen.setText("HR");

        jLabel5.setText("Puerto");

        txt_PuertoOrigen.setText("5432");

        jLabel6.setText("Usuario");

        txt_UsuarioOrigen.setText("postPower");

        jLabel7.setText("Contrasenia");

        txt_ContraseniaOrigen.setText("waySecure1");

        btn_GuardarConexion.setText("Guardar");

        btn_RegresarC.setText("Regresar");
        btn_RegresarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RegresarCMouseClicked(evt);
            }
        });

        btn_Sincronizar.setText("Sincronizar");
        btn_Sincronizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SincronizarMouseClicked(evt);
            }
        });

        btn_ProbarOrigen.setText("Probar");
        btn_ProbarOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProbarOrigenActionPerformed(evt);
            }
        });

        btn_ProbarDestino.setText("Probar");
        btn_ProbarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProbarDestinoActionPerformed(evt);
            }
        });

        jLabel13.setText("Destino");

        jLabel14.setText("Nombre Instancia");

        jLabel15.setText("Nombre Bases de Datos");

        jLabel16.setText("Puerto");

        jLabel17.setText("Usuario");

        jLabel18.setText("Contrasenia");

        txt_BitConexion.setColumns(20);
        txt_BitConexion.setRows(5);
        jScrollPane4.setViewportView(txt_BitConexion);

        javax.swing.GroupLayout jd_ConexionLayout = new javax.swing.GroupLayout(jd_Conexion.getContentPane());
        jd_Conexion.getContentPane().setLayout(jd_ConexionLayout);
        jd_ConexionLayout.setHorizontalGroup(
            jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ConexionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Sincronizar)
                .addGap(314, 314, 314)
                .addComponent(btn_RegresarC)
                .addGap(22, 22, 22))
            .addGroup(jd_ConexionLayout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_ConexionLayout.createSequentialGroup()
                .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_ConexionLayout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(btn_ProbarOrigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ProbarDestino))
                    .addGroup(jd_ConexionLayout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jd_ConexionLayout.createSequentialGroup()
                                .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_GuardarConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jd_ConexionLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(423, 423, 423))
                                    .addGroup(jd_ConexionLayout.createSequentialGroup()
                                        .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(txt_NombreBDOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_PuertoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_UsuarioOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ContraseniaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtx_NombreInstanciaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel18)
                                            .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel17)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(txt_PuertoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_UsuarioDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_ContraseniaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_NombreInstacniaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_NombreBDDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jd_ConexionLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(238, 238, 238))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jd_ConexionLayout.setVerticalGroup(
            jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ConexionLayout.createSequentialGroup()
                .addContainerGap(562, Short.MAX_VALUE)
                .addComponent(btn_RegresarC)
                .addGap(15, 15, 15))
            .addGroup(jd_ConexionLayout.createSequentialGroup()
                .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ConexionLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtx_NombreInstanciaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_NombreBDOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_PuertoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_UsuarioOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ContraseniaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel18)))
                    .addGroup(jd_ConexionLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(30, 30, 30)
                        .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_NombreInstacniaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addGroup(jd_ConexionLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txt_NombreBDDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)
                        .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txt_PuertoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_UsuarioDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addComponent(txt_ContraseniaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jd_ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ProbarOrigen)
                    .addComponent(btn_ProbarDestino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_GuardarConexion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Sincronizar)
                .addGap(27, 27, 27))
        );

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Sincronizacion de Tablas");

        lst_Replicar.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(lst_Replicar);

        lst_NoReplicar.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(lst_NoReplicar);

        btn_AgregarTablaNOReplica.setText("<<");

        btn_AgregarTablaRepliaca.setText(">>");

        btn_GuardarSincronizacion.setText("Guardar");
        btn_GuardarSincronizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarSincronizacionActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");

        jLabel9.setText("Sin Replicar");

        jLabel10.setText("Replicando");

        btn_RegresarS.setText("Regresar");
        btn_RegresarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RegresarSMouseClicked(evt);
            }
        });

        txtA_Consola.setColumns(20);
        txtA_Consola.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtA_Consola.setRows(5);
        jScrollPane3.setViewportView(txtA_Consola);

        javax.swing.GroupLayout jd_IntegracionLayout = new javax.swing.GroupLayout(jd_Integracion.getContentPane());
        jd_Integracion.getContentPane().setLayout(jd_IntegracionLayout);
        jd_IntegracionLayout.setHorizontalGroup(
            jd_IntegracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_IntegracionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_RegresarS)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_IntegracionLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jd_IntegracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jd_IntegracionLayout.createSequentialGroup()
                        .addGroup(jd_IntegracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_IntegracionLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addGroup(jd_IntegracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_AgregarTablaNOReplica)
                                    .addComponent(btn_AgregarTablaRepliaca)))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(jd_IntegracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(50, 50, 50))
            .addGroup(jd_IntegracionLayout.createSequentialGroup()
                .addGroup(jd_IntegracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_IntegracionLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btn_GuardarSincronizacion)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Cancelar))
                    .addGroup(jd_IntegracionLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_IntegracionLayout.setVerticalGroup(
            jd_IntegracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_IntegracionLayout.createSequentialGroup()
                .addGroup(jd_IntegracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_IntegracionLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_IntegracionLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8)
                        .addGap(116, 116, 116)
                        .addComponent(btn_AgregarTablaRepliaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_AgregarTablaNOReplica))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_IntegracionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jd_IntegracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_GuardarSincronizacion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_RegresarS)
                .addContainerGap())
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Integrador de Bases de Datos");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        lbl_Titulo.setFont(new java.awt.Font("Dialog", 1, 70)); // NOI18N
        lbl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo.setText("<html><p style=\"text-align:center\">Integrador <br>\nde<br>\nBases de Datos</p></html>");

        mi_Integrador.setText("Integrador");
        mi_Integrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mi_IntegradorMouseClicked(evt);
            }
        });
        mb_Menu.add(mi_Integrador);

        mi_Salida.setText("Salida");
        mi_Salida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mi_SalidaMouseClicked(evt);
            }
        });
        mb_Menu.add(mi_Salida);

        setJMenuBar(mb_Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mi_SalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_SalidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_mi_SalidaMouseClicked

    private void mi_IntegradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_IntegradorMouseClicked
        this.dispose();
        jd_Conexion.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jd_Conexion.setResizable(false);
        jd_Conexion.pack();
        jd_Conexion.setLocationRelativeTo(null); //Setearlo despues de pack()
        jd_Conexion.setVisible(true);
    }//GEN-LAST:event_mi_IntegradorMouseClicked

    private void btn_RegresarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegresarCMouseClicked
        jd_Conexion.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_btn_RegresarCMouseClicked

    private void btn_SincronizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SincronizarMouseClicked
        jd_Conexion.dispose();
        jd_Integracion.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jd_Integracion.setResizable(false);
        jd_Integracion.pack();
        jd_Integracion.setLocationRelativeTo(this); //Setearlo despues de pack()
        jd_Integracion.setVisible(true);
    }//GEN-LAST:event_btn_SincronizarMouseClicked

    private void btn_RegresarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegresarSMouseClicked
        jd_Integracion.dispose();
        jd_Conexion.setVisible(true);
    }//GEN-LAST:event_btn_RegresarSMouseClicked

    private void btn_GuardarSincronizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarSincronizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_GuardarSincronizacionActionPerformed

    private void btn_ProbarOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProbarOrigenActionPerformed
        //VALIDAR CAMPOS VACIOS
        try {
            if (txtx_NombreInstanciaOrigen.getText().length() > 0 && txt_NombreBDOrigen.getText().length() > 0 && txt_PuertoOrigen.getText().length() > 0
                && txt_UsuarioOrigen.getText().length() > 0 && txt_ContraseniaOrigen.getText().length() > 0  ) {
                ConOrigen.setIsPrueba(true);
                ConOrigen.crearConexion();
            }else{
                JOptionPane.showMessageDialog(null, "Faltan datos");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_ProbarOrigenActionPerformed

    private void btn_ProbarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProbarDestinoActionPerformed
        // VALIDAR CAMPOS VACIOS A DESTINATARIO
        try {
            if (txt_NombreInstacniaDestino.getText().length() > 0 && txt_NombreBDDestino.getText().length() > 0 && txt_PuertoDestino.getText().length() > 0
                   && txt_UsuarioDestino.getText().length() > 0 && txt_ContraseniaDestino.getText().length() > 0 ) {
                
            } else {
                JOptionPane.showMessageDialog(null, "Faltan datos");
            }                
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_ProbarDestinoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AgregarTablaNOReplica;
    private javax.swing.JButton btn_AgregarTablaRepliaca;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_GuardarConexion;
    private javax.swing.JButton btn_GuardarSincronizacion;
    private javax.swing.JButton btn_ProbarDestino;
    private javax.swing.JButton btn_ProbarOrigen;
    private javax.swing.JButton btn_RegresarC;
    private javax.swing.JButton btn_RegresarS;
    private javax.swing.JButton btn_Sincronizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JDialog jd_Conexion;
    private javax.swing.JDialog jd_Integracion;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JList<String> lst_NoReplicar;
    private javax.swing.JList<String> lst_Replicar;
    private javax.swing.JMenuBar mb_Menu;
    private javax.swing.JMenu mi_Integrador;
    private javax.swing.JMenu mi_Salida;
    private javax.swing.JTextArea txtA_Consola;
    private javax.swing.JTextArea txt_BitConexion;
    private javax.swing.JTextField txt_ContraseniaDestino;
    private javax.swing.JTextField txt_ContraseniaOrigen;
    private javax.swing.JTextField txt_NombreBDDestino;
    private javax.swing.JTextField txt_NombreBDOrigen;
    private javax.swing.JTextField txt_NombreInstacniaDestino;
    private javax.swing.JTextField txt_PuertoDestino;
    private javax.swing.JTextField txt_PuertoOrigen;
    private javax.swing.JTextField txt_UsuarioDestino;
    private javax.swing.JTextField txt_UsuarioOrigen;
    private javax.swing.JTextField txtx_NombreInstanciaOrigen;
    // End of variables declaration//GEN-END:variables
    private PostgrDriver ConOrigen;
}
