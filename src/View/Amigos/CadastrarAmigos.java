package View.Amigos;

import Model.Amigo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastrarAmigos extends javax.swing.JFrame {
    
    private Amigo objeto;

    public CadastrarAmigos() {
        initComponents();
        this.objeto = new Amigo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_cadasamg_cadastra = new javax.swing.JButton();
        bt_cadasamg_cancela = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf_cadasamg_tel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_cadasamg_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de amigos");

        bt_cadasamg_cadastra.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        bt_cadasamg_cadastra.setText("Cadastrar");
        bt_cadasamg_cadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadasamg_cadastraActionPerformed(evt);
            }
        });

        bt_cadasamg_cancela.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        bt_cadasamg_cancela.setText("Cancelar");
        bt_cadasamg_cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadasamg_cancelaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel1.setText("Telefone:");

        tf_cadasamg_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cadasamg_telActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        tf_cadasamg_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cadasamg_nomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 2, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Novo amigo");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_cadasamg_tel))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bt_cadasamg_cadastra)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_cadasamg_cancela))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_cadasamg_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_cadasamg_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_cadasamg_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cadasamg_cadastra)
                    .addComponent(bt_cadasamg_cancela))
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadasamg_cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadasamg_cancelaActionPerformed
        this.setVisible(false);
        GerenciarAmigos objeto = new GerenciarAmigos();
        objeto.setVisible(true);
    }//GEN-LAST:event_bt_cadasamg_cancelaActionPerformed

    private void tf_cadasamg_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cadasamg_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cadasamg_nomeActionPerformed

    private void tf_cadasamg_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cadasamg_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cadasamg_telActionPerformed

    private void bt_cadasamg_cadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadasamg_cadastraActionPerformed
        
        try {
            String nome = "";
            String nmrtelefone = "";
            
            if (this.tf_cadasamg_nome.getText().length() <= 0){
                throw new Mensagens ("O campo 'nome' deve ser preenchido.");
            } else {
                nome = this.tf_cadasamg_nome.getText();
            }
            
            if (this.tf_cadasamg_tel.getText().length() <= 0){
                throw new Mensagens ("O campo 'telefone' deve ser preenchido.");
            } else {
                nmrtelefone = this.tf_cadasamg_tel.getText();
            }
            
            if (this.objeto.InsertAmigoBD(nome, nmrtelefone)){
                JOptionPane.showMessageDialog(rootPane, "Amigo cadastrado com sucesso!");
                
                this.tf_cadasamg_nome.setText("");
                this.tf_cadasamg_tel.setText("");
            }
            
            
        } catch (Mensagens erro){
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarAmigos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_cadasamg_cadastraActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAmigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadasamg_cadastra;
    private javax.swing.JButton bt_cadasamg_cancela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tf_cadasamg_nome;
    private javax.swing.JTextField tf_cadasamg_tel;
    // End of variables declaration//GEN-END:variables
}
