
package visao;

import dao.ProdutoDAO;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.List;
import model.Produto;

public class FrmRelatorioAbaixoMin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmRelatorioAbaixoMin.class.getName());

    
    public FrmRelatorioAbaixoMin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTQuantMin = new javax.swing.JTable();
        Gerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos abaixo da quantidade mínima");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Produtos abaixo da quantidade mínima");

        fechar.setText("Fechar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        JTQuantMin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID PRODUTO", "PRODUTO", "ESTOQUE ATUAL", "ESTOQUE MINIMO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTQuantMin);

        Gerar.setText("Gerar");
        Gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Gerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechar)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gerar)
                    .addComponent(fechar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_fecharActionPerformed

    private void GerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) JTQuantMin.getModel();
        modelo.setNumRows(0);
        ProdutoDAO dao = new ProdutoDAO();
        
        try{
           List<Produto> produtos = dao.listEstoqueAbaixoMinimo();
            for(Produto p : produtos){
                modelo.addRow(new Object[]{
                     p.getIdProduto(),
                p.getNome(),
                p.getQuantidadeEstoque(),
                p.getQuantidadeMinima()                      
                });
            }
          }catch (Exception ex){
              System.err.println("Erro ao carregar tabela:" + ex.getMessage());
        }
    }//GEN-LAST:event_GerarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmRelatorioAbaixoMin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gerar;
    private javax.swing.JTable JTQuantMin;
    private javax.swing.JButton fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
