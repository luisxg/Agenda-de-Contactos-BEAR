
package JFrame;

import Correos.Correo;
import Correos.GrupoCorreos;
import Metodos.Contactos.Contacto;
import Metodos.Contactos.GrupoContactos;
import java.io.Serializable;
import javax.swing.ImageIcon;


/**
 *
 * @author luisg
 */
public class EnviarCorreo extends javax.swing.JFrame implements Serializable{
    GrupoCorreos grupCorreo = new GrupoCorreos();
    GrupoContactos contactos;
    Contacto[] contactosUsuario;
    Correo nuevoCorreo;
    String correo;

    public EnviarCorreo() {
        initComponents();
        setLocationRelativeTo(this);
    }

    public EnviarCorreo(GrupoContactos contactos, String correo) {
        initComponents();
        setLocationRelativeTo(this);
        this.correo = correo;
        this.contactos = contactos;
        mostrarCorreo();
         setIconImage(new ImageIcon(getClass().getResource("/Images/Logo_Oso124x128.png")).getImage());
        this.setTitle("Enviar Correo");
    }

    public void mostrarCorreo() {
        lblCorreo.setText(correo);
    }
    public void llenarCombo(int nUsuario){
        contactosUsuario =  contactos.getContactosUsuario(nUsuario);
        String correo;
        for (int i = 0; i < contactosUsuario.length; i++) {
            correo = contactosUsuario[i].getCorreo();
            bxDestinatario.addItem(correo);
        }
    }

    public void recogerDatos(String corr) {
        lblCorreo.setText(corr);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        areaMensaje = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        bxDestinatario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(112, 33, 28));

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        txtMensaje.setBackground(new java.awt.Color(51, 51, 51));
        txtMensaje.setColumns(20);
        txtMensaje.setForeground(new java.awt.Color(255, 255, 255));
        txtMensaje.setRows(5);
        areaMensaje.setViewportView(txtMensaje);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo:");

        txtAsunto.setBackground(new java.awt.Color(51, 51, 51));
        txtAsunto.setForeground(new java.awt.Color(255, 255, 255));
        txtAsunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsuntoActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Asunto:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mensaje:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Para:");

        lblCorreo.setBackground(new java.awt.Color(51, 51, 51));
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setOpaque(true);

        bxDestinatario.setBackground(new java.awt.Color(102, 0, 0));
        bxDestinatario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bxDestinatario.setForeground(new java.awt.Color(255, 255, 255));
        bxDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxDestinatarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAsunto)
                    .addComponent(bxDestinatario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(177, 177, 177))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bxDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // enviar el mensaje
        String correoDestino = bxDestinatario.getSelectedItem().toString();
        String mensajeEnviado = txtMensaje.getText();
        String asuntos = txtAsunto.getText();
        
        nuevoCorreo = new Correo(correoDestino, mensajeEnviado,asuntos);
            
        grupCorreo.añadirMensaje(nuevoCorreo);
        System.out.println(nuevoCorreo.toString());
        
        AlertaBien alerta = new AlertaBien("Correro Enviado","");    
        alerta.setVisible(true);
        
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtAsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAsuntoActionPerformed

    
    private void bxDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxDestinatarioActionPerformed
    }//GEN-LAST:event_bxDestinatarioActionPerformed

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
            java.util.logging.Logger.getLogger(EnviarCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnviarCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnviarCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnviarCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnviarCorreo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane areaMensaje;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox<String> bxDestinatario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextArea txtMensaje;
    // End of variables declaration//GEN-END:variables

   
}
