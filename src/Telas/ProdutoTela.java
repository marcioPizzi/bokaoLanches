
package Telas;

import Modelo.ProdutoModelo;
import Controle.ProdutoControle;
import DAO.ClienteDAO;
import DAO.ProdutoDAO;
import Utilitarios.Conexao;
import Utilitarios.Corretores;
import Utilitarios.ModeloTabela;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.MaskFormatter;


public class ProdutoTela extends javax.swing.JFrame {

    MaskFormatter FormatoTel;
    SimpleDateFormat FormatoData;
    Date DataAtual;
    ProdutoModelo prodB;
    ProdutoControle prodC;
    ProdutoDAO prodD;
    String situacao;
    
    public ProdutoTela() {
        initComponents();

        FormatoData = new SimpleDateFormat("dd/MM/yyyy");
        DataAtual = new Date();
        prodC = new ProdutoControle();
        prodB = new ProdutoModelo();
        prodD = new ProdutoDAO();
        
        preencherTabela("select * from produto order by descricaoProd");
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelCadCli = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        txtdescricaoProd = new javax.swing.JTextField();
        txtPesquisarProd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanelButton = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        cbtipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecoCusto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionários");
        setResizable(false);

        jPanelCadCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Cargo:");

        txtCodProd.setEditable(false);
        txtCodProd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodProd.setEnabled(false);

        txtdescricaoProd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtdescricaoProd.setEnabled(false);
        txtdescricaoProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdescricaoProdKeyPressed(evt);
            }
        });

        txtPesquisarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPesquisarProdMousePressed(evt);
            }
        });
        txtPesquisarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarProdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarProdKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Pesquisar:");

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/iconfinder_hamburger-fast-food-patty-bread_3558110.png"))); // NOI18N
        jButtonNovo.setToolTipText("NOVO");
        jButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNovo.setMaximumSize(new java.awt.Dimension(72, 60));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jButtonNovo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNovoKeyPressed(evt);
            }
        });

        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/btn_SAlvar.png"))); // NOI18N
        jButtonCadastrar.setToolTipText("CADASTRAR");
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.setEnabled(false);
        jButtonCadastrar.setMaximumSize(new java.awt.Dimension(72, 60));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jButtonCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCadastrarKeyPressed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/btn_editar.png"))); // NOI18N
        jButtonEditar.setToolTipText("EDITAR");
        jButtonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditar.setEnabled(false);
        jButtonEditar.setMaximumSize(new java.awt.Dimension(72, 60));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/clean.png"))); // NOI18N
        jButtonExcluir.setToolTipText("CANCELAR");
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.setMaximumSize(new java.awt.Dimension(72, 60));
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonLayout = new javax.swing.GroupLayout(jPanelButton);
        jPanelButton.setLayout(jPanelButtonLayout);
        jPanelButtonLayout.setHorizontalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanelButtonLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCadastrar, jButtonEditar, jButtonExcluir, jButtonNovo});

        jPanelButtonLayout.setVerticalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonLayout.createSequentialGroup()
                .addGroup(jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um tipo de produto", "Lanches", "Cervejas", "Refrigerantes", "Porções", "Doces", " " }));
        cbtipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbtipo.setEnabled(false);
        cbtipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbtipoKeyPressed(evt);
            }
        });

        jLabel5.setText("Valor Venda:");

        txtPrecoVenda.setEnabled(false);
        txtPrecoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecoVendaKeyPressed(evt);
            }
        });

        jLabel6.setText("Valor Custo:");

        txtPrecoCusto.setEnabled(false);
        txtPrecoCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecoCustoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadCliLayout = new javax.swing.GroupLayout(jPanelCadCli);
        jPanelCadCli.setLayout(jPanelCadCliLayout);
        jPanelCadCliLayout.setHorizontalGroup(
            jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadCliLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelCadCliLayout.createSequentialGroup()
                        .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCadCliLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdescricaoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCadCliLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelCadCliLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCadCliLayout.setVerticalGroup(
            jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadCliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCodProd)
                        .addComponent(jLabel2))
                    .addComponent(txtdescricaoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PRODUTO");

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutoMouseClicked(evt);
            }
        });
        jTableProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableProdutoKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTableProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jPanelCadCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2728, 2728, 2728))
        );

        setSize(new java.awt.Dimension(653, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        try {
            String sql = "select * from usuario where loginUsu like '" + LoginTela.txtUsuario.getText() + "'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                if (rs.getString("permissaoUsu").equals("Administrador")) {
                    limparCampos();
                    habilitarCampos(true);
                    prodC.ControleCodigo();
                    txtCodProd.setText(prodC.ControleCodigo());
                    jButtonCadastrar.setEnabled(true);                   
                    jButtonNovo.setEnabled(false);
                    //txtPrecoCusto.setText("0.00");
                    //txtPrecoVenda.setText("0.00");
                    txtdescricaoProd.requestFocus();
                } else {                    
                    JOptionPane.showMessageDialog(null, "Você não tem permissão para esta Funcionalidade!!\n Contate o administrador do sistema!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Você não tem permissão para esta Funcionalidade!!\n Contate o administrador do sistema!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }


    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        popularProdutoModelo();
        prodC.verificardados(prodB);
        limparCampos();
        txtPesquisarProd.setEnabled(true);
        jButtonCadastrar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        txtdescricaoProd.setText("");
        habilitarCampos(false);

    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        try {
            String sql = "select * from usuario where loginUsu like '" + LoginTela.txtUsuario.getText() + "'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                if (rs.getString("permissaoUsu").equals("Administrador")) {
                    popularProdutoModelo();
                    prodC.verificardadosEditar(prodB);
                    limparCampos();
                    habilitarCampos(false);
                    jButtonNovo.setEnabled(true);
                    jButtonEditar.setEnabled(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você não tem permissão para editar os campos!!\n Contate o administrador do sistema!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Você não tem permissão para editar os campos!!\n Contate o administrador do sistema!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }


    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        limparCampos();
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonCadastrar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        cbtipo.setEnabled(false);
        txtPesquisarProd.requestFocus();

        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void txtPesquisarProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarProdKeyReleased
        preencherTabela("select * from produto where descricaoProd like '%" + txtPesquisarProd.getText() + "%' order by descricaoProd ");
    }//GEN-LAST:event_txtPesquisarProdKeyReleased

    private void jTableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoMouseClicked

        String descricao = "" + jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 1);
        prodB = prodC.ControlePreencherCampos(descricao);
        habilitarCampos(true);
        jButtonCadastrar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(true);
        txtCodProd.setText(prodB.getCodigo() + "");
        txtdescricaoProd.setText(prodB.getDescricao());
        cbtipo.setSelectedItem(prodB.getTipo());
        txtPrecoCusto.setText(prodB.getPrecoCusto() + "");
        txtPrecoVenda.setText(prodB.getPrecoVenda() + "");
        


    }//GEN-LAST:event_jTableProdutoMouseClicked

    private void txtPesquisarProdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesquisarProdMousePressed
        
    }//GEN-LAST:event_txtPesquisarProdMousePressed

    private void txtdescricaoProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescricaoProdKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cbtipo.requestFocus();
        }
    }//GEN-LAST:event_txtdescricaoProdKeyPressed

    private void cbtipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbtipoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtPrecoCusto.requestFocus();
        }
    }//GEN-LAST:event_cbtipoKeyPressed

    private void jButtonCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCadastrarKeyPressed
        popularProdutoModelo();
        prodC.verificardados(prodB);
        limparCampos();
        txtPesquisarProd.setEnabled(true);
        jButtonCadastrar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        txtdescricaoProd.setText("");
        txtPrecoCusto.setText("");
        txtPrecoVenda.setText("");
        habilitarCampos(false);
        txtPesquisarProd.requestFocus();
    }//GEN-LAST:event_jButtonCadastrarKeyPressed

    private void txtPesquisarProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarProdKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (txtPesquisarProd.getText().equals("")) {
                jButtonNovo.requestFocus();
            }else {
                jTableProduto.requestFocus();
            } 
        }
    }//GEN-LAST:event_txtPesquisarProdKeyPressed

    private void jButtonNovoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonNovoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            try {
                String sql = "select * from usuario where loginUsu like '" + LoginTela.txtUsuario.getText() + "'";
                PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    if (rs.getString("permissaoUsu").equals("Administrador") || (rs.getString("permissaoUsu").equals("Operador"))) {
                        limparCampos();
                        habilitarCampos(true);
                        prodC.ControleCodigo();
                        txtCodProd.setText(prodC.ControleCodigo());
                        jButtonNovo.setEnabled(false);
                        //txtPrecoCusto.setText("0");
                        //txtPrecoVenda.setText("0");
                        txtdescricaoProd.requestFocus();
                    } 
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Você não tem permissão para esta Funcionalidade!!\n Contate o administrador do sistema!!", "ERRO", 0, new ImageIcon("imagens/btn_users.png"));
            }

        }
    }//GEN-LAST:event_jButtonNovoKeyPressed

    private void txtPrecoCustoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoCustoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtPrecoVenda.requestFocus();            
        }
    }//GEN-LAST:event_txtPrecoCustoKeyPressed

    private void jTableProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableProdutoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            String descricao = "" + jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 1);
        prodB = prodC.ControlePreencherCampos(descricao);
        habilitarCampos(true);
        jButtonCadastrar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(true);
        txtCodProd.setText(prodB.getCodigo() + "");
        txtdescricaoProd.setText(prodB.getDescricao());
        cbtipo.setSelectedItem(prodB.getTipo());
        txtPrecoCusto.setText(prodB.getPrecoCusto() + "");
        txtPrecoVenda.setText(prodB.getPrecoVenda() + "");
        txtPesquisarProd.setText("");
        txtdescricaoProd.requestFocus();        
        }
    }//GEN-LAST:event_jTableProdutoKeyPressed

    private void txtPrecoVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoVendaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (jButtonEditar.isEnabled()){
                jButtonEditar.requestFocus();
            }else {
                jButtonCadastrar.requestFocus();
            }
            
        }
    }//GEN-LAST:event_txtPrecoVendaKeyPressed

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
            java.util.logging.Logger.getLogger(ProdutoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ProdutoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelButton;
    private javax.swing.JPanel jPanelCadCli;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtPesquisarProd;
    private javax.swing.JTextField txtPrecoCusto;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtdescricaoProd;
    // End of variables declaration//GEN-END:variables

    final void habilitarCampos(boolean valor) {
        txtCodProd.setEnabled(valor);
        txtdescricaoProd.setEnabled(valor);
        cbtipo.setEnabled(valor);
        txtPrecoCusto.setEnabled(valor);
        txtPrecoVenda.setEnabled(valor);
        jButtonCadastrar.setEnabled(valor);
        jButtonExcluir.setEnabled(valor);

    }

    final void popularProdutoModelo() {
        prodB.setDescricao(txtdescricaoProd.getText());
        prodB.setTipo(cbtipo.getSelectedItem().toString());
        prodB.setPrecoCusto(Double.parseDouble(txtPrecoCusto.getText().replace(",",".")));
        prodB.setPrecoVenda(Double.parseDouble(txtPrecoVenda.getText().replace(",",".")));
    }

    final void limparCampos() {
        txtCodProd.setText("");
        txtdescricaoProd.setText("");
        cbtipo.setSelectedIndex(0);
        txtPrecoCusto.setText("");
        txtPrecoVenda.setText("");
        txtPesquisarProd.setText("");
    }

    public void preencherTabela(String pesquisa) {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Código", "Descrição", "Tipo", "Preço Custo", "Preço Venda"};

        //String SQL = "select * from funcionario where nomeFunc like '%" + pesquisa + "%' and situacaoFunc like 'Ativo' order by nomeFunc";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(pesquisa);
            ResultSet rs = pst.executeQuery();
            rs.next();
            do {
                dados.add(new Object[]{rs.getInt("codProd"), rs.getString("descricaoProd"), rs.getString("tipoProd"), rs.getDouble("precoCusto"), rs.getDouble("precoVenda")});
            } while (rs.next());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            //JOptionPane.showMessageDialog(null, "Erro ao preencher Tabela", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableProduto.setModel(modelo);
        jTableProduto.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTableProduto.getColumnModel().getColumn(0).setResizable(false);
        jTableProduto.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTableProduto.getColumnModel().getColumn(1).setResizable(false);
        jTableProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableProduto.getColumnModel().getColumn(2).setResizable(false);
        jTableProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableProduto.getColumnModel().getColumn(3).setResizable(false);
        jTableProduto.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTableProduto.getColumnModel().getColumn(4).setResizable(false);
        jTableProduto.getTableHeader().setReorderingAllowed(false);
        jTableProduto.setAutoResizeMode(jTableProduto.AUTO_RESIZE_OFF);
        jTableProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
}
