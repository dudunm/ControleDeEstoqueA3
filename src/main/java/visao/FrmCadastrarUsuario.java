package visao;

import javax.swing.JOptionPane;

public class FrmCadastrarUsuario extends javax.swing.JFrame {
            
    public FrmCadastrarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLNomeUser = new javax.swing.JLabel();
        JTFNomeUser = new javax.swing.JTextField();
        JTFEmail = new javax.swing.JTextField();
        JTFCPF = new javax.swing.JTextField();
        JLEmail = new javax.swing.JLabel();
        JLCPF = new javax.swing.JLabel();
        JLExCPF = new javax.swing.JLabel();
        JLExEmail = new javax.swing.JLabel();
        JLExNome = new javax.swing.JLabel();
        JBCadastrar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        JLCadastroUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Usuário");

        JLNomeUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLNomeUser.setText("Nome:");

        JTFNomeUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        JTFEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        JTFCPF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        JLEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLEmail.setText("Email:");

        JLCPF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLCPF.setText("CPF:");

        JLExCPF.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        JLExCPF.setText("Exemplo: 123.456.789-01");

        JLExEmail.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        JLExEmail.setText("Exemplo: mainjaxafundado@outlook.com");

        JLExNome.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        JLExNome.setText("Exemplo: Pedro Mascarenhas");

        JBCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JBCadastrar.setText("Cadastrar");

        JBCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JLCadastroUser.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        JLCadastroUser.setText("Cadastro de Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JLCadastroUser, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                        .addComponent(JTFNomeUser)
                        .addComponent(JTFEmail)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JBCadastrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(JLExNome)
                        .addComponent(JLExEmail)
                        .addComponent(JLNomeUser)
                        .addComponent(JLEmail)
                        .addComponent(JLCPF)
                        .addComponent(JLExCPF)))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(JLCadastroUser)
                .addGap(18, 18, 18)
                .addComponent(JLNomeUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLExNome)
                .addGap(20, 20, 20)
                .addComponent(JLEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLExEmail)
                .addGap(20, 20, 20)
                .addComponent(JLCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLExCPF)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBCadastrar))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JLabel JLCPF;
    private javax.swing.JLabel JLCadastroUser;
    private javax.swing.JLabel JLEmail;
    private javax.swing.JLabel JLExCPF;
    private javax.swing.JLabel JLExEmail;
    private javax.swing.JLabel JLExNome;
    private javax.swing.JLabel JLNomeUser;
    private javax.swing.JTextField JTFCPF;
    private javax.swing.JTextField JTFEmail;
    private javax.swing.JTextField JTFNomeUser;
    // End of variables declaration//GEN-END:variables
}
