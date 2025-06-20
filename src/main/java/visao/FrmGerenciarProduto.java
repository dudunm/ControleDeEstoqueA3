
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;
import dao.MovimentacaoDAO;


public class FrmGerenciarProduto extends javax.swing.JFrame {

    private Produto objetoproduto;
    public FrmGerenciarProduto() {
        initComponents();
        this.objetoproduto = new Produto(); // carrega objetoaluno de aluno
        this.carregaTabela();

    }
    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTProduto.getModel();
        modelo.setNumRows(0); //Posiciona na primeira linha da tabela
//Carrega a lista de objetos aluno
        ArrayList<Produto> minhaLista = objetoproduto.getMinhaLista();
        for (Produto p : minhaLista) {
            modelo.addRow(new Object[]{
                p.getIdProduto(),
                p.getNome(),
                p.getQuantidadeEstoque(),
                p.getPrecoUnitario(),
                p.getUnidade(),
                p.getQuantidadeMinima(),
                p.getQuantidadeMaxima(),
                p.getCategoria()
            });
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTProduto = new javax.swing.JTable();
        JTFQuantidade = new javax.swing.JTextField();
        JTFPreco = new javax.swing.JTextField();
        JLQuantidade = new javax.swing.JLabel();
        JLPreco = new javax.swing.JLabel();
        JLNomeProd = new javax.swing.JLabel();
        JBAlterar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        JTFNome = new javax.swing.JTextField();
        JLNomeProd1 = new javax.swing.JLabel();
        JLNomeProd2 = new javax.swing.JLabel();
        JLNomeProd3 = new javax.swing.JLabel();
        JLNomeProd4 = new javax.swing.JLabel();
        JTFUnidade = new javax.swing.JTextField();
        JTFCategoria = new javax.swing.JTextField();
        JTFQuantidadeMaxima = new javax.swing.JTextField();
        JTFQuantidadeMinima = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Produto");

        JTProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "QUANTIDADE", "PREÇO", "QUANTIDADE MINIMA", "QUANTIDADE MAXIMA", "UNIDADE", "CATEGORIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTProduto);

        JTFQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        JTFPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        JLQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLQuantidade.setText("Quantidade:");

        JLPreco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLPreco.setText("Preço:");

        JLNomeProd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLNomeProd.setText("Nome:");

        JBAlterar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JBAlterar.setText("Alterar");
        JBAlterar.setPreferredSize(new java.awt.Dimension(92, 32));
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBApagar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JBApagar.setText("Apagar");
        JBApagar.setPreferredSize(new java.awt.Dimension(92, 32));
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        JTFNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        JLNomeProd1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLNomeProd1.setText("Categoria");

        JLNomeProd2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLNomeProd2.setText("Unidade");

        JLNomeProd3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLNomeProd3.setText("QuantidadeMaxima");

        JLNomeProd4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLNomeProd4.setText("QuantidadeMinima");

        JTFUnidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        JTFCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        JTFQuantidadeMaxima.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        JTFQuantidadeMinima.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLNomeProd)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLQuantidade)
                                    .addComponent(JTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLNomeProd4)
                                    .addComponent(JTFQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLNomeProd2)
                                    .addComponent(JTFUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLPreco)
                                    .addComponent(JLNomeProd3)
                                    .addComponent(JTFQuantidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLNomeProd1)
                                    .addComponent(JTFCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(JBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(JBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLNomeProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLQuantidade)
                            .addComponent(JLPreco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLNomeProd4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(JLNomeProd2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBCancelar)
                            .addComponent(JLNomeProd3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFQuantidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(JLNomeProd1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        
        try {
            // recebendo e validando dados da interface gr�fica.
           int idProduto = 0;
        String nome = "";
        int quantidadeEstoque = 0;
        double precoUnitario = 0;
        String unidade = "";
        int quantidadeMinima = 0;
        int quantidadeMaxima = 0;
        String categoria = "";

        if (this.JTFNome.getText().length() < 2) {
            throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
        } else {
            nome = this.JTFNome.getText();
        }

        if (this.JTFQuantidade.getText().length() <= 0) {
            throw new Mensagem("Quantidade deve ser numero e maior que 0");
        } else {
            quantidadeEstoque = Integer.parseInt(this.JTFQuantidade.getText());
        }

        if (this.JTFPreco.getText().length() <= 0) {
            throw new Mensagem("PrecoUnitario deve ser numero e maior que zero");
        } else {
            precoUnitario = Double.parseDouble(this.JTFPreco.getText());
        }
        
        if (this.JTFUnidade.getText().length() < 1) {
            throw new Mensagem("Unidade deve conter ao menos 1 caracteres.");
        } else {
            unidade = this.JTFUnidade.getText();
        }
        
         if (this.JTFQuantidadeMinima.getText().length() <= 0) {
            throw new Mensagem("QuantidadeMinima deve ser numero e maior que 0");
        } else {
            quantidadeMinima = Integer.parseInt(this.JTFQuantidadeMinima.getText());
        }
         
          if (this.JTFQuantidadeMaxima.getText().length() <= 0) {
            throw new Mensagem("QuantidadeMaxima deve ser numero e maior que 0");
        } else {
            quantidadeMaxima = Integer.parseInt(this.JTFQuantidadeMaxima.getText());
        }
          
           if (this.JTFCategoria.getText().length() < 2) {
            throw new Mensagem("categoria deve conter ao menos 2 caracteres.");
        } else {
            categoria = this.JTFCategoria.getText();
        }
          
           if (this.JTProduto.getSelectedRow() == -1) {
            throw new Mensagem("Primeiro Selecione um produto para Alterar");
        } else {
            idProduto = Integer.parseInt(this.JTProduto.getValueAt(this.JTProduto.getSelectedRow(), 0).toString());
        }
        

        // envia os dados para o produto processar
        if (this.objetoproduto.updateProduto(idProduto, nome, precoUnitario, unidade, quantidadeEstoque, quantidadeMinima, quantidadeMaxima, categoria)) {
            // limpa os campos
            this.JTFNome.setText("");
            this.JTFQuantidade.setText("");
            this.JTFPreco.setText(""); 
            this.JTFUnidade.setText("");
            this.JTFQuantidadeMinima.setText("");
            this.JTFQuantidadeMaxima.setText("");
            this.JTFCategoria.setText("");
            JOptionPane.showMessageDialog(null, "Produto Alterada com Sucesso!");
        }
        // Exibe no console o produto cadastrado
        System.out.println(this.objetoproduto.getMinhaLista().toString());
    }
        
        catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
    }
    catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
    }
    

        finally {
            // atualiza a tabela.
            carregaTabela();
    }
                     
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
       
         try {
            // validando dados da interface gráfica.
            int idProduto = 0;
            if (this.JTProduto.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro Selecione um Produto para APAGAR");
            } else {
                idProduto = Integer.parseInt(this.JTProduto.getValueAt(this.JTProduto.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este Produto ?");

            if (respostaUsuario == 0) {// clicou em SIM
                // envia os dados para o produto processar
                if (this.objetoproduto.deleteProduto(idProduto)) {
                    // limpa os campos
                    this.JTFNome.setText("");
                    this.JTFQuantidade.setText("");
                    this.JTFPreco.setText("");
                    this.JTFUnidade.setText("");
                    this.JTFQuantidadeMinima.setText("");
                    this.JTFQuantidadeMaxima.setText("");
                    this.JTFCategoria.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Produto Apagada com Sucesso!");
                }
            }
            // atualiza a tabela.
            System.out.println(this.objetoproduto.getMinhaLista().toString());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void JTProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTProdutoMouseClicked
     
         if (this.JTProduto.getSelectedRow() != -1) {
            String nome = this.JTProduto.getValueAt(this.JTProduto.getSelectedRow(), 1).toString();
            int quantidadeEstoque = Integer.parseInt(this.JTProduto.getValueAt(this.JTProduto.getSelectedRow(), 2).toString());
            double precoUnitario = Double.parseDouble(this.JTProduto.getValueAt(this.JTProduto.getSelectedRow(), 3).toString());
            String unidade = this.JTProduto.getValueAt(this.JTProduto.getSelectedRow(), 4).toString();
            int quantidadeMinima = Integer.parseInt(this.JTProduto.getValueAt(this.JTProduto.getSelectedRow(), 5).toString());
            int quantidadeMaxima = Integer.parseInt(this.JTProduto.getValueAt(this.JTProduto.getSelectedRow(), 6).toString());
            String categoria = this.JTProduto.getValueAt(this.JTProduto.getSelectedRow(), 7).toString();

            this.JTFNome.setText(nome);
            this.JTFQuantidade.setText(String.valueOf(quantidadeEstoque));
            this.JTFPreco.setText(String.valueOf(precoUnitario));
            this.JTFUnidade.setText(String.valueOf(unidade));
            this.JTFQuantidadeMinima.setText(String.valueOf(quantidadeMinima));
            this.JTFQuantidadeMaxima.setText(String.valueOf(quantidadeMaxima));
            this.JTFCategoria.setText(categoria);
        }
    }//GEN-LAST:event_JTProdutoMouseClicked

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
            java.util.logging.Logger.getLogger(FrmGerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGerenciarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JLabel JLNomeProd;
    private javax.swing.JLabel JLNomeProd1;
    private javax.swing.JLabel JLNomeProd2;
    private javax.swing.JLabel JLNomeProd3;
    private javax.swing.JLabel JLNomeProd4;
    private javax.swing.JLabel JLPreco;
    private javax.swing.JLabel JLQuantidade;
    private javax.swing.JTextField JTFCategoria;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFPreco;
    private javax.swing.JTextField JTFQuantidade;
    private javax.swing.JTextField JTFQuantidadeMaxima;
    private javax.swing.JTextField JTFQuantidadeMinima;
    private javax.swing.JTextField JTFUnidade;
    private javax.swing.JTable JTProduto;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
