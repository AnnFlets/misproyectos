/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Ana
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        fcrArchivo = new javax.swing.JFileChooser();
        pnFondo = new javax.swing.JPanel();
        btnCero = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnRedondeo = new javax.swing.JButton();
        btnCoseno = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnSeno = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnTangente = new javax.swing.JButton();
        btnAbsoluto = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        lblTituloFecha = new javax.swing.JLabel();
        btnSiete = new javax.swing.JButton();
        btnModulo = new javax.swing.JButton();
        txtOperacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora shida :v");
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnFondo.setBackground(new java.awt.Color(49, 49, 49));
        pnFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCero.setBackground(new java.awt.Color(72, 72, 72));
        btnCero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCero.setForeground(new java.awt.Color(255, 255, 255));
        btnCero.setText("0");
        btnCero.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 200, 50));

        btnCuatro.setBackground(new java.awt.Color(72, 72, 72));
        btnCuatro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCuatro.setForeground(new java.awt.Color(255, 255, 255));
        btnCuatro.setText("4");
        btnCuatro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 60, 50));

        btnUno.setBackground(new java.awt.Color(72, 72, 72));
        btnUno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUno.setForeground(new java.awt.Color(255, 255, 255));
        btnUno.setText("1");
        btnUno.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 60, 50));

        btnDos.setBackground(new java.awt.Color(72, 72, 72));
        btnDos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDos.setForeground(new java.awt.Color(255, 255, 255));
        btnDos.setText("2");
        btnDos.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        pnFondo.add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 60, 50));

        btnCinco.setBackground(new java.awt.Color(72, 72, 72));
        btnCinco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(255, 255, 255));
        btnCinco.setText("5");
        btnCinco.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 60, 50));

        btnIgual.setBackground(new java.awt.Color(72, 72, 72));
        btnIgual.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 60, 110));

        btnRedondeo.setBackground(new java.awt.Color(72, 72, 72));
        btnRedondeo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRedondeo.setForeground(new java.awt.Color(255, 255, 255));
        btnRedondeo.setText("Redondeo");
        btnRedondeo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnRedondeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 130, 50));

        btnCoseno.setBackground(new java.awt.Color(72, 72, 72));
        btnCoseno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCoseno.setForeground(new java.awt.Color(255, 255, 255));
        btnCoseno.setText("cos");
        btnCoseno.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnCoseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 60, 50));

        btnPunto.setBackground(new java.awt.Color(72, 72, 72));
        btnPunto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(255, 255, 255));
        btnPunto.setText(".");
        btnPunto.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        pnFondo.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 60, 50));

        btnTres.setBackground(new java.awt.Color(72, 72, 72));
        btnTres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTres.setForeground(new java.awt.Color(255, 255, 255));
        btnTres.setText("3");
        btnTres.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 60, 50));

        btnPotencia.setBackground(new java.awt.Color(72, 72, 72));
        btnPotencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPotencia.setForeground(new java.awt.Color(255, 255, 255));
        btnPotencia.setText("^");
        btnPotencia.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 60, 50));

        btnSeis.setBackground(new java.awt.Color(72, 72, 72));
        btnSeis.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(255, 255, 255));
        btnSeis.setText("6");
        btnSeis.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 60, 50));

        btnAC.setBackground(new java.awt.Color(72, 72, 72));
        btnAC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAC.setForeground(new java.awt.Color(255, 255, 255));
        btnAC.setText("AC");
        btnAC.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 60, 50));

        btnSeno.setBackground(new java.awt.Color(72, 72, 72));
        btnSeno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSeno.setForeground(new java.awt.Color(255, 255, 255));
        btnSeno.setText("sin");
        btnSeno.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnSeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 60, 50));

        btnDivision.setBackground(new java.awt.Color(72, 72, 72));
        btnDivision.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(255, 255, 255));
        btnDivision.setText("/");
        btnDivision.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 60, 50));

        btnMultiplicacion.setBackground(new java.awt.Color(72, 72, 72));
        btnMultiplicacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicacion.setText("x");
        btnMultiplicacion.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        pnFondo.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 60, 50));

        btnTangente.setBackground(new java.awt.Color(72, 72, 72));
        btnTangente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTangente.setForeground(new java.awt.Color(255, 255, 255));
        btnTangente.setText("tan");
        btnTangente.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnTangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 60, 50));

        btnAbsoluto.setBackground(new java.awt.Color(72, 72, 72));
        btnAbsoluto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAbsoluto.setForeground(new java.awt.Color(255, 255, 255));
        btnAbsoluto.setText("|x|");
        btnAbsoluto.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnAbsoluto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 60, 50));

        btnResta.setBackground(new java.awt.Color(72, 72, 72));
        btnResta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnResta.setForeground(new java.awt.Color(255, 255, 255));
        btnResta.setText("-");
        btnResta.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 60, 50));

        btnSuma.setBackground(new java.awt.Color(72, 72, 72));
        btnSuma.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(255, 255, 255));
        btnSuma.setText("+");
        btnSuma.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 60, 50));

        btnNueve.setBackground(new java.awt.Color(72, 72, 72));
        btnNueve.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNueve.setForeground(new java.awt.Color(255, 255, 255));
        btnNueve.setText("9");
        btnNueve.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 60, 50));

        btnOcho.setBackground(new java.awt.Color(72, 72, 72));
        btnOcho.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnOcho.setForeground(new java.awt.Color(255, 255, 255));
        btnOcho.setText("8");
        btnOcho.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 60, 50));

        btnGuardar.setBackground(new java.awt.Color(60, 60, 60));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar Resultado");
        btnGuardar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 190, 30));

        lblFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(204, 204, 204));
        pnFondo.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 110, 20));

        lblTituloFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTituloFecha.setForeground(new java.awt.Color(204, 204, 204));
        lblTituloFecha.setText("Fecha:");
        pnFondo.add(lblTituloFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, 20));

        btnSiete.setBackground(new java.awt.Color(72, 72, 72));
        btnSiete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSiete.setForeground(new java.awt.Color(255, 255, 255));
        btnSiete.setText("7");
        btnSiete.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, 50));

        btnModulo.setBackground(new java.awt.Color(72, 72, 72));
        btnModulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnModulo.setForeground(new java.awt.Color(255, 255, 255));
        btnModulo.setText("%");
        btnModulo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnFondo.add(btnModulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 60, 50));

        txtOperacion.setEditable(false);
        txtOperacion.setBackground(new java.awt.Color(204, 204, 204));
        txtOperacion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        pnFondo.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 480, 50));

        getContentPane().add(pnFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAC;
    public javax.swing.JButton btnAbsoluto;
    public javax.swing.JButton btnCero;
    public javax.swing.JButton btnCinco;
    public javax.swing.JButton btnCoseno;
    public javax.swing.JButton btnCuatro;
    public javax.swing.JButton btnDivision;
    public javax.swing.JButton btnDos;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnIgual;
    public javax.swing.JButton btnModulo;
    public javax.swing.JButton btnMultiplicacion;
    public javax.swing.JButton btnNueve;
    public javax.swing.JButton btnOcho;
    public javax.swing.JButton btnPotencia;
    public javax.swing.JButton btnPunto;
    public javax.swing.JButton btnRedondeo;
    public javax.swing.JButton btnResta;
    public javax.swing.JButton btnSeis;
    public javax.swing.JButton btnSeno;
    public javax.swing.JButton btnSiete;
    public javax.swing.JButton btnSuma;
    public javax.swing.JButton btnTangente;
    public javax.swing.JButton btnTres;
    public javax.swing.JButton btnUno;
    public javax.swing.JFileChooser fcrArchivo;
    public javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblTituloFecha;
    private javax.swing.JPanel pnFondo;
    public javax.swing.JTextField txtOperacion;
    // End of variables declaration//GEN-END:variables
}