package Telas;

import Utilitarios.Conexao;
import Utilitarios.FundoTela;
import java.awt.GridLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PrincipalTela extends javax.swing.JFrame {

    FundoTela tela;
    ClienteTela clienteTela;
    FuncionarioTela FuncTela;
    EntregadorTela MtbTela;
    ProdutoTela prodTela;
    PedidoTela pedTela;
    TelaPedidos telaPedidos;

    public PrincipalTela() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new GridLayout());

        tela = new FundoTela("imagens/lanches.jpg");
        getContentPane().add(tela);

        jMenuItemCliente.setIcon(new ImageIcon("imagens/ico_clientes.png"));
        jMenuItemFuncionario.setIcon(new ImageIcon("imagens/ico_func.png"));
        jMenuItemCardapio.setIcon(new ImageIcon("imagens/ico_cardapio.png"));
        jMenuItemMotoboy.setIcon(new ImageIcon("imagens/ico_boy.png"));
        MenuItemPedido.setIcon(new ImageIcon("Imagens/ico_food.png"));
        jMenuItemMesas.setIcon(new ImageIcon("imagens/table32.png"));
        jMenuCadastro.setIcon(new ImageIcon("imagens/inserir-32.png"));
        jMenuCaixa.setIcon(new ImageIcon("imagens/ico_caixa.png"));
        //jMenuRelatorio.setIcon(new ImageIcon("imagens/ico_rel.png"));
        //jMenuRelatorioCliente.setIcon(new ImageIcon("imagens/ico_clientes.png"));
        //jMenuItemRelatorioPedidos.setIcon(new ImageIcon("imagens/ico_pedidos.png"));
        jMenuSair.setIcon(new ImageIcon("imagens/ico_sair.png"));
        jMenuItemSair.setIcon(new ImageIcon("imagens/ico_logout.png"));
        jMenuItemUsuario.setIcon(new ImageIcon("imagens/usuarios.png"));

        MenuTela.setIcon(new ImageIcon("imagens/ico_tela.png"));
        JmenuTela.setIcon(new ImageIcon("imagens/ico_tela1.png"));

        ImageIcon icone = new ImageIcon("Imagens/Logo_ico_1.png");
        setIconImage(icone.getImage());

    }

   
    

    

   

    

    

    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuItemCardapio = new javax.swing.JMenuItem();
        jMenuItemMotoboy = new javax.swing.JMenuItem();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jMenuCaixa = new javax.swing.JMenu();
        MenuItemPedido = new javax.swing.JMenuItem();
        jMenuItemMesas = new javax.swing.JMenuItem();
        JmenuTela = new javax.swing.JMenu();
        MenuTela = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bokão Lanches");

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroActionPerformed(evt);
            }
        });

        jMenuItemCliente.setText("Clientes");
        jMenuItemCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemFuncionario.setText("Funcionários");
        jMenuItemFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFuncionario);

        jMenuItemCardapio.setText("Produtos");
        jMenuItemCardapio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCardapioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCardapio);

        jMenuItemMotoboy.setText("Entregador");
        jMenuItemMotoboy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemMotoboy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMotoboyActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemMotoboy);

        jMenuItemUsuario.setText("Usuários");
        jMenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemUsuario);

        jMenuBar1.add(jMenuCadastro);

        jMenuCaixa.setText("Atendimento");
        jMenuCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        MenuItemPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        MenuItemPedido.setText("Delivery");
        MenuItemPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuItemPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPedidoActionPerformed(evt);
            }
        });
        jMenuCaixa.add(MenuItemPedido);

        jMenuItemMesas.setText("Mesas");
        jMenuItemMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMesasActionPerformed(evt);
            }
        });
        jMenuCaixa.add(jMenuItemMesas);

        jMenuBar1.add(jMenuCaixa);

        JmenuTela.setText("Tela Pedidos");
        JmenuTela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        MenuTela.setText("Pedidos");
        MenuTela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuTelaActionPerformed(evt);
            }
        });
        JmenuTela.add(MenuTela);

        jMenuBar1.add(JmenuTela);

        jMenuSair.setText("Sair");
        jMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });

        jMenuItemSair.setText("SAIR");
        jMenuItemSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(666, 418));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed

    }//GEN-LAST:event_jMenuCadastroActionPerformed

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed
        FuncionarioTela TelaF = new FuncionarioTela();
        TelaF.setVisible(true);
    

    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        clienteTela = new ClienteTela();
        //tela.add(clienteTela);
        clienteTela.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemMotoboyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMotoboyActionPerformed
        MtbTela = new EntregadorTela();
        //tela.add(MtbTela);
        MtbTela.setVisible(true);
    }//GEN-LAST:event_jMenuItemMotoboyActionPerformed

    private void jMenuItemCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCardapioActionPerformed
        prodTela= new ProdutoTela();
        //tela.add(cardTela);
        prodTela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCardapioActionPerformed

    private void MenuItemPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPedidoActionPerformed
        pedTela= new PedidoTela();
       pedTela.setVisible(true);
        
    }//GEN-LAST:event_MenuItemPedidoActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
      System.exit(0);
       
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuItemMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMesasActionPerformed
        //MesasTela telaM = new MesasTela();
        //telaM.setVisible(true);
    }//GEN-LAST:event_jMenuItemMesasActionPerformed

    private void MenuTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuTelaActionPerformed
        telaPedidos = new TelaPedidos();
        telaPedidos.setVisible(true);
    }//GEN-LAST:event_MenuTelaActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
       dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioActionPerformed
        UsuarioTela usuarioT = new UsuarioTela();
        usuarioT.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalTela.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalTela.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalTela.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalTela.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalTela().setVisible(true);
            }
        
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JmenuTela;
    private javax.swing.JMenuItem MenuItemPedido;
    private javax.swing.JMenuItem MenuTela;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuCaixa;
    private javax.swing.JMenuItem jMenuItemCardapio;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemMesas;
    private javax.swing.JMenuItem jMenuItemMotoboy;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables

    private void VerificarPermissão(){
        try {
            String sql = "select * from usuario where like '"+LoginTela.txtUsuario.getText()+"'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                if(rs.getString("permissaoUsu").equals("Administrador")){
                    ClienteTela telaC = new ClienteTela();
                    telaC.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Você não tem permissão para esta Funcionalidade!!/n Contate o administrador do sistema!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Você não tem permissão para esta Funcionalidade!!/n Contate o administrador do sistema!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }









}
