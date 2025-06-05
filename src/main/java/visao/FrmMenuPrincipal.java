package visao;

public class FrmMenuPrincipal extends javax.swing.JFrame {

    public FrmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        JFBGerenciarCategoria = new javax.swing.JButton();
        JFBCadastrarProduto = new javax.swing.JButton();
        JFBGerenciarProduto = new javax.swing.JButton();
        JFBFechar = new javax.swing.JButton();
        JFBCadastrarCategoria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Controle de Estoque");

        JFBGerenciarCategoria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JFBGerenciarCategoria.setText("Gerenciar Categoria");
        JFBGerenciarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFBGerenciarCategoriaActionPerformed(evt);
            }
        });

        JFBCadastrarProduto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JFBCadastrarProduto.setText("Cadastrar Produto");
        JFBCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFBCadastrarProdutoActionPerformed(evt);
            }
        });

        JFBGerenciarProduto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JFBGerenciarProduto.setText("Gerenciar Produto");
        JFBGerenciarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFBGerenciarProdutoActionPerformed(evt);
            }
        });

        JFBFechar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JFBFechar.setText("Fechar");
        JFBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFBFecharActionPerformed(evt);
            }
        });

        JFBCadastrarCategoria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JFBCadastrarCategoria.setText("Cadastrar Categoria");
        JFBCadastrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFBCadastrarCategoriaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Gerenciamento de Estoque");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(JFBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JFBCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(69, 69, 69)
                            .addComponent(JFBGerenciarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JFBCadastrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JFBGerenciarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JFBGerenciarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFBCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JFBGerenciarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFBCadastrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JFBFechar)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JFBCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFBCadastrarProdutoActionPerformed
        FrmCadastrarProduto objeto = new FrmCadastrarProduto();
        objeto.setVisible(true);
    }//GEN-LAST:event_JFBCadastrarProdutoActionPerformed

    private void JFBGerenciarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFBGerenciarProdutoActionPerformed
        FrmGerenciarProduto objeto = new FrmGerenciarProduto();
        objeto.setVisible(true);
    }//GEN-LAST:event_JFBGerenciarProdutoActionPerformed

    private void JFBCadastrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFBCadastrarCategoriaActionPerformed
        FrmCadastrarCategoria objeto = new FrmCadastrarCategoria();
        objeto.setVisible(true);
    }//GEN-LAST:event_JFBCadastrarCategoriaActionPerformed

    private void JFBGerenciarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFBGerenciarCategoriaActionPerformed
        FrmGerenciarCategoria objeto = new FrmGerenciarCategoria();
        objeto.setVisible(true);
    }//GEN-LAST:event_JFBGerenciarCategoriaActionPerformed

    private void JFBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFBFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JFBFecharActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JFBCadastrarCategoria;
    private javax.swing.JButton JFBCadastrarProduto;
    private javax.swing.JButton JFBFechar;
    private javax.swing.JButton JFBGerenciarCategoria;
    private javax.swing.JButton JFBGerenciarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
