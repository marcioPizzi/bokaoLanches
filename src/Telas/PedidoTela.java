/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Controle.ClienteControle;
import Controle.PedidoControle;
import Controle.ProdutoControle;
import DAO.EntregadorDAO;
import DAO.PedidoDAO;
import Modelo.ClienteModelo;
import Modelo.PedidoModelo;
import Modelo.ProdutoModelo;
import Utilitarios.Conexao;
import Utilitarios.ModeloTabela;
import java.awt.GridLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class PedidoTela extends javax.swing.JFrame {

    MaskFormatter FormatoTel;

    ClienteModelo ClienteB;
    ClienteControle ClienteC;

    ClienteTela CliTela;

    List<String> ListaCliente;
    List<String> ListaProduto;
    List<String> ListaMotoboy;
    List<String> ListaItens;

    EntregadorDAO MotoboyD;

    DefaultTableModel modelo;

    PedidoDAO PedidoDAO;
    PedidoControle PedidoC;
    PedidoModelo PedidoB;

    ProdutoModelo ProdutoB;
    ProdutoControle ProdutoC;

    DecimalFormat FormatoDecimal;
    int CodigoFuncionario;

    Date DataAtual;
    SimpleDateFormat formatoData, formatoHora;

    public PedidoTela() {
        initComponents();
        FormatoTel = new MaskFormatter();

        ClienteB = new ClienteModelo();
        ClienteC = new ClienteControle();
        CliTela = new ClienteTela();

        ProdutoB = new ProdutoModelo();
        ProdutoC = new ProdutoControle();

        PedidoDAO = new PedidoDAO();
        PedidoC = new PedidoControle();
        PedidoB = new PedidoModelo();

        MotoboyD = new EntregadorDAO();

        ListaCliente = new ArrayList<>();
        ListaProduto = new ArrayList<>();
        ListaMotoboy = new ArrayList<>();
        ListaItens = new ArrayList<>();

        modelo = (DefaultTableModel) tabelaPedido.getModel();
        FormatoDecimal = new DecimalFormat("0.00");
        tabelaPedido.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        this.CodigoFuncionario = CodigoFuncionario;

        formatoData = new SimpleDateFormat("yyyy-MM-dd");
        formatoHora = new SimpleDateFormat("HH:mm:ss");

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        //jLabelData.setText(formatoData.format(DataAtual));
        //preencherTabela();
        jbuttonGravar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PainelCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodCLi = new javax.swing.JTextField();
        txtNomeCli = new javax.swing.JTextField();
        txtEndCli = new javax.swing.JTextField();
        txtBairroCli = new javax.swing.JTextField();
        txtnumeroEndCli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPesquisarCliente = new javax.swing.JTextField();
        try{
            FormatoTel = new MaskFormatter("####-####");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erro ao inserir campo personalizado", "Erro", 0);
        }
        txtTelResCli = new JFormattedTextField(FormatoTel);
        try{
            FormatoTel = new MaskFormatter("#####-####");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erro ao inserir campo personalizado", "Erro", 0);
        }
        txtTelCelCli = new JFormattedTextField(FormatoTel);
        cbCliente = new javax.swing.JComboBox<>();
        PainelPagto = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtTotalPedido = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cbFormaPagamento = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        txtValorPago = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();
        cbTaxa = new javax.swing.JComboBox<>();
        PainelProduto = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtPesquisarProduto = new javax.swing.JTextField();
        cbProduto = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtQtde = new javax.swing.JTextField();
        txtValorUnitario = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        txtObs = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        jRadioButton6 = new javax.swing.JRadioButton();
        PainelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPedido = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlDataAtual = new javax.swing.JLabel();
        PainelBotoes = new javax.swing.JPanel();
        jbuttonGravar = new javax.swing.JButton();
        jButtonTelaPedido = new javax.swing.JButton();
        jButtonCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabelData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        PainelCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setText("Endereço:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel5.setText("Bairro:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel6.setText("Número:");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel7.setText("Telefone Res.:");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel8.setText("Celular:");

        txtCodCLi.setEditable(false);
        txtCodCLi.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtCodCLi.setEnabled(false);

        txtNomeCli.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtNomeCli.setEnabled(false);
        txtNomeCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeCliKeyPressed(evt);
            }
        });

        txtEndCli.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtEndCli.setEnabled(false);
        txtEndCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEndCliKeyPressed(evt);
            }
        });

        txtBairroCli.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtBairroCli.setEnabled(false);
        txtBairroCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBairroCliKeyPressed(evt);
            }
        });

        txtnumeroEndCli.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtnumeroEndCli.setEnabled(false);
        txtnumeroEndCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnumeroEndCliKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setText("Pesquisar:");

        txtPesquisarCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarClienteActionPerformed(evt);
            }
        });
        txtPesquisarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarClienteKeyPressed(evt);
            }
        });

        txtTelResCli.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtTelResCli.setEnabled(false);
        txtTelResCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelResCliKeyPressed(evt);
            }
        });

        txtTelCelCli.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtTelCelCli.setEnabled(false);
        txtTelCelCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelCelCliKeyPressed(evt);
            }
        });

        cbCliente.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        cbCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbClienteFocusGained(evt);
            }
        });
        cbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClienteActionPerformed(evt);
            }
        });
        cbCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbClienteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PainelClienteLayout = new javax.swing.GroupLayout(PainelCliente);
        PainelCliente.setLayout(PainelClienteLayout);
        PainelClienteLayout.setHorizontalGroup(
            PainelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelClienteLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PainelClienteLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodCLi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelResCli, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelCelCli, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                    .addGroup(PainelClienteLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnumeroEndCli, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PainelClienteLayout.setVerticalGroup(
            PainelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PainelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(txtCodCLi)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtTelResCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelCelCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PainelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txtnumeroEndCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtBairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelPagto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Total Pedido:");

        txtTotalPedido.setEditable(false);
        txtTotalPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalPedido.setPreferredSize(new java.awt.Dimension(110, 25));
        txtTotalPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalPedidotxtTotalPedidoKeyReleased(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Taxa Entrega:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Forma Pgto:");

        cbFormaPagamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão" }));
        cbFormaPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbFormaPagamento.setPreferredSize(new java.awt.Dimension(130, 31));
        cbFormaPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbFormaPagamentocbFormaPagamentoMouseClicked(evt);
            }
        });
        cbFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFormaPagamentocbFormaPagamentoActionPerformed(evt);
            }
        });
        cbFormaPagamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbFormaPagamentocbFormaPagamentoKeyPressed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Valor Pago:");

        txtValorPago.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtValorPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtValorPago.setPreferredSize(new java.awt.Dimension(110, 25));
        txtValorPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorPagotxtValorPagoActionPerformed(evt);
            }
        });
        txtValorPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorPagotxtValorPagoKeyPressed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Troco:");

        txtTroco.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtTroco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTroco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTrocotxtTrocoKeyPressed(evt);
            }
        });

        cbTaxa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Taxa Balcão  = 0,00", "Taxa Bairro = 2,00", "Taxa Fora Bairro = 3,00" }));
        cbTaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTaxaActionPerformed(evt);
            }
        });
        cbTaxa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbTaxaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PainelPagtoLayout = new javax.swing.GroupLayout(PainelPagto);
        PainelPagto.setLayout(PainelPagtoLayout);
        PainelPagtoLayout.setHorizontalGroup(
            PainelPagtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPagtoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelPagtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPagtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PainelPagtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelPagtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PainelPagtoLayout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addGap(27, 27, 27)))
                            .addGroup(PainelPagtoLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(20, 20, 20)))
                        .addGroup(PainelPagtoLayout.createSequentialGroup()
                            .addComponent(jLabel26)
                            .addGap(10, 10, 10)))
                    .addGroup(PainelPagtoLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(17, 17, 17)))
                .addGroup(PainelPagtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtValorPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTroco)
                    .addComponent(cbTaxa, 0, 170, Short.MAX_VALUE)
                    .addComponent(cbFormaPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelPagtoLayout.setVerticalGroup(
            PainelPagtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPagtoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PainelPagtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelPagtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTaxa)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelPagtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelPagtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelPagtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PainelPagtoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbFormaPagamento, cbTaxa, txtTotalPedido, txtTroco, txtValorPago});

        PainelProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Pesquisar:");

        txtPesquisarProduto.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarProdutoActionPerformed(evt);
            }
        });
        txtPesquisarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarProdutoKeyPressed(evt);
            }
        });

        cbProduto.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        cbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdutoActionPerformed(evt);
            }
        });
        cbProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbProdutoKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setText("Selecione o produto");

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setText("Qtde");

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setText("Valor Unit:");

        txtQtde.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtQtde.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtQtde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdeActionPerformed(evt);
            }
        });
        txtQtde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtdeKeyPressed(evt);
            }
        });

        txtValorUnitario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtValorUnitario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioButton1.setText("Completo");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jRadioButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton1KeyPressed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioButton2.setText("Sem Mostarda");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jRadioButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton2KeyPressed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioButton3.setText("sem Ketchup");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jRadioButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton3KeyPressed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioButton4.setText("Sem Maionese");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jRadioButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton4KeyPressed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioButton5.setText("Seco");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jRadioButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton5KeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setText("OBS:");

        txtObs.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObsActionPerformed(evt);
            }
        });
        txtObs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtObsKeyPressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setText("Total");

        txtValorTotal.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtValorTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setText("Codigo");

        txtCodProd.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtCodProd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdActionPerformed(evt);
            }
        });
        txtCodProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodProdKeyPressed(evt);
            }
        });

        jRadioButton6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioButton6.setText("Só Maionese");
        jRadioButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton6KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PainelProdutoLayout = new javax.swing.GroupLayout(PainelProduto);
        PainelProduto.setLayout(PainelProdutoLayout);
        PainelProdutoLayout.setHorizontalGroup(
            PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutoLayout.createSequentialGroup()
                .addGroup(PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelProdutoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObs))
                    .addGroup(PainelProdutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14)
                            .addGroup(PainelProdutoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelProdutoLayout.setVerticalGroup(
            PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                    .addGroup(PainelProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorUnitario))
                    .addGroup(PainelProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtde))
                    .addGroup(PainelProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodProd))
                    .addGroup(PainelProdutoLayout.createSequentialGroup()
                        .addGroup(PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jLabel16)
                    .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        PainelTabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabelaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Qtde", "Preço Unit:", "Total", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPedido);

        javax.swing.GroupLayout PainelTabelaLayout = new javax.swing.GroupLayout(PainelTabela);
        PainelTabela.setLayout(PainelTabelaLayout);
        PainelTabelaLayout.setHorizontalGroup(
            PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        PainelTabelaLayout.setVerticalGroup(
            PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("TELA PEDIDOS DELIVERY");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("Data:");

        jlDataAtual.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N

        PainelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbuttonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/btn_SAlvar.png"))); // NOI18N
        jbuttonGravar.setToolTipText("SALVAR PEDIDO");
        jbuttonGravar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuttonGravar.setMaximumSize(new java.awt.Dimension(32, 32));
        jbuttonGravar.setMinimumSize(new java.awt.Dimension(48, 48));
        jbuttonGravar.setPreferredSize(new java.awt.Dimension(90, 70));
        jbuttonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonGravarActionPerformed(evt);
            }
        });
        jbuttonGravar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbuttonGravarKeyPressed(evt);
            }
        });

        jButtonTelaPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ico_tela.png"))); // NOI18N
        jButtonTelaPedido.setToolTipText("PEDIDOS");
        jButtonTelaPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTelaPedido.setPreferredSize(new java.awt.Dimension(90, 70));
        jButtonTelaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTelaPedidoActionPerformed(evt);
            }
        });

        jButtonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/btn_clientes.png"))); // NOI18N
        jButtonCliente.setToolTipText("CLIENTE");
        jButtonCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/table64.png"))); // NOI18N
        jButton1.setToolTipText("MESAS");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelBotoesLayout = new javax.swing.GroupLayout(PainelBotoes);
        PainelBotoes.setLayout(PainelBotoesLayout);
        PainelBotoesLayout.setHorizontalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jbuttonGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonTelaPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PainelBotoesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButtonCliente, jButtonTelaPedido, jbuttonGravar});

        PainelBotoesLayout.setVerticalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbuttonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTelaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCliente)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        PainelBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButtonCliente, jButtonTelaPedido, jbuttonGravar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(PainelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PainelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PainelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PainelPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlDataAtual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PainelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PainelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PainelPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1318, 681));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeCliKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtEndCli.requestFocus();
        }
    }//GEN-LAST:event_txtNomeCliKeyPressed

    private void txtEndCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEndCliKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtnumeroEndCli.requestFocus();
        }
    }//GEN-LAST:event_txtEndCliKeyPressed

    private void txtBairroCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroCliKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtTelResCli.requestFocus();
        }
    }//GEN-LAST:event_txtBairroCliKeyPressed

    private void txtnumeroEndCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroEndCliKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtBairroCli.requestFocus();
        }
    }//GEN-LAST:event_txtnumeroEndCliKeyPressed

    private void txtTelResCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelResCliKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtTelCelCli.requestFocus();
        }
    }//GEN-LAST:event_txtTelResCliKeyPressed

    private void txtTelCelCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelCelCliKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            //jButtonCadastrar.requestFocus();
        }
    }//GEN-LAST:event_txtTelCelCliKeyPressed

    private void txtPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarClienteActionPerformed


    }//GEN-LAST:event_txtPesquisarClienteActionPerformed

    private void txtPesquisarClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarClienteKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            //cbCliente.requestFocus();
            if (txtPesquisarCliente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Insira um telefone para pesquisa!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
                txtPesquisarCliente.requestFocus();
            } else {
                cbCliente.removeAllItems();
                ListaCliente.clear();
                ClienteC.controlePesquisaCliente(txtPesquisarCliente.getText(), ListaCliente);
                for (String i : ListaCliente) {
                    cbCliente.addItem(i);

                }
                cbCliente.requestFocus();
            }

        }

        if (evt.getKeyCode() == evt.VK_ESCAPE) {
            limparCamposCliente();
            txtPesquisarCliente.requestFocus();
        }
        if (evt.getKeyCode() == evt.VK_F4) {
            dispose();
        }
        if (evt.getKeyCode() == evt.VK_F11) {
            TelaPedidos telaPed = new TelaPedidos();
            telaPed.setVisible(true);
        }
    }//GEN-LAST:event_txtPesquisarClienteKeyPressed

    private void cbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdutoActionPerformed
        if (!(cbProduto.getSelectedItem() == null)) {
            txtValorUnitario.setText(PedidoC.controleValor(cbProduto.getSelectedItem().toString()) + "");
            txtCodProd.setText(PedidoC.controleCodigo(cbProduto.getSelectedItem().toString()) + "");
        }
    }//GEN-LAST:event_cbProdutoActionPerformed

    private void cbProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbProdutoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtQtde.requestFocus();
        }
    }//GEN-LAST:event_cbProdutoKeyPressed

    private void txtPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarProdutoActionPerformed
        if (cbProduto.getSelectedItem() == "") {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Produto", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            txtCodProd.requestFocus();
        }
        /*if (cbProduto.getSelectedItem() == null){
            JOptionPane.showConfirmDialog(rootPane, "Produto não encontrado. deseja Cadastrar??", 3, JOptionPane.YES_OPTION);
        }*/

    }//GEN-LAST:event_txtPesquisarProdutoActionPerformed

    private void txtPesquisarProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarProdutoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {

            cbProduto.removeAllItems();
            ListaProduto.clear();
            ProdutoC.ControleItens(txtPesquisarProduto.getText().toString(), ListaProduto);
            for (String i : ListaProduto) {
                cbProduto.addItem(i);
                cbProduto.requestFocus();
            }
            cbProduto.requestFocus();

        }
        if (evt.getKeyCode() == evt.VK_F7) {
            cbTaxa.requestFocus();
        }
        if (evt.getKeyCode() == evt.VK_ESCAPE) {
            limparCamposProduto();
            txtCodProd.requestFocus();
        }

    }//GEN-LAST:event_txtPesquisarProdutoKeyPressed

    private void cbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClienteActionPerformed

        if (!(cbCliente.getSelectedItem() == null)) {
            String Cod = cbCliente.getSelectedItem().toString();
            Cod = Cod.substring(0, Cod.indexOf(" "));
            ClienteB = ClienteC.ControlePreencherCamposClientePedido(Integer.parseInt(Cod));
            txtCodCLi.setText(ClienteB.getCodigo() + "");
            txtNomeCli.setText(ClienteB.getNome());
            txtEndCli.setText(ClienteB.getEndereco());
            txtnumeroEndCli.setText(ClienteB.getNumero());
            txtBairroCli.setText(ClienteB.getBairro());
            txtTelResCli.setText(ClienteB.getTelefoneResidencial());
            txtTelCelCli.setText(ClienteB.getTelefoneCelular());
            txtCodCLi.setEnabled(true);
            txtNomeCli.setEnabled(true);
            txtEndCli.setEnabled(true);
            txtnumeroEndCli.setEnabled(true);
            txtTelCelCli.setEnabled(true);
            txtTelResCli.setEnabled(true);
            txtBairroCli.setEnabled(true);
            //jlDataAtual.setText(Data);
        }

    }//GEN-LAST:event_cbClienteActionPerformed

    private void cbClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbClienteKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtCodProd.requestFocus();
        }
        if (evt.getKeyCode() == evt.VK_ESCAPE) {
            limparCamposCliente();
            txtPesquisarCliente.requestFocus();
        }
        if (evt.getKeyCode() == evt.VK_F5) {
            ClienteTela CadDelivery = new ClienteTela();
            CadDelivery.setVisible(true);
            //PedidoTela pedTela = new PedidoTela();
            //pedTela.dispose();

        }

    }//GEN-LAST:event_cbClienteKeyPressed

    private void txtQtdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdeActionPerformed
        if (PedidoC.VerificarQtde(txtQtde.getText())) {
            jRadioButton1.requestFocus();
        } else {
            txtQtde.requestFocus();
        }
    }//GEN-LAST:event_txtQtdeActionPerformed

    private void txtQtdeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdeKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            double total = Integer.parseInt(txtQtde.getText()) * (Double.parseDouble(txtValorUnitario.getText()));
            txtValorTotal.setText(String.valueOf(total));
            txtPesquisarProduto.requestFocus();
        }
        if (evt.getKeyCode() == evt.VK_ESCAPE) {
            txtCodProd.setText("");
            cbProduto.removeAllItems();
            txtValorUnitario.setText("");

            txtCodProd.requestFocus();
        }
    }//GEN-LAST:event_txtQtdeKeyPressed

    private void jbuttonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonGravarActionPerformed

        if (txtValorPago.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os campos para Fechamento", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            cbFormaPagamento.requestFocus();
        } else {
            populaModelo();
            PedidoC.ControlePedido(txtCodCLi.getText(), CodigoFuncionario + "", txtTotalPedido.getText(), tabelaPedido.getRowCount(), PedidoB);
            limparCamposProduto();
            limparCamposCliente();
            txtPesquisarCliente.requestFocus();
            jbuttonGravar.setEnabled(false);
            txtValorPago.setEnabled(true);
        }
    }//GEN-LAST:event_jbuttonGravarActionPerformed

    private void jbuttonGravarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbuttonGravarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (txtValorPago.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha o campo 'Valor Pago'", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            } else {
                populaModelo();
                PedidoC.ControlePedido(txtCodCLi.getText(), CodigoFuncionario + "", txtTotalPedido.getText(), tabelaPedido.getRowCount(), PedidoB);
                limparCamposProduto();
                limparCamposCliente();
                txtPesquisarCliente.requestFocus();
                jbuttonGravar.setEnabled(false);
                txtValorPago.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jbuttonGravarKeyPressed

    private void jButtonTelaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTelaPedidoActionPerformed
        TelaPedidos telaPed = new TelaPedidos();
        telaPed.setVisible(true);
    }//GEN-LAST:event_jButtonTelaPedidoActionPerformed

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        ClienteTela CadDelivery = new ClienteTela();
        CadDelivery.setVisible(true);
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //MesasTela mesaT = new MesasTela();
        //mesaT.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTotalPedidotxtTotalPedidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPedidotxtTotalPedidoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPedidotxtTotalPedidoKeyReleased

    private void cbFormaPagamentocbFormaPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbFormaPagamentocbFormaPagamentoMouseClicked

    }//GEN-LAST:event_cbFormaPagamentocbFormaPagamentoMouseClicked

    private void cbFormaPagamentocbFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFormaPagamentocbFormaPagamentoActionPerformed
        if (cbFormaPagamento.getSelectedItem().equals("Dinheiro")) {
            txtTroco.setEnabled(true);
            txtValorPago.setEditable(true);
            txtValorPago.requestFocus();
        } else {
            txtTroco.setEnabled(false);
            txtValorPago.setEnabled(false);
            txtValorPago.setText(txtTotalPedido.getText());
            txtTroco.setText("0,00");
            jbuttonGravar.requestFocus();

        }
    }//GEN-LAST:event_cbFormaPagamentocbFormaPagamentoActionPerformed

    private void cbFormaPagamentocbFormaPagamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbFormaPagamentocbFormaPagamentoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (cbFormaPagamento.getSelectedItem().equals("Dinheiro")) {
                txtTroco.setEnabled(true);
                txtValorPago.setEditable(true);
                txtValorPago.requestFocus();
            } else {
                txtTroco.setEnabled(false);
                txtValorPago.setEnabled(false);
                txtValorPago.setText(txtTotalPedido.getText());
                txtTroco.setText("0.00");
                jbuttonGravar.requestFocus();

            }

        }


    }//GEN-LAST:event_cbFormaPagamentocbFormaPagamentoKeyPressed

    private void txtValorPagotxtValorPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorPagotxtValorPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorPagotxtValorPagoActionPerformed

    private void txtValorPagotxtValorPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorPagotxtValorPagoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            CalcularTroco();

        }
    }//GEN-LAST:event_txtValorPagotxtValorPagoKeyPressed

    private void txtTrocotxtTrocoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrocotxtTrocoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {

        }
    }//GEN-LAST:event_txtTrocotxtTrocoKeyPressed

    private void txtObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObsActionPerformed
        //double Total = txtQtde.getText() * txt
        //modelo.addRow(new Object[]{txtCodProd.getText(), cbProduto.getSelectedItem(), txtQtde.getText(), txtValorUnitario.getText(), txtObs.getText()});
        //limparCampos();

        //preencherTabela();
    }//GEN-LAST:event_txtObsActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (jRadioButton2.isSelected()) {
            txtObs.getText();
        } else {
            jRadioButton3.requestFocus();
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if (jRadioButton3.isSelected()) {
            txtObs.getText();
        } else {
            jRadioButton4.requestFocus();
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if (jRadioButton4.isSelected()) {
            txtObs.getText();
        } else {
            jRadioButton5.requestFocus();
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        if (jRadioButton5.isSelected()) {
            txtObs.getText();
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void txtObsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObsKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            //preencherTabela();
            //double total = Integer.parseInt(txtQtde.getText()) * (Double.parseDouble(txtValorUnitario.getText()));
            modelo.addRow(new Object[]{txtCodProd.getText(), cbProduto.getSelectedItem(), txtQtde.getText(), txtValorUnitario.getText(), txtValorTotal.getText(), txtObs.getText()});
            calcularPedido();
            limparCamposProduto();
            txtCodProd.requestFocus();
        }
    }//GEN-LAST:event_txtObsKeyPressed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()) {
            txtObs.requestFocus();
        } else {
            jRadioButton2.requestFocus();
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton1KeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (jRadioButton1.isSelected()) {
                txtObs.requestFocus();
            } else {
                jRadioButton2.requestFocus();
            }
        }
    }//GEN-LAST:event_jRadioButton1KeyPressed

    private void jRadioButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton2KeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (jRadioButton2.isSelected()) {
                txtObs.requestFocus();
            } else {
                jRadioButton3.requestFocus();
            }
        }
    }//GEN-LAST:event_jRadioButton2KeyPressed

    private void jRadioButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton3KeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (jRadioButton3.isSelected()) {
                txtObs.requestFocus();
            } else {
                jRadioButton4.requestFocus();
            }
        }
    }//GEN-LAST:event_jRadioButton3KeyPressed

    private void jRadioButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton4KeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (jRadioButton4.isSelected()) {
                txtObs.requestFocus();
            } else {
                jRadioButton5.requestFocus();
            }
        }
    }//GEN-LAST:event_jRadioButton4KeyPressed

    private void jRadioButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton5KeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (jRadioButton5.isSelected()) {
                txtObs.requestFocus();
            } else {
                jRadioButton6.requestFocus();
            }
        }
    }//GEN-LAST:event_jRadioButton5KeyPressed

    private void tabelaPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPedidoMouseClicked
        modelo.removeRow(tabelaPedido.getSelectedRow());
        calcularPedido();
    }//GEN-LAST:event_tabelaPedidoMouseClicked

    private void txtCodProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (txtCodProd.getText().equals("")) {
                txtPesquisarProduto.requestFocus();
            } else {
                cbProduto.removeAllItems();
                ListaItens.clear();
                PedidoC.ControleItensCodigo(txtCodProd.getText(), ListaItens);
                for (String i : ListaItens) {
                    cbProduto.addItem(i);
                    txtQtde.requestFocus();
                }
            }
        }
        if (evt.getKeyCode() == evt.VK_F7) {
            cbTaxa.requestFocus();
        }

    }//GEN-LAST:event_txtCodProdKeyPressed

    private void txtCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdActionPerformed
        if (txtCodProd.getText().equals("")) {
            txtPesquisarProduto.requestFocus();
        } else {
            cbProduto.removeAllItems();
            ListaItens.clear();
            PedidoC.ControleItensCodigo(txtCodProd.getText(), ListaItens);
            for (String i : ListaItens) {
                cbProduto.addItem(i);
                txtQtde.requestFocus();
            }
        }
    }//GEN-LAST:event_txtCodProdActionPerformed

    private void jRadioButton6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton6KeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtObs.requestFocus();
        }
    }//GEN-LAST:event_jRadioButton6KeyPressed

    private void cbTaxaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbTaxaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cbFormaPagamento.requestFocus();
        }
    }//GEN-LAST:event_cbTaxaKeyPressed

    private void cbTaxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTaxaActionPerformed
        cbFormaPagamento.requestFocus();
    }//GEN-LAST:event_cbTaxaActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        /*
            cbCliente.removeAllItems();
            ListaCliente.clear();
            ClienteC.controlePesquisaCliente(txtPesquisarCliente.getText(), ListaCliente);
            for (String i : ListaCliente) {
                cbCliente.addItem(i);
            }
            if (!(cbCliente.getSelectedItem() == null)) {
            String Cod = cbCliente.getSelectedItem().toString();
            Cod = Cod.substring(0, Cod.indexOf(" "));
            ClienteB = ClienteC.ControlePreencherCamposClientePedido(Integer.parseInt(Cod));
            txtCodCLi.setText(ClienteB.getCodigo() + "");
            txtNomeCli.setText(ClienteB.getNome());
            txtEndCli.setText(ClienteB.getEndereco());
            txtnumeroEndCli.setText(ClienteB.getNumero());
            txtBairroCli.setText(ClienteB.getBairro());
            txtTelResCli.setText(ClienteB.getTelefoneResidencial());
            txtTelCelCli.setText(ClienteB.getTelefoneCelular());
            }
         */
    }//GEN-LAST:event_formWindowGainedFocus

    private void cbClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbClienteFocusGained
        if (cbCliente.getSelectedItem() == null) {
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(this, "CLiente não cadastrado. Deseja Cadastrar agora?");
            if (resposta == JOptionPane.YES_OPTION) {
                txtPesquisarCliente.requestFocus();
                ClienteTela cliTela = new ClienteTela();
                cliTela.setVisible(true);
                //JOptionPane.showMessageDialog(null, "Cliente não cadastrado!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            }else{
                limparCamposCliente();
                txtPesquisarCliente.requestFocus();
            }

        }
    }//GEN-LAST:event_cbClienteFocusGained

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
            java.util.logging.Logger.getLogger(PedidoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JPanel PainelCliente;
    private javax.swing.JPanel PainelPagto;
    private javax.swing.JPanel PainelProduto;
    private javax.swing.JPanel PainelTabela;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbFormaPagamento;
    private javax.swing.JComboBox<String> cbProduto;
    private javax.swing.JComboBox<String> cbTaxa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonTelaPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbuttonGravar;
    private javax.swing.JLabel jlDataAtual;
    private javax.swing.JTable tabelaPedido;
    private javax.swing.JTextField txtBairroCli;
    private javax.swing.JTextField txtCodCLi;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtEndCli;
    private javax.swing.JTextField txtNomeCli;
    private javax.swing.JTextField txtObs;
    private javax.swing.JTextField txtPesquisarCliente;
    private javax.swing.JTextField txtPesquisarProduto;
    private javax.swing.JTextField txtQtde;
    private javax.swing.JTextField txtTelCelCli;
    private javax.swing.JTextField txtTelResCli;
    private javax.swing.JTextField txtTotalPedido;
    private javax.swing.JTextField txtTroco;
    private javax.swing.JTextField txtValorPago;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtValorUnitario;
    private javax.swing.JTextField txtnumeroEndCli;
    // End of variables declaration//GEN-END:variables

    final void limparCamposCliente() {
        txtPesquisarCliente.setText("");
        cbCliente.removeAllItems();
        txtCodCLi.setText("");
        txtNomeCli.setText("");
        txtEndCli.setText("");
        txtnumeroEndCli.setText("");
        txtBairroCli.setText("");
        txtTelCelCli.setText("");
        txtTelResCli.setText("");
        txtTotalPedido.setText("");
        txtValorPago.setText("");
        txtTroco.setText("");
        modelo.setNumRows(0);
        cbFormaPagamento.setSelectedIndex(0);
        cbTaxa.setSelectedIndex(0);

    }

    public void limparCamposProduto() {
        txtPesquisarProduto.setText("");
        cbProduto.removeAllItems();
        txtCodProd.setText("");
        txtQtde.setText("");
        txtValorUnitario.setText("");
        txtValorTotal.setText("");
        txtObs.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        jRadioButton6.setSelected(false);

    }

    public void calcularPedido() {
        double TotalPedido = 0;
        for (int i = 0; i < tabelaPedido.getRowCount(); i++) {
            TotalPedido += Double.parseDouble(modelo.getValueAt(i, 4).toString());

        }
        if (TotalPedido > 0.0) {
            jbuttonGravar.setEnabled(true);
        }
        txtTotalPedido.setText(FormatoDecimal.format(TotalPedido).replace('.', ','));
    }

    public boolean habilitarCamposCliente(boolean valor) {
        txtCodCLi.setVisible(valor);

        return valor;
    }

    final void populaModelo() {
        DataAtual = new Date();
        PedidoB.setCodCliPedido(Integer.parseInt(txtCodCLi.getText()));
        PedidoB.setCodFuncPedido(CodigoFuncionario);
        PedidoB.setCodEntrPedido(1);
        PedidoB.setDataPed(formatoData.format(DataAtual));
        PedidoB.setHoraPed(formatoHora.format(DataAtual));
        //PedidoB.setStatusPed("Pedido Aberto");
        PedidoB.setTotalPedido(Double.parseDouble(txtTotalPedido.getText().replace(',', '.')));
        for (int i = 0; i < tabelaPedido.getRowCount(); i++) {
            PedidoB.setCodProduto(Integer.parseInt(tabelaPedido.getValueAt(i, 0).toString()));
            PedidoB.setQtde(Integer.parseInt(tabelaPedido.getValueAt(i, 2).toString()));
        }
    }

    public void CalcularTroco() {
        double troco = (Double.parseDouble(txtValorPago.getText().replace(',', '.')) - Double.parseDouble(txtTotalPedido.getText().replace(',', '.')));
        //double total = Integer.parseInt(txtQtde.getText()) * (Double.parseDouble(txtValorUnitario.getText()));
        txtTroco.setText(FormatoDecimal.format(troco).replace('.', ','));
        jbuttonGravar.requestFocus();
    }

    /*public void preencherTabela() {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Código", "Produto", "Qtde", "Valor Unit:", "Valor Total", "Observação"};

        //String SQL = "select * from cliente where nomeCli like '%" + jtNomeCli.getText() + "%' and situacao like 'Ativo' order by endCli";
        /*try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();
            rs.next();
            do {
                dados.add(new Object[]{rs.getInt("codCli"), rs.getString("nomeCli"), rs.getString("endCli"), rs.getString("numeroEnd"), rs.getString("bairroCli"), rs.getString("telResCli"), rs.getString("telCelCli")});
            } while (rs.next());

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            //JOptionPane.showMessageDialog(null, "Erro ao preencher Tabela", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
        
        dados.add(new Object[]{txtCodProd.getText(), cbProduto.getSelectedItem(), txtQtde.getText(), txtValorUnitario.getText(), txtObs.getText()});
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        tabelaPedido.setModel(modelo);
        tabelaPedido.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabelaPedido.getColumnModel().getColumn(0).setResizable(false);
        tabelaPedido.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabelaPedido.getColumnModel().getColumn(1).setResizable(false);
        tabelaPedido.getColumnModel().getColumn(2).setPreferredWidth(60);
        tabelaPedido.getColumnModel().getColumn(2).setResizable(false);
        tabelaPedido.getColumnModel().getColumn(3).setPreferredWidth(80);
        tabelaPedido.getColumnModel().getColumn(3).setResizable(false);
        tabelaPedido.getColumnModel().getColumn(4).setPreferredWidth(160);
        tabelaPedido.getColumnModel().getColumn(4).setResizable(false);
        tabelaPedido.getColumnModel().getColumn(5).setPreferredWidth(73);
        tabelaPedido.getColumnModel().getColumn(5).setResizable(false);
        tabelaPedido.setAutoResizeMode(tabelaPedido.AUTO_RESIZE_OFF);
        tabelaPedido.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }*/
}
