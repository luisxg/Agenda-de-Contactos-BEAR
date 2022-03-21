/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import Metodos.GrupoUsuarios;
import Metodos.Sonidos;
import Metodos.Usuario;
import Validaciones.ValidarDatos;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author luisg
 */
public class CrearUsuario extends javax.swing.JFrame implements Serializable{

    Login lg = new Login();
    ValidarDatos vd = new ValidarDatos();
    GrupoUsuarios gus = new GrupoUsuarios();
    Usuario us;
    AlertaError ae;
    Usuario[] usuarios;
    Sonidos music = new Sonidos();
    /**
     * Creates new form CrearUsuario
     */
    public CrearUsuario() {
        initComponents();
        iniciar();
    }

    public void iniciar() {
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Images/Logo_Oso124x128.png")).getImage());
        this.setTitle("Registro de usuario");
        music = new Sonidos();
    }

    public void limpiar() {
        txtNombre.setText("");
        txtClave.setText("");
        txtClaveR.setText("");
        txtCorreo.setText("");
    }
    //

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtClaveR = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(112, 33, 28));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registra tu usuario para Agenda BEAR");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setToolTipText("");
        txtNombre.setName(""); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 180, 31));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ej. Usuario");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Usuario45x45.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 51, 51));

        txtClaveR.setBackground(new java.awt.Color(51, 51, 51));
        txtClaveR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClaveR.setForeground(new java.awt.Color(255, 255, 255));
        txtClaveR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClaveR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveRActionPerformed(evt);
            }
        });
        jPanel2.add(txtClaveR, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 180, 29));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Repite tu clave");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        txtClave.setBackground(new java.awt.Color(51, 51, 51));
        txtClave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClave.setForeground(new java.awt.Color(255, 255, 255));
        txtClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 180, 29));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ej. 12345");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(102, 102, 102));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIngresar.setText("Crear Usuario");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 120, 33));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PassWord60x59.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo_Oso124x128.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnVolver.setBackground(new java.awt.Color(255, 0, 51));
        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 80, 30));

        txtCorreo.setBackground(new java.awt.Color(51, 51, 51));
        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setToolTipText("");
        txtCorreo.setName(""); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 180, 31));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ej. example@gmail.com");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/correo.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 60, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CrearContacto.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 400));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String nombre = txtNombre.getText();
        String correo = txtCorreo.getText();
        String clave = txtClave.getText();
        String claveR = txtClaveR.getText();
        //valido si es repetido el user
        boolean nomRepetido = gus.repetido(us, nombre);
        //fin valido si es repetido el user
        boolean confirma = false;
        if (nombre.equals("") || clave.equals("") || claveR.equals("") || correo.equals("")) {
            music.musicaError();
            ae = new AlertaError("Todos los campos son obligatorios", "Verifique que no esten vacios");
            ae.setVisible(true);
        } else if(nomRepetido == false){
            boolean n = vd.validarNombre(nombre);
            boolean c = vd.validarClave(clave);
            boolean vc = vd.validarCorreo(correo);

            if (clave.equals(claveR) && n == true && c == true && vc == true) {
                usuarios = gus.getUsuarios();
                for (int i = 0; i < gus.getNumeroUsuarios(); i++) {
                    if (nombre.equals(usuarios[i].getNombre())) {
                        confirma = true;
                    }
                }
                if (confirma == true) {
                    music.musicaError();
                    ae = new AlertaError("El usuario no fue ingresado", "El usuario ya existe");
                    ae.setVisible(true);
                } else {
                    int i = gus.getNumeroUsuarios();
                    if (i == 0) {
                        us = new Usuario(0, nombre, correo, clave);
                        gus.añadirUsuario(us);
                    } else {
                        us = new Usuario(i++, nombre, correo, clave);
                        gus.añadirUsuario(us);
                    }
                    System.out.println(gus.imprimirUsuarios());
                    limpiar();
                    
                    AlertaBien ab = new AlertaBien("El usuario fue agregado exitosamente", "");
                    ab.setVisible(true);
                }
            } else {
                music.musicaError();
                ae = new AlertaError("El usuario no fue ingresado", "Verifique los campos requeridos");
                ae.setVisible(true);
            }
        }else{
            music.musicaError();
            ae = new AlertaError("El usuario "+nombre, " ya existe");
            ae.setVisible(true);
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        lg.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtClaveRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveRActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

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
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JPasswordField txtClaveR;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
