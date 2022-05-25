/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package grafica;

import dto.Apartamento;
import dto.Estados;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;
import logica.GestorVentas;
import utilidades.GArchivos;

/**
 *
 * @author Jonas
 */
public class VentanaActualizar extends javax.swing.JDialog {

    /**
     * Creates new form VentanaActualizar
     */
    public VentanaActualizar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ponerValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cjNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cjPagado = new javax.swing.JTextField();
        cjPiso = new javax.swing.JTextField();
        cjApto = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(18, 20, 32));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 249, 233));
        jLabel7.setText("Valor pago ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 190, 100, 21);

        jLabel4.setBackground(new java.awt.Color(245, 249, 233));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 249, 233));
        jLabel4.setText("Numero de piso ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(510, 140, 140, 21);

        jLabel8.setBackground(new java.awt.Color(245, 249, 233));
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(245, 249, 233));
        jLabel8.setText("Numero de apto. ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(510, 190, 150, 21);

        cjNombre.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        cjNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjNombreActionPerformed(evt);
            }
        });
        cjNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cjNombreKeyTyped(evt);
            }
        });
        jPanel1.add(cjNombre);
        cjNombre.setBounds(230, 140, 208, 27);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 249, 233));
        jLabel5.setText("Nombre completo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 140, 150, 32);

        cjPagado.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        cjPagado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cjPagadoKeyTyped(evt);
            }
        });
        jPanel1.add(cjPagado);
        cjPagado.setBounds(230, 180, 208, 27);

        cjPiso.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        cjPiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cjPisoKeyTyped(evt);
            }
        });
        jPanel1.add(cjPiso);
        cjPiso.setBounds(670, 140, 160, 27);

        cjApto.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        cjApto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cjAptoKeyTyped(evt);
            }
        });
        jPanel1.add(cjApto);
        cjApto.setBounds(670, 190, 160, 27);

        btGuardar.setBackground(new java.awt.Color(127, 99, 110));
        btGuardar.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btGuardar.setForeground(new java.awt.Color(18, 20, 32));
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btGuardar);
        btGuardar.setBounds(330, 250, 232, 46);

        jPanel2.setBackground(new java.awt.Color(127, 99, 110));
        jPanel2.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(245, 249, 233));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 249, 233));
        jLabel2.setText("Venta de Apartamentos");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(320, 20, 280, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 900, 60);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 249, 233));
        jLabel1.setText("DATOS CLIENTE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 80, 170, 35);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 249, 233));
        jLabel3.setText("DATOS APARTAMENTO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(550, 80, 250, 27);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(912, 344));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cjNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cjNombreKeyTyped

    }//GEN-LAST:event_cjNombreKeyTyped

    private void cjPagadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cjPagadoKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_cjPagadoKeyTyped

    private void cjPisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cjPisoKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_cjPisoKeyTyped

    private void cjAptoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cjAptoKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_cjAptoKeyTyped

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        actualizarCambios();
    }//GEN-LAST:event_btGuardarActionPerformed

    private void cjNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaActualizar dialog = new VentanaActualizar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    public int posicion;
    
    public void ponerValores() {
        Apartamento n = new Apartamento();
        GestorVentas gestor = new GestorVentas();

        for(int i = 0; i < gestor.listaApartamentos.size(); i++){

            n = (Apartamento)gestor.listaApartamentos.get(i);
            if (Objects.equals(VentanaInicio.identificacion, n.cliente.obtIdentificacion())) {
                posicion = i;
                cjNombre.setText(n.cliente.obtNombre());
                cjPagado.setText(n.cliente.obtValor_pagado().toString());
                cjPiso.setText(n.num_piso.toString());
                cjApto.setText(n.num_apartamento.toString());
            }
        }
    }
        
    public void actualizarCambios() {
        GestorVentas gestor = new GestorVentas();
        Apartamento n = (Apartamento)gestor.listaApartamentos.get(posicion);
        // Apartamento n = (Apartamento)apartamentos.get(posicion);
        
        n.cliente.modiNombre(cjNombre.getText());
        n.cliente.modiValor_pagado(Integer.parseInt(cjPagado.getText()));
        n.num_piso = Integer.parseInt(cjPiso.getText());
        n.num_apartamento = Integer.parseInt(cjApto.getText());
        n.cliente.calcSaldo( Integer.parseInt(cjPagado.getText()), n.valor_apartamento);
        
        if(n.cliente.obtSaldo() == 0) {
            n.estado_compra = Estados.COMPRADO;
        }
        
        gestor.listaApartamentos.set(posicion, n);
        boolean b = GArchivos.guardar("listaApartamentos.ap", gestor.listaApartamentos);
        JOptionPane.showMessageDialog(this, "Se actualizaron los datos exitosamente!");
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.JTextField cjApto;
    private javax.swing.JTextField cjNombre;
    private javax.swing.JTextField cjPagado;
    private javax.swing.JTextField cjPiso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
