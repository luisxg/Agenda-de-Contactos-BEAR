package JFrame;

import CRUD.AgregarContacto;
import CRUD.BuscarContacto;
import CRUD.EliminarContacto;
import CRUD.ModificarContacto;
import Metodos.Contactos.Contacto;
import Metodos.Contactos.GrupoContactos;
import Metodos.GrupoUsuarios;
import Metodos.Sonidos;
import Metodos.Usuario;
import java.awt.Color;
import java.awt.Event;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Agenda extends javax.swing.JFrame {

    GrupoContactos contactos = new GrupoContactos();
    Contacto[] cont;
    DefaultTableModel modeloTabla;
    AlertaError alertError;
    AlertaBien alertBien;
    Sonidos music = new Sonidos();

    public Agenda() {
        initComponents();
        iniciar();
        modeloTabla = new DefaultTableModel();
        panel_Fondo.setVisible(false);
    }

    public void iniciar() {

        setLocationRelativeTo(null);
        tableContactos.getTableHeader().setForeground(new Color(153, 51, 44));
        setIconImage(new ImageIcon(getClass().getResource("/Images/Logo_Oso124x128.png")).getImage());
        this.setTitle("Agenda de contactos");
        cierreVentana();
        music = new Sonidos();
//        lblBienvenido.setVisible(false);
//        tableContactos.setVisible(false);
    }

    public void recogerDatos(String nom, String corr) {
        lblCorreo.setText(corr);
        lblBienvenido.setText("Bienvenido " + nom + " a tu Agenda Bear");
    }

    private int obtenernUsuario(String correo) {
        int nUsuario = 0;
        Usuario[] usuariosAux;
        GrupoUsuarios gUsers = new GrupoUsuarios();
        usuariosAux = gUsers.getUsuarios();
        for (int i = 0; i < usuariosAux.length; i++) {
            if (usuariosAux[i].getCorreo().equals(correo)) {
                nUsuario = usuariosAux[i].getId();
            }
        }
        return nUsuario;
    }

    //
    public void llenarTabla(Contacto[] contactos) {
//        cont = contactos.getContactos();
        if (cont == null) {
            System.out.println("Los contactos estan vacios");
        } else {
            String matriz[][] = new String[(cont.length)][3];

            for (int i = 0; i < cont.length; i++) {
                matriz[i][0] = cont[i].getNombre();
                matriz[i][1] = cont[i].getCorreo();
                matriz[i][2] = cont[i].getTelefono();
            }

            tableContactos.setModel(new javax.swing.table.DefaultTableModel(
                    matriz,
                    new String[]{
                        "Nombre", "Correo", "Telefono"
                    }
            ));
        }

    }

    public void cierreVentana() {
        try {
            this.setDefaultCloseOperation(JFrame.Agenda.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    try {
                        confirmarSalida();
                    } catch (IOException ex) {
                        Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        } catch (Exception e) {
        }
    }

    public void confirmarSalida() throws IOException {
        int valor = JOptionPane.showConfirmDialog(this, "Seguro que quiere salir de su agenda personal?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ocultar = new javax.swing.JLabel();
        panel_Fondo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableContactos = new javax.swing.JTable();
        jComboBox_Grupos = new javax.swing.JComboBox<>();
        lblBienvenido = new javax.swing.JLabel();
        lblBienvenido2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bxCrud = new javax.swing.JComboBox<>();
        lblCorreo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        agenda = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menuBuscar = new javax.swing.JMenuItem();
        menuAgregar = new javax.swing.JMenuItem();
        menuModificar = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        menu_Mensajeria = new javax.swing.JMenu();
        jMenuItem_enviar = new javax.swing.JMenuItem();
        menuItem_enviados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ocultar.setBackground(new java.awt.Color(112, 33, 28));
        ocultar.setOpaque(true);
        getContentPane().add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 470));

        panel_Fondo.setBackground(new java.awt.Color(112, 33, 28));
        panel_Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableContactos.setBackground(new java.awt.Color(51, 51, 51));
        tableContactos.setForeground(new java.awt.Color(255, 255, 255));
        tableContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Correo", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableContactos.setToolTipText("");
        tableContactos.setAlignmentX(1.0F);
        tableContactos.setGridColor(new java.awt.Color(102, 102, 102));
        tableContactos.setOpaque(false);
        jScrollPane2.setViewportView(tableContactos);

        panel_Fondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 780, 330));

        jComboBox_Grupos.setBackground(new java.awt.Color(102, 0, 0));
        jComboBox_Grupos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox_Grupos.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox_Grupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos los contactos", "Trabajo", "Amigos", "Familia" }));
        jComboBox_Grupos.setOpaque(false);
        jComboBox_Grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_GruposActionPerformed(evt);
            }
        });
        panel_Fondo.add(jComboBox_Grupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 30));

        lblBienvenido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(204, 204, 204));
        lblBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel_Fondo.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 780, 50));

        lblBienvenido2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBienvenido2.setForeground(new java.awt.Color(204, 204, 204));
        lblBienvenido2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenido2.setText("Seleccione que grupo desea mostrar");
        panel_Fondo.add(lblBienvenido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 30));

        jLabel7.setBackground(new java.awt.Color(153, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Todo.png"))); // NOI18N
        jLabel7.setText("Ej. Usuario");
        panel_Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 470));

        bxCrud.setBackground(new java.awt.Color(102, 0, 0));
        bxCrud.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bxCrud.setForeground(new java.awt.Color(255, 255, 255));
        bxCrud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Agregar Contacto", "Modificar Contacto", "Eliminar Contacto", "Enviar correo" }));
        bxCrud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxCrudActionPerformed(evt);
            }
        });
        panel_Fondo.add(bxCrud, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 140, 30));

        lblCorreo.setText("jLabel1");
        panel_Fondo.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 120, -1));

        getContentPane().add(panel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 780, 470));

        agenda.setText("Ver Agenda");
        agenda.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                agendaMenuSelected(evt);
            }
        });
        agenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agendaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agendaMousePressed(evt);
            }
        });
        agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaActionPerformed(evt);
            }
        });
        jMenuBar1.add(agenda);

        jMenu1.setText("Contactos");

        menuBuscar.setText("Buscar");
        menuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarActionPerformed(evt);
            }
        });
        jMenu1.add(menuBuscar);

        menuAgregar.setText("Agregar");
        menuAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarActionPerformed(evt);
            }
        });
        jMenu1.add(menuAgregar);

        menuModificar.setText("Modificar");
        menuModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModificarActionPerformed(evt);
            }
        });
        jMenu1.add(menuModificar);

        menuEliminar.setText("Eliminar");
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(menuEliminar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Grupos");

        jMenuItem5.setText("Agregar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        menu_Mensajeria.setText("Mensajeria");

        jMenuItem_enviar.setText("Enviar mensaje");
        jMenuItem_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_enviarActionPerformed(evt);
            }
        });
        menu_Mensajeria.add(jMenuItem_enviar);

        menuItem_enviados.setText("Enviados");
        menuItem_enviados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem_enviadosMouseClicked(evt);
            }
        });
        menuItem_enviados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_enviadosActionPerformed(evt);
            }
        });
        menu_Mensajeria.add(menuItem_enviados);

        jMenuBar1.add(menu_Mensajeria);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bxCrudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxCrudActionPerformed
        // TODO add your handling code here:
        int opc = bxCrud.getSelectedIndex();
        String correo = lblCorreo.getText();
        int nUsuario = obtenernUsuario(correo);
        switch (opc) {
            case 1:
                AgregarContacto agregar = new AgregarContacto(contactos, jComboBox_Grupos, nUsuario);
                agregar.setVisible(true);
                break;
            case 2:
                ModificarContacto modificar = new ModificarContacto(contactos, nUsuario);
                modificar.setVisible(true);
                break;
            case 3:
                EliminarContacto eliminar = new EliminarContacto(contactos, nUsuario);
                eliminar.setVisible(true);
                break;
            case 4:
                EnviarCorreo enviarCorreo = new EnviarCorreo(contactos, correo);
                enviarCorreo.setVisible(true);
                break;
        }
    }//GEN-LAST:event_bxCrudActionPerformed

    private void jComboBox_GruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_GruposActionPerformed
        // TODO add your handling code here:
        String palabra;
        palabra = jComboBox_Grupos.getSelectedItem().toString();

        cont = contactos.getContactosVerificar(palabra, jComboBox_Grupos, lblCorreo.getText());

        llenarTabla(cont);
    }//GEN-LAST:event_jComboBox_GruposActionPerformed

    private void menuModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModificarActionPerformed
        bxCrud.setSelectedIndex(2);
    }//GEN-LAST:event_menuModificarActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed
        // TODO add your handling code here:
        bxCrud.setSelectedIndex(3);
    }//GEN-LAST:event_menuEliminarActionPerformed

    private void menuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarActionPerformed
        BuscarContacto bc = new BuscarContacto(contactos);
        bc.setVisible(true);

        // TODO add your handling code here:

    }//GEN-LAST:event_menuBuscarActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        String nuevoGrupo = "";
        int dimensionCombo = jComboBox_Grupos.getItemCount();
        nuevoGrupo = JOptionPane.showInputDialog(nuevoGrupo);
        String grupo;
        boolean confirma = false;
        if (nuevoGrupo.equals("")) {
            music.musicaError();
            alertError = new AlertaError("Verifique que el compo no este vacio", "");
            alertError.setVisible(true);
        } else {
            for (int i = 0; i < dimensionCombo; i++) {
                grupo = jComboBox_Grupos.getItemAt(i);
                if (nuevoGrupo.equals(grupo) || nuevoGrupo.equals("")) {
                    confirma = true;
                }
            }
            if (confirma == false) {
                jComboBox_Grupos.addItem(nuevoGrupo);
                alertBien = new AlertaBien("El grupo fue ingresado", "Ingrese sus contactos si desea");
                alertBien.setVisible(true);
            } else {
                music.musicaError();
                alertError = new AlertaError("El grupo ya existe!", "");
                alertError.setVisible(true);
            }
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void menuAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarActionPerformed
        // TODO add your handling code here:
        bxCrud.setSelectedIndex(1);
    }//GEN-LAST:event_menuAgregarActionPerformed

    private void jMenuItem_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_enviarActionPerformed
        // llamar a otra ventana 
        String correo = lblCorreo.getText();
        int nUsuario = obtenernUsuario(correo);                                                                        //VENTANA ENVIAR CORREO
        EnviarCorreo enviarCorreo = new EnviarCorreo(contactos, correo);

        enviarCorreo.llenarCombo(nUsuario);
        enviarCorreo.recogerDatos(correo);
        enviarCorreo.setVisible(true);

    }//GEN-LAST:event_jMenuItem_enviarActionPerformed

    private void menuItem_enviadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem_enviadosMouseClicked

    }//GEN-LAST:event_menuItem_enviadosMouseClicked

    private void menuItem_enviadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_enviadosActionPerformed

        //abrir la ventana
        Enviados envia = new Enviados();
        envia.setVisible(true);
    }//GEN-LAST:event_menuItem_enviadosActionPerformed

    private void agendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_agendaActionPerformed
    private void agendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendaMouseClicked
        // TODO add your handling code here:
        ocultar.setVisible(false);
        panel_Fondo.setVisible(true);

    }//GEN-LAST:event_agendaMouseClicked

    private void agendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendaMousePressed
        // TODO add your handling code here:


    }//GEN-LAST:event_agendaMousePressed

    private void agendaMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_agendaMenuSelected
        // TODO add your handling code here:

    }//GEN-LAST:event_agendaMenuSelected

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu agenda;
    private javax.swing.JComboBox<String> bxCrud;
    private javax.swing.JComboBox<String> jComboBox_Grupos;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem_enviar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblBienvenido2;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JMenuItem menuAgregar;
    private javax.swing.JMenuItem menuBuscar;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuItem_enviados;
    private javax.swing.JMenuItem menuModificar;
    private javax.swing.JMenu menu_Mensajeria;
    private javax.swing.JLabel ocultar;
    private javax.swing.JPanel panel_Fondo;
    private javax.swing.JTable tableContactos;
    // End of variables declaration//GEN-END:variables
}
