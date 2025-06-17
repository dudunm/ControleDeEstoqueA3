package visao;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Categoria;

public class FrmCadastrarCategoria extends javax.swing.JFrame {
    
    public FrmCadastrarCategoria() {
        initComponents();
    }
    
    Categoria objeto = new Categoria();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLNomeProd = new javax.swing.JLabel();
        JBCadastrar = new javax.swing.JButton();
        JLNomeProd1 = new javax.swing.JLabel();
        JLNomeProd2 = new javax.swing.JLabel();
        JTFTamanho = new javax.swing.JTextField();
        JTFEmbalagem = new javax.swing.JTextField();
        JBCadastrarCategoria = new javax.swing.JButton();
        JBCancelarCategoria = new javax.swing.JButton();
        JTFNomeCategoria1 = new javax.swing.JTextField();
        JLNomeProd3 = new javax.swing.JLabel();

        JLNomeProd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLNomeProd.setText("Nome:");

        JBCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JBCadastrar.setText("Cadastrar");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Categorias");

        JLNomeProd1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLNomeProd1.setText("Nome:");

        JLNomeProd2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLNomeProd2.setText("Embalagem:");

        JTFTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTamanhoActionPerformed(evt);
            }
        });

        JTFEmbalagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFEmbalagemActionPerformed(evt);
            }
        });

        JBCadastrarCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JBCadastrarCategoria.setText("Cadastrar");
        JBCadastrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarCategoriaActionPerformed(evt);
            }
        });

        JBCancelarCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JBCancelarCategoria.setText("Cancelar");
        JBCancelarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarCategoriaActionPerformed(evt);
            }
        });

        JTFNomeCategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeCategoria1ActionPerformed(evt);
            }
        });

        JLNomeProd3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLNomeProd3.setText("Tamanho:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLNomeProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLNomeProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFNomeCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLNomeProd3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBCadastrarCategoria)
                        .addGap(179, 179, 179)
                        .addComponent(JBCancelarCategoria)))
                .addGap(221, 221, 221))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(JLNomeProd1)
                .addGap(18, 18, 18)
                .addComponent(JTFNomeCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(JLNomeProd3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLNomeProd2)
                .addGap(18, 18, 18)
                .addComponent(JTFEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCadastrarCategoria)
                    .addComponent(JBCancelarCategoria))
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTamanhoActionPerformed
        JBCadastrarCategoria.requestFocusInWindow();
    }//GEN-LAST:event_JTFTamanhoActionPerformed

    private void JBCancelarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarCategoriaActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarCategoriaActionPerformed

    private void JBCadastrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarCategoriaActionPerformed
        String nome = "";
        String tamanho = "";
        String embalagem = "";
        
        try{
            if(this.JTFNomeCategoria1.getText().length() < 2){
                 JOptionPane.showMessageDialog(null,"Nome deve conter ao menos 2 caracteres");
            }else {
                nome = this.JTFNomeCategoria1.getText();
            }
            if (this.JTFTamanho.getText().length() < 2) {
                JOptionPane.showMessageDialog(null,"Tamanho deve conter ao menos 2 caracteres");
            } else {
                tamanho = this.JTFTamanho.getText();
            }
            if (this.JTFEmbalagem.getText().length() < 2) {
                JOptionPane.showMessageDialog(null,"Embalagem deve conter ao menos 2 caracteres");
            } else {
                embalagem = this.JTFEmbalagem.getText();
            }
            
            if(nome.length() > 0 && tamanho.length() > 0 && embalagem.length() > 0){
                if(this.objeto.insertCategoria(nome, tamanho, embalagem)){
                    JOptionPane.showMessageDialog(rootPane, "Categoria cadastrada com sucesso");
                    this.JTFNomeCategoria1.setText("");
                    this.JTFTamanho.setText("");
                    this.JTFEmbalagem.setText("");
                }
                this.setVisible(false);
            }
        } catch(HeadlessException | SQLException ex){
            System.out.println("Erro");
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_JBCadastrarCategoriaActionPerformed

    private void JTFEmbalagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEmbalagemActionPerformed
        JBCadastrarCategoria.requestFocusInWindow();
    }//GEN-LAST:event_JTFEmbalagemActionPerformed

    private void JTFNomeCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeCategoria1ActionPerformed
        JBCadastrarCategoria.requestFocusInWindow();
    }//GEN-LAST:event_JTFNomeCategoria1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastrarCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCadastrarCategoria;
    private javax.swing.JButton JBCancelarCategoria;
    private javax.swing.JLabel JLNomeProd;
    private javax.swing.JLabel JLNomeProd1;
    private javax.swing.JLabel JLNomeProd2;
    private javax.swing.JLabel JLNomeProd3;
    private javax.swing.JTextField JTFEmbalagem;
    private javax.swing.JTextField JTFNomeCategoria1;
    private javax.swing.JTextField JTFTamanho;
    // End of variables declaration//GEN-END:variables
}
