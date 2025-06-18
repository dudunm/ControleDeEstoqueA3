package visao;

public class FrmMenuPrincipal extends javax.swing.JFrame {

    public FrmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuPreco = new javax.swing.JMenuItem();
        jMenuBalanco = new javax.swing.JMenuItem();
        jMenuAbaixoMin = new javax.swing.JMenuItem();
        jMenuAbaixoMax = new javax.swing.JMenuItem();
        jMenuProdutosCategoria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemCadastrarProduto = new javax.swing.JMenuItem();
        jMenuItemCadastrarCategoria = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemGerenciarProduto = new javax.swing.JMenuItem();
        jMenuItemGerenciarCategoria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemMovimentação = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Controle de Estoque");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("de Estoque");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setText("Gerenciamento");

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

        jMenuAbaixoMax.setText("Produtos acima da quantidade máxima");
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

        jMenu3.setText("Cadastrar");

        jMenuItemCadastrarProduto.setText("Cadastrar Produto");
        jMenuItemCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemCadastrarProduto);

        jMenuItemCadastrarCategoria.setText("Cadastrar Categoria");
        jMenuItemCadastrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarCategoriaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemCadastrarCategoria);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Gerenciar");

        jMenuItemGerenciarProduto.setText("Gerenciar Produto");
        jMenuItemGerenciarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerenciarProdutoActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemGerenciarProduto);

        jMenuItemGerenciarCategoria.setText("Gerenciar Categoria");
        jMenuItemGerenciarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerenciarCategoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemGerenciarCategoria);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Movimentação");

        jMenuItemMovimentação.setText("Ver movimentações");
        jMenuItemMovimentação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMovimentaçãoActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemMovimentação);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Sobre");

        jMenuItemSobre.setText("Sobre o projeto");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemSobre);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        FrmRelatorioAcimaMax objeto = new FrmRelatorioAcimaMax();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuAbaixoMaxActionPerformed

    private void jMenuProdutosCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProdutosCategoriaActionPerformed
        FrmRelatorioProdutosCategoria objeto = new FrmRelatorioProdutosCategoria();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuProdutosCategoriaActionPerformed

    private void jMenuItemCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarProdutoActionPerformed
        FrmCadastrarProduto objeto = new FrmCadastrarProduto();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarProdutoActionPerformed

    private void jMenuItemCadastrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarCategoriaActionPerformed
        FrmCadastrarCategoria objeto = new FrmCadastrarCategoria();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarCategoriaActionPerformed

    private void jMenuItemGerenciarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerenciarProdutoActionPerformed
        FrmGerenciarProduto objeto = new FrmGerenciarProduto();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuItemGerenciarProdutoActionPerformed

    private void jMenuItemGerenciarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerenciarCategoriaActionPerformed
        FrmGerenciarCategoria objeto = new FrmGerenciarCategoria();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuItemGerenciarCategoriaActionPerformed

    private void jMenuItemMovimentaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMovimentaçãoActionPerformed
        FrmMovimentacao objeto = new FrmMovimentacao();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuItemMovimentaçãoActionPerformed

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        FrmSobre objeto = new FrmSobre();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuAbaixoMax;
    private javax.swing.JMenuItem jMenuAbaixoMin;
    private javax.swing.JMenuItem jMenuBalanco;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemCadastrarCategoria;
    private javax.swing.JMenuItem jMenuItemCadastrarProduto;
    private javax.swing.JMenuItem jMenuItemGerenciarCategoria;
    private javax.swing.JMenuItem jMenuItemGerenciarProduto;
    private javax.swing.JMenuItem jMenuItemMovimentação;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenuItem jMenuPreco;
    private javax.swing.JMenuItem jMenuProdutosCategoria;
    private javax.swing.JMenu jMenuRelatorios;
    // End of variables declaration//GEN-END:variables
}
