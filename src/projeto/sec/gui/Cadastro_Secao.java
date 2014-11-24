/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto.sec.gui;

import javax.swing.JOptionPane;
import projeto.sec.model.Secao;
import projeto.sec.model.Urna;
import projeto.sec.persistencia.Urna_Persistencia;

/**
 *
 * @author Rodrigo
 */
public class Cadastro_Secao extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_Zona
     */
    public Cadastro_Secao() {
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

        jPanelCadastroUrna = new javax.swing.JPanel();
        jLabelN_Zona = new javax.swing.JLabel();
        jTextFieldSecao = new javax.swing.JTextField();
        jTextFieldVotos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLocalizacao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldQtdEleitores = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNumZona = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCadastroUrna.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelN_Zona.setText("Nº Seção");

        jTextFieldSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSecaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Votos");

        jLabel4.setText("Localização");

        jButton1.setText("Cadastro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantidade Eleitores");

        jLabel6.setText("Numero da Zona");

        javax.swing.GroupLayout jPanelCadastroUrnaLayout = new javax.swing.GroupLayout(jPanelCadastroUrna);
        jPanelCadastroUrna.setLayout(jPanelCadastroUrnaLayout);
        jPanelCadastroUrnaLayout.setHorizontalGroup(
            jPanelCadastroUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUrnaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroUrnaLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelN_Zona)
                            .addComponent(jTextFieldSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(19, 19, 19))
                    .addGroup(jPanelCadastroUrnaLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldVotos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldQtdEleitores, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldNumZona, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 130, Short.MAX_VALUE))))
        );
        jPanelCadastroUrnaLayout.setVerticalGroup(
            jPanelCadastroUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUrnaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelN_Zona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldVotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldQtdEleitores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCadastroUrna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastroUrna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Secao secao = new Secao();
        boolean funcionou; 
        if (!jTextFieldSecao.getText().equalsIgnoreCase("") || 
                !jTextFieldLocalizacao.getText().equalsIgnoreCase("") ||
                !jTextFieldVotos.getText().equalsIgnoreCase("") ||
                !jTextFieldNumZona.getText().equalsIgnoreCase("") ||
                !jTextFieldQtdEleitores.getText().equalsIgnoreCase("")) {
            //
            secao.setNum_secao(Integer.parseInt(jTextFieldSecao.getText()));
            secao.setVotos(Integer.parseInt(jTextFieldVotos.getText()));
            secao.setLocalizacao(jTextFieldLocalizacao.getText());
            secao.setNum_zona(Integer.parseInt(jTextFieldNumZona.getText()));
            secao.setQtdEleitores(Integer.parseInt(jTextFieldQtdEleitores.getText()));
        } else {
		JOptionPane.showMessageDialog(null,"Nome n�o pode ser vazio!!");
        }
        
        funcionou = Secao_Persistencia.save(secao);
        if(funcionou){
            JOptionPane.showMessageDialog(null, "Cadastro com sucesso!");
            setVisible(false); 
        }else
            JOptionPane.showMessageDialog(null, "ERROR 404: Erro de cadastro!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSecaoActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Secao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Secao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelN_Zona;
    public static javax.swing.JPanel jPanelCadastroUrna;
    private javax.swing.JTextField jTextFieldLocalizacao;
    private javax.swing.JTextField jTextFieldNumZona;
    private javax.swing.JTextField jTextFieldQtdEleitores;
    public static javax.swing.JTextField jTextFieldSecao;
    private javax.swing.JTextField jTextFieldVotos;
    // End of variables declaration//GEN-END:variables
}