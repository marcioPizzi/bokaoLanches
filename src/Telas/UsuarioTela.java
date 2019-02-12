/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Modelo.FuncionarioModelo;
import Modelo.UsuarioModelo;
import Controle.FuncionarioControle;
import Controle.UsuarioControle;
import DAO.ClienteDAO;
import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author bokao
 */
public class UsuarioTela extends javax.swing.JFrame {

    MaskFormatter FormatoTel;
    SimpleDateFormat FormatoData;
    Date DataAtual;

    UsuarioControle UsuarioC;
    ClienteDAO ClienteD;
    DefaultTableModel modelo;
    UsuarioModelo UsuarioB;
    String situacao;

    public UsuarioTela() {
        initComponents();

        FormatoData = new SimpleDateFormat("dd/MM/yyyy");
        DataAtual = new Date();
        habilitarCampos(false);
        jtPesquisarFunc.requestFocus();
        UsuarioC = new UsuarioControle();
        ClienteD = new ClienteDAO();

        UsuarioB = new UsuarioModelo();

        modelo = (DefaultTableModel) jTableUsuario.getModel();

        
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
        txtCodUsu = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        jtPesquisarFunc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanelButton = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        txtDataCad = new javax.swing.JFormattedTextField();
        cbPermissao = new javax.swing.JComboBox<>();
        jRadioInativar = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();

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
        setTitle("Usuários");
        setResizable(false);

        jPanelCadCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Login:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Permissão:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Data cadastro:");

        txtCodUsu.setEditable(false);
        txtCodUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodUsu.setEnabled(false);

        txtLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLogin.setEnabled(false);

        jtPesquisarFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtPesquisarFuncMousePressed(evt);
            }
        });
        jtPesquisarFunc.addKeyListener(new java.awt.event.KeyAdapter() {
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
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

        try {
            txtDataCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataCad.setEnabled(false);

        cbPermissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a permissão", "Operador", "Usuario", "Administrador" }));
        cbPermissao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbPermissao.setEnabled(false);
        cbPermissao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbPermissaoKeyPressed(evt);
            }
        });

        jRadioInativar.setText("Inativar Usuário");
        jRadioInativar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioInativar.setEnabled(false);
        jRadioInativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioInativarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Senha:");

        txtSenha.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nome Usuário");

        txtNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNomeUsuario.setEnabled(false);

        javax.swing.GroupLayout jPanelCadCliLayout = new javax.swing.GroupLayout(jPanelCadCli);
        jPanelCadCli.setLayout(jPanelCadCliLayout);
        jPanelCadCliLayout.setHorizontalGroup(
            jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadCliLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPesquisarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioInativar))
                    .addGroup(jPanelCadCliLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPermissao, 0, 188, Short.MAX_VALUE))
                    .addGroup(jPanelCadCliLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeUsuario)))
                .addContainerGap())
        );
        jPanelCadCliLayout.setVerticalGroup(
            jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadCliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesquisarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jRadioInativar)
                    .addComponent(jLabel9)
                    .addComponent(txtDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("USUÁRIOS");

        jTableUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome Usuário", "Login", "Permissão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCadCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1)
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2743, 2743, 2743))
        );

        setSize(new java.awt.Dimension(610, 531));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        //flag = 1;
        limparCampos();
        DataAtual = new Date();
        txtDataCad.setText(FormatoData.format(DataAtual));
        habilitarCampos(true);
        jButtonCadastrar.setEnabled(true);
        UsuarioC.ControleCodigo();
        txtCodUsu.setText(UsuarioC.ControleCodigo());
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        txtNomeUsuario.requestFocus();
        jRadioInativar.setEnabled(false);


    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        popularUsuarioModelo();
        UsuarioC.verificardados(UsuarioB);
        limparCampos();
        jtPesquisarFunc.setEnabled(true);
        jButtonCadastrar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        txtLogin.setText("");
        txtDataCad.setText("");
        habilitarCampos(false);
        modelo.setNumRows(0);
        UsuarioC.controlePesquisa(jtPesquisarFunc.getText(), modelo);
        jButtonCancelar.setEnabled(false);


    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        try {
            String sql = "select * from usuario where loginUsu like '" + LoginTela.txtUsuario.getText() + "'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                if (rs.getString("permissaoUsu").equals("Administrador")) {
                    popularUsuarioModelo();
                    UsuarioC.verificardadosEditar(UsuarioB);
                    limparCampos();
                    modelo.setNumRows(0);
                    habilitarCampos(false);
                    jButtonNovo.setEnabled(true);
                    jButtonEditar.setEnabled(false);
                    jButtonCancelar.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Você não tem permissão para editar os campos!!\n Contate o administrador do sistema!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Você não tem permissão para editar os campos!!\n Contate o administrador do sistema!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }


    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limparCampos();
        txtDataCad.setText("");
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonCadastrar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        modelo.setNumRows(0);
        jtPesquisarFunc.requestFocus();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jtPesquisarFuncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisarFuncKeyReleased
        modelo.setNumRows(0);
        UsuarioC.controlePesquisa(jtPesquisarFunc.getText(), modelo);
    }//GEN-LAST:event_jtPesquisarFuncKeyReleased

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
        String nomeUsuario = "" + jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 1);
        UsuarioB = UsuarioC.ControlePreencherCampos(nomeUsuario);
        habilitarCampos(true);
        jRadioInativar.setEnabled(true);
        jButtonCadastrar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonNovo.setEnabled(false);

        txtCodUsu.setText(UsuarioB.getCodigo() + "");
        txtNomeUsuario.setText(UsuarioB.getNome());
        txtLogin.setText(UsuarioB.getLogin());
        txtDataCad.setText(UsuarioB.getDataCadastro());
        txtSenha.setText(UsuarioB.getSenha());
        cbPermissao.setSelectedItem(UsuarioB.getPermissao());
        jButtonCancelar.setEnabled(true);

    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void jtPesquisarFuncMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPesquisarFuncMousePressed
       

    }//GEN-LAST:event_jtPesquisarFuncMousePressed

    private void jRadioInativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInativarActionPerformed
        if (jRadioInativar.isSelected()) {
            situacao = "Inativo";
            InativarUsuario();
            //EntrC.InativarEntregador(jRadioInativar.setVisible(true));
            JOptionPane.showMessageDialog(null, "Usuário Inativado com sucesso!!", "Salvo", 1, new ImageIcon("imagens/ok.png"));
            limparCampos();
            jRadioInativar.setEnabled(false);
            modelo.setNumRows(0);
            jButtonEditar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioInativarActionPerformed

    private void cbPermissaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbPermissaoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (jButtonCadastrar.isEnabled()) {
                jButtonCadastrar.requestFocus();
            } else {
                jButtonEditar.requestFocus();
            }
        }
    }//GEN-LAST:event_cbPermissaoKeyPressed

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
            java.util.logging.Logger.getLogger(UsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new UsuarioTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbPermissao;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelButton;
    private javax.swing.JPanel jPanelCadCli;
    private javax.swing.JRadioButton jRadioInativar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jtPesquisarFunc;
    private javax.swing.JTextField txtCodUsu;
    private javax.swing.JFormattedTextField txtDataCad;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    final void habilitarCampos(boolean valor) {
        txtCodUsu.setEnabled(valor);
        txtNomeUsuario.setEnabled(valor);
        txtLogin.setEnabled(valor);
        cbPermissao.setEnabled(valor);
        txtDataCad.setEnabled(valor);
        jButtonCadastrar.setEnabled(valor);
        txtSenha.setEnabled(valor);
        jRadioInativar.setEnabled(valor);

    }

    final void popularUsuarioModelo() {
        UsuarioB.setNome(txtNomeUsuario.getText());
        UsuarioB.setLogin(txtLogin.getText());
        UsuarioB.setSenha(txtSenha.getText());
        UsuarioB.setPermissao(cbPermissao.getSelectedItem().toString());
        UsuarioB.setDataCadastro(txtDataCad.getText());
    }

    final void limparCampos() {
        txtCodUsu.setText("");
        txtNomeUsuario.setText("");
        txtSenha.setText("");
        txtLogin.setText("");
        cbPermissao.setSelectedIndex(0);
        txtDataCad.setText("");
        jtPesquisarFunc.setText("");
    }

    public void InativarUsuario() {
        try {

            String SQLInsertion = "update usuario set nomeUsu = ?, dataCadUsu = ?, permissaoUsu = ?,   loginUsu = ?, senhaUsu = ? where codUsu = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, txtNomeUsuario.getText());
            pst.setString(2, txtDataCad.getText());
            pst.setString(3, cbPermissao.getSelectedItem().toString());
            pst.setString(4, txtLogin.getText());
            pst.setString(5, txtSenha.getText());
            pst.setInt(6, Integer.parseInt(txtCodUsu.getText().toString()));

            pst.execute();
            Conexao.getConnection().commit();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            //JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do entregador!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }
}
