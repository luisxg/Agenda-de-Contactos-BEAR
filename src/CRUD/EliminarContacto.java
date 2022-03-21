package CRUD;

import JFrame.AlertaBien;
import JFrame.AlertaError;
import Metodos.Contactos.Contacto;
import Metodos.Contactos.GrupoContactos;
import Metodos.Sonidos;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author luisg
 */
public class EliminarContacto extends javax.swing.JFrame implements Serializable{

    GrupoContactos contactos;
    Contacto[] cont;
    AlertaError ae;
    Sonidos music = new Sonidos();
    int nUsuario = 0;
    public EliminarContacto() {
    }

    public EliminarContacto(GrupoContactos contactos, int nUsuario) {
        initComponents();
        iniciar();
        this.contactos = contactos;
        this.setTitle("Eliminar Contacto");
        setIconImage(new ImageIcon(getClass().getResource("/Images/Logo_Oso124x128.png")).getImage());
    }

    public void iniciar() {
        setLocationRelativeTo(null);
        music = new Sonidos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panel_buscar = new javax.swing.JPanel();
        lbl_imgBuscar = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ELIMINA TU CONTACTO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, -1));

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_imgBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(panel_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 50, 30));

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
        jPanel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 230, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ej. Usuario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar por el nombre: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 150, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

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
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, -1));

        lblTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefono.setText("..........................");
        jPanel4.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 150, 20));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("................................");
        jPanel4.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 540, 60));

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Todo.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(600, 400));
        jLabel2.setMinimumSize(new java.awt.Dimension(600, 400));
        jLabel2.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_imgBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_imgBuscarMouseClicked
        //LABEL BUSCAR dar acciones al dar clic
        String texto;
        texto = txt_buscar.getText();

        String[] buscado = new String[3];
        buscado = contactos.buscarContacto(texto);

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
        //LABEL BUSCCAR cambiar de color al panel al entar el puntero
        panel_buscar.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_lbl_imgBuscarMouseEntered

    private void lbl_imgBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_imgBuscarMouseExited
        //LABEL BUSCAR poner el color original al panel asl salir p
        panel_buscar.setBackground(new Color(255, 204, 204));
    }//GEN-LAST:event_lbl_imgBuscarMouseExited

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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //BOTON ELIMINR elimina un contacto del array
        String nombre = lblNombre.getText();

        if (nombre.equals("................................")) {
            music.musicaError();
            ae = new AlertaError("El campo se encuentra vacio", "");
            ae.setVisible(true);
        } else {
            int posicion = 0;
            cont = contactos.getContactos();
            for (int i = 0; i < cont.length; i++) {
                if (nombre.equals(cont[i].getNombre())) {
                    posicion = i;
                }
            }
            contactos.eliminarContacto(posicion);
            AlertaBien alert = new AlertaBien("El usuario ha sido eliminado", "");
            alert.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarContacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lbl_imgBuscar;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
