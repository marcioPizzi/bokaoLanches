/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ClienteModelo;
import Utilitarios.Conexao;
import Utilitarios.Corretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bokao
 */
public class ClienteDAO {

    public ClienteDAO() {

    }

    public void cadastrarCliente(ClienteModelo Cliente) {

        try {
            //dataNascCli,
            String SQLInsertion = "insert into cliente (nomeCli, endCli,  numeroEnd, bairroCli, telResCli, telCelCli, situacaoCli) values (?,?,?,?,?,?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, Cliente.getNome());
            pst.setString(2, Cliente.getEndereco());
            pst.setString(3, Cliente.getNumero());
            pst.setString(4, Cliente.getBairro());
            pst.setString(5, Cliente.getTelefoneResidencial());
            pst.setString(6, Cliente.getTelefoneCelular());
            pst.setString(7, "Ativo");
            
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso!!", "Salvo", 1, new ImageIcon("imagens/ok.png"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            //JOptionPane.showMessageDialog(null, "Erro ao cadastrar Cliente!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }

    public String proximoCliente() {
        String SQLSelection = "select * from cliente order by codCli desc";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("codCli")) + 1 + "");
            } else {
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir código", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            return "0";
        }
    }

    public void buscarCliente(String Pesquisa, DefaultTableModel modelo) {
        //rs.getString("dataNascCli"),
        try {
            String SQLSelection = "select * from cliente where nomeCli like '%" + Pesquisa + "%' and situacaoCli = 'Ativo'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("codCli"), rs.getString("nomeCli"),  rs.getString("endCli"), rs.getString("numeroEnd"),rs.getString("bairroCli"), rs.getString("telResCli"), rs.getString("telCelCli")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Cliente", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }

    public void buscarClientePedido(String Pesquisa, List<String> Lista) {

        try {
            String SQLSelection = "select * from cliente where telResCli like '%" + Pesquisa + "%' and situacaoCli like 'Ativo' or telCeLCli like '%" + Pesquisa + "%' and situacaoCli like 'Ativo'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Lista.add(rs.getString("codCli") + " -- " + rs.getString("endCli") + ", " + rs.getString("numeroEnd") +  "  --  " + "Res:" + "    " + rs.getString("telResCli")+ "  --  " + "Celular:" + "   " + rs.getString("telCelCli"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Cliente", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }

    }

    public ClienteModelo preencherCampos(String nomeCliente) {
        ClienteModelo ClienteB = new ClienteModelo();
        String SQLSelection = "select * from cliente where endCli ='" + nomeCliente + "'";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            //pst.setInt(1, codigo);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                ClienteB.setCodigo(rs.getInt("codCli"));
                ClienteB.setNome(rs.getString("nomeCli"));
                //ClienteB.setDataNascimento(rs.getString(Corretores.ConverterParaJava("dataNascCli")));
                ClienteB.setEndereco(rs.getString("endCli"));
                ClienteB.setNumero(rs.getString("numeroEnd"));
                ClienteB.setBairro(rs.getString("bairroCli"));                
                ClienteB.setTelefoneResidencial(rs.getString("telResCli"));
                ClienteB.setTelefoneCelular(rs.getString("telCelCli"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher campos", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
        return ClienteB;
    }
    public ClienteModelo preencherCamposClientePedido(int codigo) {
        ClienteModelo ClienteB = new ClienteModelo();
        String SQLSelection = "select * from cliente where codCli = ?  and situacaoCli like 'Ativo'";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            pst.setInt(1, codigo);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                ClienteB.setCodigo(rs.getInt("codCli"));
                ClienteB.setNome(rs.getString("nomeCli"));
                ClienteB.setEndereco(rs.getString("endCli"));
                ClienteB.setNumero(rs.getString("numeroEnd"));
                ClienteB.setBairro(rs.getString("bairroCli"));                
                ClienteB.setTelefoneResidencial(rs.getString("telResCli"));
                ClienteB.setTelefoneCelular(rs.getString("telCelCli"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher campos", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
        return ClienteB;
    }

    public void editarCliente(ClienteModelo Cliente) {
        try {
            /*dataNascCli = ?*/
            String SQLInsertion = "update cliente set nomeCli = ?, endCli = ?, numeroEnd = ?, bairroCli = ?,  telResCli = ?, telCelCli = ? where codCli = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, Cliente.getNome());
            //pst.setString(2, Cliente.getDataNascimento());
            pst.setString(2, Cliente.getEndereco());
            pst.setString(3, Cliente.getNumero());
            pst.setString(4, Cliente.getBairro());            
            pst.setString(5, Cliente.getTelefoneResidencial());
            pst.setString(6, Cliente.getTelefoneCelular());
            pst.setInt(7, Cliente.getCodigo());

            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Cliente Alterado com sucesso!!", "Salvo", 1, new ImageIcon("imagens/ok.png"));
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do Cliente!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }

}
