
package Telas;

import Modelo.EntregadorModelo;
import Controle.EntregadorControle;
import DAO.EntregadorDAO;
import Utilitarios.Conexao;
import Utilitarios.ModeloTabela;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.MaskFormatter;


public class EntregadorTela extends javax.swing.JFrame {

    MaskFormatter FormatoTel;
    SimpleDateFormat FormatoData;
    Date DataAtual;

    EntregadorControle EntrC;
    EntregadorModelo EntrB;
    EntregadorDAO EntrD;
    
    
    private String situacao;

    public EntregadorTela() {
        initComponents();
        
        FormatoData = new SimpleDateFormat("dd/MM/yyyy");
        DataAtual = new Date();
        //txtDataCadEntr.setEnabled(false);
        EntrC = new EntregadorControle();
        EntrB = new EntregadorModelo();
        EntrD = new EntregadorDAO();
        
        preencherTabela("select * from entregador where situacaoEnt like 'Ativo' order by nomeEnt");
        
    }

    public void InativarEntregador() {
        try {

            String SQLInsertion = "update entregador set nomeEnt = ?, telEnt = ?, dtCadEnt = ?, situacaoEnt = ?  where codEnt = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, txtNomeEntr.getText());
            pst.setString(2, txtTelefoneEntr.getText());
            pst.setString(3, txtDataCadEntr.getText());
            pst.setString(4, situacao);
            pst.setInt(5, Integer.parseInt(txtCodEntr.getText().toString()));

            pst.execute();
            Conexao.getConnection().commit();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            //JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do entregador!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }

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
        jLabel9 = new javax.swing.JLabel();
        txtCodEntr = new javax.swing.JTextField();
        txtNomeEntr = new javax.swing.JTextField();
        jtPesquisarFunc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanelButton = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        txtDataCadEntr = new javax.swing.JFormattedTextField();
        try{
            FormatoTel = new MaskFormatter("#####-####");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erro ao inserir campo personalizado", "Erro", 0);
        }
        txtTelefoneEntr = new JFormattedTextField(FormatoTel);
        jRadioInativar = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEntregador = new javax.swing.JTable();

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
        setTitle("Entregadores");
        setResizable(false);

        jPanelCadCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Telefone: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Data cadastro:");

        txtCodEntr.setEditable(false);
        txtCodEntr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodEntr.setEnabled(false);

        txtNomeEntr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNomeEntr.setEnabled(false);
        txtNomeEntr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeEntrKeyPressed(evt);
            }
        });

        jtPesquisarFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtPesquisarFuncMousePressed(evt);
            }
        });
        jtPesquisarFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtPesquisarFuncKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisarFuncKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Pesquisar:");

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/addCliente.png"))); // NOI18N
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

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/clean.png"))); // NOI18N
        jButtonCancelar.setToolTipText("CANCELAR");
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(72, 60));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonLayout = new javax.swing.GroupLayout(jPanelButton);
        jPanelButton.setLayout(jPanelButtonLayout);
        jPanelButtonLayout.setHorizontalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanelButtonLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCadastrar, jButtonCancelar, jButtonEditar, jButtonNovo});

        jPanelButtonLayout.setVerticalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonLayout.createSequentialGroup()
                .addGroup(jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtDataCadEntr.setEditable(false);
        try {
            txtDataCadEntr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataCadEntr.setEnabled(false);

        txtTelefoneEntr.setEnabled(false);
        txtTelefoneEntr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneEntrKeyPressed(evt);
            }
        });

        jRadioInativar.setText("Inativar Entregador");
        jRadioInativar.setEnabled(false);
        jRadioInativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioInativarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadCliLayout = new javax.swing.GroupLayout(jPanelCadCli);
        jPanelCadCli.setLayout(jPanelCadCliLayout);
        jPanelCadCliLayout.setHorizontalGroup(
            jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelCadCliLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodEntr, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNomeEntr))
                        .addGroup(jPanelCadCliLayout.createSequentialGroup()
                            .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelCadCliLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTelefoneEntr, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel9))
                                .addGroup(jPanelCadCliLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtPesquisarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioInativar)
                                .addComponent(txtDataCadEntr, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanelCadCliLayout.setVerticalGroup(
            jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadCliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCodEntr)
                        .addComponent(jLabel2))
                    .addComponent(txtNomeEntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(txtDataCadEntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneEntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesquisarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jRadioInativar))
                .addGap(18, 18, 18)
                .addComponent(jPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Entregadores");

        jTableEntregador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableEntregador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableEntregador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEntregadorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableEntregador);

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
                        .addGap(235, 235, 235)
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2739, 2739, 2739))
        );

        setSize(new java.awt.Dimension(676, 532));
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
                    DataAtual = new Date();
                    txtDataCadEntr.setText(FormatoData.format(DataAtual));
                    habilitarCampos(true);                    
                    EntrC.ControleCodigo();
                    jButtonCadastrar.setEnabled(true);
                    txtCodEntr.setText(EntrC.ControleCodigo());
                    jButtonNovo.setEnabled(false);
                    jButtonCancelar.setEnabled(true);
                    txtNomeEntr.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Você não tem permissão para esta Funcionalidade!!\n Contate o administrador do sistema!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Você não tem permissão para esta Funcionalidade!!\n Contate o administrador do sistema!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        popularEntregadorModelo();
        EntrC.verificardados(EntrB);
        limparCampos();
        jtPesquisarFunc.setEnabled(true);
        jButtonCadastrar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        //txtNomeEntr.setText("");
        //txtDataCadEntr.setText("");
        habilitarCampos(false);
        preencherTabela("select * from entregador where situacaoEnt like 'Ativo' order by nomeEnt");
        //modelo.setNumRows(0);
        //EntrC.controlePesquisa(jtPesquisarFunc.getText(), modelo);
        jButtonCancelar.setEnabled(false);

    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        popularEntregadorModelo();
        EntrC.verificardadosEditar(EntrB);
        limparCampos();
        //modelo.setNumRows(0);
        habilitarCampos(false);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jtPesquisarFunc.setEnabled(true);
        preencherTabela("select * from entregador where situacaoEnt like 'Ativo' order by nomeEnt");


    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jtPesquisarFuncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisarFuncKeyReleased
        preencherTabela("select * from entrega where nomeEnt like '" + jtPesquisarFunc.getText() + "%' and situacaoEnt like 'Ativo' order by nomeEnt");
    }//GEN-LAST:event_jtPesquisarFuncKeyReleased

    private void jTableEntregadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEntregadorMouseClicked
        String nomeEntregador = "" + jTableEntregador.getValueAt(jTableEntregador.getSelectedRow(), 1);
        
        EntrB = EntrC.ControlePreencherCampos(nomeEntregador);
        habilitarCampos(true);
        jButtonCadastrar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        txtCodEntr.setText(EntrB.getCodigo() + "");
        txtNomeEntr.setText(EntrB.getNome());
        txtTelefoneEntr.setText(EntrB.getTelefone());
        txtDataCadEntr.setText(EntrB.getDataCad());
        jButtonCancelar.setEnabled(true);

    }//GEN-LAST:event_jTableEntregadorMouseClicked

    private void jtPesquisarFuncMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPesquisarFuncMousePressed
        
    }//GEN-LAST:event_jtPesquisarFuncMousePressed

    private void jtPesquisarFuncKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisarFuncKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (jtPesquisarFunc.getText().equals("")) {
                jButtonNovo.requestFocus();
            } else {
                preencherTabela("select * from entregador where situacaoEnt like 'Ativo' order by nomeEnt");
            }
        }
    }//GEN-LAST:event_jtPesquisarFuncKeyPressed

    private void jRadioInativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInativarActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente Inativar este Funcionario??");
        if (resposta == JOptionPane.YES_OPTION) {
            if (jRadioInativar.isSelected()) {
                situacao = "Inativo";
                InativarEntregador();
                
                JOptionPane.showMessageDialog(null, "Cliente Inativado com sucesso!!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
                limparCampos();
                jRadioInativar.setEnabled(false);
                //modelo.setNumRows(0);
                jButtonEditar.setEnabled(false);
                jButtonCancelar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jRadioInativarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limparCampos();
        txtDataCadEntr.setText("");
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonCadastrar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        //modelo.setNumRows(0);
        jtPesquisarFunc.requestFocus();

    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
                        EntrC.ControleCodigo();
                        DataAtual = new Date();
                        txtDataCadEntr.setText(FormatoData.format(DataAtual));
                        txtCodEntr.setText(EntrC.ControleCodigo());
                        jButtonNovo.setEnabled(false);
                        jButtonCancelar.setEnabled(true);
                        jRadioInativar.setEnabled(true);
                        txtNomeEntr.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(null, "Você não tem permissão para esta Funcionalidade!!\n Contate o administrador do sistema!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Você não tem permissão para esta Funcionalidade!!\n Contate o administrador do sistema!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            }

        }
    }//GEN-LAST:event_jButtonNovoKeyPressed

    private void txtNomeEntrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeEntrKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtTelefoneEntr.requestFocus();
        }
    }//GEN-LAST:event_txtNomeEntrKeyPressed

    private void txtTelefoneEntrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneEntrKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if(jButtonCadastrar.isEnabled()){
                jButtonCadastrar.requestFocus();
            }else{
                jButtonEditar.requestFocus();
            }
        }
    }//GEN-LAST:event_txtTelefoneEntrKeyPressed

    private void jButtonCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCadastrarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            popularEntregadorModelo();
            EntrC.verificardados(EntrB);
            limparCampos();
            jtPesquisarFunc.setEnabled(true);
            jButtonCadastrar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            txtNomeEntr.setText("");
            txtDataCadEntr.setText("");
            habilitarCampos(false);
            //modelo.setNumRows(0);
            //EntrC.controlePesquisa(jtPesquisarFunc.getText(), modelo);
            preencherTabela("select * from entregador where situacaoEnt like 'Ativo' order by nomeEnt");
            jButtonCancelar.setEnabled(false);
            jtPesquisarFunc.requestFocus();
        }
    }//GEN-LAST:event_jButtonCadastrarKeyPressed

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
            java.util.logging.Logger.getLogger(EntregadorTela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntregadorTela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntregadorTela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntregadorTela.class
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
                new EntregadorTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelButton;
    private javax.swing.JPanel jPanelCadCli;
    private javax.swing.JRadioButton jRadioInativar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableEntregador;
    private javax.swing.JTextField jtPesquisarFunc;
    private javax.swing.JTextField txtCodEntr;
    private javax.swing.JFormattedTextField txtDataCadEntr;
    private javax.swing.JTextField txtNomeEntr;
    private javax.swing.JTextField txtTelefoneEntr;
    // End of variables declaration//GEN-END:variables

    final void habilitarCampos(boolean valor) {
        txtCodEntr.setEnabled(valor);
        txtNomeEntr.setEnabled(valor);
        txtDataCadEntr.setEnabled(valor);
        txtTelefoneEntr.setEnabled(valor);
        jButtonCadastrar.setEnabled(valor);
        jRadioInativar.setEnabled(valor);

    }

    final void popularEntregadorModelo() {

        EntrB.setNome(txtNomeEntr.getText());
        EntrB.setDataCad(txtDataCadEntr.getText());
        EntrB.setTelefone(txtTelefoneEntr.getText());
        //EntrB.setSituacao(cklInativar.
    }

    final void limparCampos() {
        txtCodEntr.setText("");
        txtNomeEntr.setText("");
        txtDataCadEntr.setText("");
        txtTelefoneEntr.setText("");
        jtPesquisarFunc.setText("");
    }

    public void InativarFuncionario() {
        try {

            String SQLInsertion = "update entregador set nomeEnt = ?, dtCadEnt = ?, telEnt = ?,situacaoEnt = ?  where codEnt = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, txtNomeEntr.getText());
            pst.setString(2, txtDataCadEntr.getText());
            pst.setString(3, txtTelefoneEntr.getText());
            pst.setString(4, situacao);
            pst.setInt(5, Integer.parseInt(txtCodEntr.getText()));

            pst.execute();
            Conexao.getConnection().commit();
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do entregador!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }
public void preencherTabela(String pesquisa) {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Código", "Nome Entregador", "Telefone"};

        //String SQL = "select * from entregador where nomeEnt like '%" + pesquisa + "%' and situacaoEnt like 'Ativo'";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(pesquisa);
            ResultSet rs = pst.executeQuery();
            rs.next();
            do {
                dados.add(new Object[]{rs.getInt("codEnt"), rs.getString("nomeEnt"), rs.getString("telEnt")});
            } while (rs.next());

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao preencher Tabela", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableEntregador.setModel(modelo);
        jTableEntregador.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTableEntregador.getColumnModel().getColumn(0).setResizable(false);
        jTableEntregador.getColumnModel().getColumn(1).setPreferredWidth(400);
        jTableEntregador.getColumnModel().getColumn(1).setResizable(false);
        jTableEntregador.getColumnModel().getColumn(2).setPreferredWidth(165);
        jTableEntregador.getColumnModel().getColumn(2).setResizable(false);
        jTableEntregador.getTableHeader().setReorderingAllowed(false);
        jTableEntregador.setAutoResizeMode(jTableEntregador.AUTO_RESIZE_OFF);
        jTableEntregador.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
