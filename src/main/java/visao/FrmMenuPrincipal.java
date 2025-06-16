package visao;

public class FrmMenuPrincipal extends javax.swing.JFrame {

    public FrmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JFBGerenciarCategoria = new javax.swing.JButton();
        JFBCadastrarProduto = new javax.swing.JButton();
        JFBGerenciarProduto = new javax.swing.JButton();
        JFBSobre = new javax.swing.JButton();
        JFBCadastrarCategoria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JFBMovimentacoes = new javax.swing.JButton();
        JFBFechar = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuPreco = new javax.swing.JMenuItem();
        jMenuBalanco = new javax.swing.JMenuItem();
        jMenuAbaixoMin = new javax.swing.JMenuItem();
        jMenuAbaixoMax = new javax.swing.JMenuItem();
        jMenuProdutosCategoria = new javax.swing.JMenuItem();

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

        JFBSobre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JFBSobre.setText("Sobre");
        JFBSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFBSobreActionPerformed(evt);
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

        JFBMovimentacoes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JFBMovimentacoes.setText("Movimentações");
        JFBMovimentacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFBMovimentacoesActionPerformed(evt);
            }
        });

        JFBFechar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JFBFechar.setText("Fechar");
        JFBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFBFecharActionPerformed(evt);
            }
        });

        jMenuRelatorios.setText("Relatórios");
        jMenuRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRelatoriosActionPerformed(evt);
            }
        });

        jMenuPreco.setText("Lista de Preços");
        jMenuPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPrecoActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuPreco);

        jMenuBalanco.setText("Balanço Físico/Financeiro");
        jMenuBalanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBalancoActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuBalanco);

        jMenuAbaixoMin.setText("Produtos abaixo da quantidade mínima");
        jMenuAbaixoMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbaixoMinActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuAbaixoMin);

        jMenuAbaixoMax.setText("Produtos abaixo da quantidade máxima");
        jMenuAbaixoMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbaixoMaxActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuAbaixoMax);

        jMenuProdutosCategoria.setText("Produtos por Categoria");
        jMenuProdutosCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProdutosCategoriaActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuProdutosCategoria);

        jMenuBar2.add(jMenuRelatorios);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JFBSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(JFBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JFBMovimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)))
                .addGap(0, 127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JFBGerenciarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFBCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JFBGerenciarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFBCadastrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(JFBMovimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JFBSobre)
                    .addComponent(JFBFechar))
                .addGap(30, 30, 30))
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

    private void JFBSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFBSobreActionPerformed
        FrmSobre objeto = new FrmSobre();
        objeto.setVisible(true);
    }//GEN-LAST:event_JFBSobreActionPerformed

    private void JFBMovimentacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFBMovimentacoesActionPerformed
        FrmMovimentacao objeto = new FrmMovimentacao();
        objeto.setVisible(true);
    }//GEN-LAST:event_JFBMovimentacoesActionPerformed

    private void jMenuRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRelatoriosActionPerformed
        //Ignora esse ActionPerformed, criei sem querer :P
    }//GEN-LAST:event_jMenuRelatoriosActionPerformed

    private void jMenuPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrecoActionPerformed
        FrmRelatorioPrecos objeto = new FrmRelatorioPrecos();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuPrecoActionPerformed

    private void jMenuBalancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBalancoActionPerformed
        FrmRelatorioBalanco objeto = new FrmRelatorioBalanco();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuBalancoActionPerformed

    private void jMenuAbaixoMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAbaixoMinActionPerformed
        FrmRelatorioAbaixoMin objeto = new FrmRelatorioAbaixoMin();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuAbaixoMinActionPerformed

    private void jMenuAbaixoMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAbaixoMaxActionPerformed
        FrmRelatorioAbaixoMax objeto = new FrmRelatorioAbaixoMax();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuAbaixoMaxActionPerformed

    private void jMenuProdutosCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProdutosCategoriaActionPerformed
        FrmRelatorioProdutosCategoria objeto = new FrmRelatorioProdutosCategoria();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuProdutosCategoriaActionPerformed

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
    private javax.swing.JButton JFBMovimentacoes;
    private javax.swing.JButton JFBSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuAbaixoMax;
    private javax.swing.JMenuItem jMenuAbaixoMin;
    private javax.swing.JMenuItem jMenuBalanco;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuPreco;
    private javax.swing.JMenuItem jMenuProdutosCategoria;
    private javax.swing.JMenu jMenuRelatorios;
    // End of variables declaration//GEN-END:variables
}
