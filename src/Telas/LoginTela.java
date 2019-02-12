/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author bokao
 */
public class LoginTela extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public LoginTela() {
        initComponents();
    }

    public void logar() {

        try {
            String sql = "select * from usuario where loginUsu='" + txtUsuario.getText() + "'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                if (rs.getString("senhaUsu").equals(txtSenha.getText())) {
                    PrincipalTela tela = new PrincipalTela();
                    tela.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Usuário ou senha inválida!!");
                    txtUsuario.setText("");
                    txtSenha.setText("");
                    txtUsuario.requestFocus();

                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar itens", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2LogoLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAcessar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        jLabel2LogoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/FundoLogin.jpg"))); // NOI18N
        jLabel2LogoLogin.setText("Tela de Login");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/FundoLogin.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Login");
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonAcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ico_login.png"))); // NOI18N
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        jButtonAcessar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAcessarKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(300, 150, 70, 50);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ico_logout.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jButtonSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSairKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(400, 150, 70, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Usuário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 60, 60, 20);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSenha.setText("Senha");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(230, 110, 70, 20);

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(300, 50, 170, 30);

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(300, 100, 170, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Logo200px.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 20, 220, 200);

        setSize(new java.awt.Dimension(516, 288));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        logar();
        txtUsuario.setText("");
        txtSenha.setText("");
        txtUsuario.requestFocus();
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtSenha.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jButtonAcessar.requestFocus();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void jButtonAcessarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAcessarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            logar();
        }

    }//GEN-LAST:event_jButtonAcessarKeyPressed

    private void jButtonSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSairKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSairKeyPressed

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
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2LogoLogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPasswordField txtSenha;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
