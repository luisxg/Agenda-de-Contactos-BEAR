
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import JFrame.AlertaBien;
import JFrame.AlertaError;
import Metodos.Contactos.Contacto;
import Metodos.Contactos.GrupoContactos;
//import Metodos.Sonidos;
import Validaciones.ValidarDatos;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author luisg
 */
public class ModificarContacto extends javax.swing.JFrame implements Serializable{

    GrupoContactos grupoContactos;
    Contacto nuevoContacto;
    Contacto[] contactos;
    ValidarDatos valido = new ValidarDatos();
    AlertaError ae;
    AlertaBien ab;
//    Sonidos music;
    int nUsuario = 0;
    public ModificarContacto(GrupoContactos grupoContactos, int nUsuario) {
        initComponents();
        iniciar();
        this.grupoContactos = grupoContactos;
        this.nUsuario = nUsuario;
        this.setTitle("Modificar Contacto");
        setIconImage(new ImageIcon(getClass().getResource("/Images/Logo_Oso124x128.png")).getImage());
    }

    public ModificarContacto() {
    }

    public void iniciar() {
        setLocationRelativeTo(null);
//        music = new Sonidos();
    }

    public String[] buscar(String texto) {
        String[] buscado = grupoContactos.buscarContacto(texto);
        return buscado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panel_buscar = new javax.swing.JPanel();
        lbl_imgBuscar = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        newTelefono = new javax.swing.JTextField();
        newNombre = new javax.swing.JTextField();
        newCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MODIFICA TU CONTACTO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, -1));

        txt_buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_buscarFocusGained(evt);
            }
        });
        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarKeyTyped(evt);
            }
        });
        jPanel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 230, 30));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefono");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreo.setText("................................");
        jPanel4.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 150, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Correo");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 130, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nombre");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, -1));

        lblTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefono.setText("....................");
        jPanel4.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 150, 20));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("................................");
        jPanel4.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 540, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar por el nombre: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ej. Usuario");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, 20));

        panel_buscar.setBackground(new java.awt.Color(255, 204, 204));

        lbl_imgBuscar.setBackground(new java.awt.Color(51, 0, 102));
        lbl_imgBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_imgBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_imgBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscar21x22.png"))); // NOI18N
        lbl_imgBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_imgBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_imgBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_imgBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_buscarLayout = new javax.swing.GroupLayout(panel_buscar);
        panel_buscar.setLayout(panel_buscarLayout);
        panel_buscarLayout.setHorizontalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscarLayout.createSequentialGroup()
                .addComponent(lbl_imgBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_buscarLayout.setVerticalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_buscarLayout.createSequentialGroup()
                .addComponent(lbl_imgBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panel_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 50, 30));

        btnModificar.setBackground(new java.awt.Color(204, 204, 204));
        btnModificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, 30));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nuevo Telefono");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Nuevo correo");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 130, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Nuevo Nombre");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, -1));
        jPanel7.add(newTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 130, -1));
        jPanel7.add(newNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, -1));
        jPanel7.add(newCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 170, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 540, 70));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ej. Usuario");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, 20));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ej. example@gmail.com");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, 20));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ej. 0123456789");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Todo.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(600, 400));
        jLabel2.setMinimumSize(new java.awt.Dimension(600, 400));
        jLabel2.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscarFocusGained
        //TEXFIELD a dar clic y escribir
    }//GEN-LAST:event_txt_buscarFocusGained

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void txt_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyTyped
        //textfield de BUSCAR al dar tipiar una tecla(ENTER)
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER) {
            panel_buscar.setBackground(new Color(204, 255, 204));
        }
    }//GEN-LAST:event_txt_buscarKeyTyped

    private void lbl_imgBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_imgBuscarMouseClicked
        //LABEL BUSCAR dar acciones al dar clic
        String texto;
        texto = txt_buscar.getText();
        String[] buscado = buscar(texto);

        if (texto.equals(buscado[1])) {
            lblNombre.setText(buscado[1]);
            lblCorreo.setText(buscado[2]);
            lblTelefono.setText(buscado[3]);
            txt_buscar.setText("");

        } else {
//            music.musicaError();
            ae = new AlertaError("No exite ese Contacto", "Verifique que este bien escrito");
            ae.setVisible(true);
            lblNombre.setText("................................");
            lblCorreo.setText("................................");
            lblTelefono.setText("....................");
        }
    }//GEN-LAST:event_lbl_imgBuscarMouseClicked

    private void lbl_imgBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_imgBuscarMouseEntered
        panel_buscar.setBackground(new Color(204, 204, 204));
        //LABEL BUSCCAR cambiar de color al panel al entar el puntero
    }//GEN-LAST:event_lbl_imgBuscarMouseEntered

    private void lbl_imgBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_imgBuscarMouseExited
        panel_buscar.setBackground(new Color(255, 204, 204));
        //LABEL BUSCAR poner el color original al panel asl salir p
    }//GEN-LAST:event_lbl_imgBuscarMouseExited

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //BOTON MODIFICAR se modificara el contacto que se busque
        //
        String texto;
        int posicion = 0;
        texto = lblNombre.getText();
        String[] buscado = buscar(texto);                                       // aqui se llama el metodo buscar contacto
        if (texto.equals("................................")) {
//            music.musicaError();
            ae = new AlertaError("El campo se encuentra vacio", "Ingrese el contacto que desea modificar");
        } else {
            for (int i = 0; i < buscado.length; i++) {
                System.out.println(buscado[i]);
            }
            contactos = grupoContactos.getContactos();
            for (int i = 0; i < contactos.length; i++) {
                System.out.println(contactos[i]);
            }
            int nGrupo = Integer.valueOf(buscado[0]);
            System.out.println(nGrupo);

            String nombre = newNombre.getText();
            String correo = newCorreo.getText();
            String telefono = newTelefono.getText();

            boolean ValeNombre = valido.validarNombre(nombre);
            boolean ValeCorreo = valido.validarCorreo(correo);
            boolean ValeTelefono = valido.validarTelefono(telefono);

            if (nombre.equals("")) {
//                music.musicaError();
                ae = new AlertaError("El campo del Nombre esta vacio", "");
                ae.setVisible(true);
            } else if (telefono.equals("")) {
//                music.musicaError();
                ae = new AlertaError("El campo del Telefono esta vacio", "");
                ae.setVisible(true);
            } else if (ValeNombre == false) {
//                music.musicaError();
                ae = new AlertaError("El nombre ingresado no es valido", "El nombre comienza con Mayuscula");
                ae.setVisible(true);
            } else if (ValeCorreo == false) {
//                music.musicaError();
                ae = new AlertaError("El correo ingresado no es valido", "El correo debe cumplir con la denominacion estandar de @ y .com");
                ae.setVisible(true);
            } else if (ValeTelefono == false) {
//                music.musicaError();
                ae = new AlertaError("El telefono ingresado no es valido", "El numero de telefono debe contener 10 digitos");
                ae.setVisible(true);
            } else {

                nuevoContacto = new Contacto(nGrupo, nombre, correo, telefono,nUsuario);
                System.out.println(nuevoContacto.toString());
                int i = 0;
                for (i = 0; i < contactos.length; i++) {
                    if (texto.equals(contactos[i].getNombre())) {
                        posicion = i;
                        System.out.println(i);
                    }
                }

                // EXISTE un error al dar clic en el boton modificar si no se busca un contacto antes
                boolean nomRepetido = grupoContactos.repetido(nuevoContacto, nombre);
                if (nomRepetido == false) {
                    grupoContactos.editarContacto(posicion, nuevoContacto);
                    System.out.println(grupoContactos.toString());
                    ab = new AlertaBien("El contacto fue exitosamente modificado", "");
                    ab.setVisible(true);
                    newNombre.setText("");
                    newCorreo.setText("");
                    newTelefono.setText("");
                    this.dispose(); 
                }else{
//                    music.musicaError();
                    ae = new AlertaError("El contacto ya existe", "> "+nombre +" ya esta en lista de contactos");
                    ae.setVisible(true);
                }
                
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarContacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lbl_imgBuscar;
    private javax.swing.JTextField newCorreo;
    private javax.swing.JTextField newNombre;
    private javax.swing.JTextField newTelefono;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
