
package interfacejava;

import javax.swing.JOptionPane;


/**
 *<b>TelaInicio</b> 
 * Essa classe foi criada para dar introdução para a aplicação usando o 
 * JFrame.
 * 2020, Daniel A. C. de Aquino
 */
public class TelaInicio extends javax.swing.JFrame {

    
    public TelaInicio() {
        initComponents();
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panInciar = new javax.swing.JPanel();
        lblIntro = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        lblDigite = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(493, 304));

        panInciar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 1, true));
        panInciar.setForeground(new java.awt.Color(102, 204, 255));
        panInciar.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        panInciar.setMinimumSize(new java.awt.Dimension(479, 95));
        panInciar.setPreferredSize(new java.awt.Dimension(479, 95));

        lblIntro.setFont(new java.awt.Font("DejaVu Serif", 3, 18)); // NOI18N
        lblIntro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIntro.setText("Sistema para Acompanhamento de Resultados");

        btnInicio.setText("Iniciar");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblDigite.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDigite.setText("Digite seu nome");

        javax.swing.GroupLayout panInciarLayout = new javax.swing.GroupLayout(panInciar);
        panInciar.setLayout(panInciarLayout);
        panInciarLayout.setHorizontalGroup(
            panInciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIntro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInciarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblDigite, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addGroup(panInciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInciarLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162))
        );
        panInciarLayout.setVerticalGroup(
            panInciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInciarLayout.createSequentialGroup()
                .addComponent(lblIntro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(panInciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDigite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNome))
                .addGap(12, 12, 12)
                .addComponent(btnInicio)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panInciar, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panInciar, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // Incremento de if para o usuario digitar seu nome.
        if (txtNome.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Por favor, digite seu nome!");
        } else {
        
        /*Exibe uma mesagem de "bem vindo" quando o usuario faz o input da
            String Nome.
        */
        String Nome = txtNome.getText();
        JOptionPane.showMessageDialog(null,"Seja bem vindo(a) " + Nome);
        
        //Feito o input da String, uma segunda tela sera exibida.
        new TelaOpcoes().setVisible(true);
        this.dispose();
        }
        
        
        
        
        
    }//GEN-LAST:event_btnInicioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel lblDigite;
    private javax.swing.JLabel lblIntro;
    private javax.swing.JPanel panInciar;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private String txtNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setExtendedState(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
