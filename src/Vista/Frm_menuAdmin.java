/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Nibbinthoroniel
 */
public class Frm_menuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Frm_menu
     */
    public Frm_menuAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jm_opciones = new javax.swing.JMenu();
        jm_productos = new javax.swing.JMenu();
        jmi_agregarProd = new javax.swing.JMenuItem();
        jmi_editarProd = new javax.swing.JMenuItem();
        jmi_listarProd = new javax.swing.JMenuItem();
        jmi_eliminarProd = new javax.swing.JMenuItem();
        jm_garzones = new javax.swing.JMenu();
        jmi_agregarGar = new javax.swing.JMenuItem();
        jmi_editarGar = new javax.swing.JMenuItem();
        jmi_listarGar = new javax.swing.JMenuItem();
        jmi_eliminarGar = new javax.swing.JMenuItem();
        jm_mesas = new javax.swing.JMenu();
        jmi_agregarMesa = new javax.swing.JMenuItem();
        jmi_listarMesa = new javax.swing.JMenuItem();
        jmi_eliminarMesa = new javax.swing.JMenuItem();
        jm_cerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jm_opciones.setText("Opciones");

        jm_productos.setText("Productos");

        jmi_agregarProd.setText("Agregar");
        jmi_agregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarProdActionPerformed(evt);
            }
        });
        jm_productos.add(jmi_agregarProd);

        jmi_editarProd.setText("Editar");
        jm_productos.add(jmi_editarProd);

        jmi_listarProd.setText("Listar");
        jm_productos.add(jmi_listarProd);

        jmi_eliminarProd.setText("Eliminar");
        jm_productos.add(jmi_eliminarProd);

        jm_opciones.add(jm_productos);

        jm_garzones.setText("Garzones");

        jmi_agregarGar.setText("Agregar");
        jm_garzones.add(jmi_agregarGar);

        jmi_editarGar.setText("Editar");
        jm_garzones.add(jmi_editarGar);

        jmi_listarGar.setText("Listar");
        jm_garzones.add(jmi_listarGar);

        jmi_eliminarGar.setText("Eliminar");
        jmi_eliminarGar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarGarActionPerformed(evt);
            }
        });
        jm_garzones.add(jmi_eliminarGar);

        jm_opciones.add(jm_garzones);

        jm_mesas.setText("Mesas");

        jmi_agregarMesa.setText("Agregar");
        jmi_agregarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarMesaActionPerformed(evt);
            }
        });
        jm_mesas.add(jmi_agregarMesa);

        jmi_listarMesa.setText("Listar");
        jmi_listarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarMesaActionPerformed(evt);
            }
        });
        jm_mesas.add(jmi_listarMesa);

        jmi_eliminarMesa.setText("Eliminar");
        jm_mesas.add(jmi_eliminarMesa);

        jm_opciones.add(jm_mesas);

        jMenuBar2.add(jm_opciones);

        jm_cerrarSesion.setText("Cerrar sesión");
        jMenuBar2.add(jm_cerrarSesion);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_agregarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_agregarMesaActionPerformed

    private void jmi_eliminarGarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarGarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_eliminarGarActionPerformed

    private void jmi_listarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_listarMesaActionPerformed

    private void jmi_agregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_agregarProdActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_menuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jm_cerrarSesion;
    private javax.swing.JMenu jm_garzones;
    private javax.swing.JMenu jm_mesas;
    private javax.swing.JMenu jm_opciones;
    private javax.swing.JMenu jm_productos;
    private javax.swing.JMenuItem jmi_agregarGar;
    private javax.swing.JMenuItem jmi_agregarMesa;
    private javax.swing.JMenuItem jmi_agregarProd;
    private javax.swing.JMenuItem jmi_editarGar;
    private javax.swing.JMenuItem jmi_editarProd;
    private javax.swing.JMenuItem jmi_eliminarGar;
    private javax.swing.JMenuItem jmi_eliminarMesa;
    private javax.swing.JMenuItem jmi_eliminarProd;
    private javax.swing.JMenuItem jmi_listarGar;
    private javax.swing.JMenuItem jmi_listarMesa;
    private javax.swing.JMenuItem jmi_listarProd;
    // End of variables declaration//GEN-END:variables
}