/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.EntregadorModelo;
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
public class EntregadorDAO {

    public EntregadorDAO() {

    }

    public void cadastrarEntregador(EntregadorModelo Motoboy) {

        try {

            String SQLInsertion = "insert into entregador (nomeEnt, dtCadEnt,telEnt, situacaoEnt) values (?,?,?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, Motoboy.getNome());
            pst.setString(2, Corretores.ConverterParaSQL(Motoboy.getDataCad()));
            pst.setString(3, Motoboy.getTelefone());
            pst.setString(4, "Ativo");
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Entregador cadastrado com sucesso!!", "Salvo", 1, new ImageIcon("imagens/ok.png"));
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Entregador!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }

    public String proximoFuncionario() {
        String SQLSelection = "select * from entregador order by codEnt desc limit 1";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("codEnt")) + 1 + "");
            } else {
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir código", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            return "0";
        }
    }

    public EntregadorModelo preencherCampos(String nomeEntregador) {
        EntregadorModelo Motoboy = new EntregadorModelo();
        String SQLSelection = "select * from entregador where nomeEnt ='"+nomeEntregador+"' and situacaoEnt like 'Ativo'";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            //pst.setInt(1, nomeEntregador);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Motoboy.setCodigo(rs.getInt("codEnt"));
                Motoboy.setNome(rs.getString("nomeEnt"));
                Motoboy.setDataCad(Corretores.ConverterParaJava(rs.getString("dtCadEnt")));
                Motoboy.setTelefone(rs.getString("telEnt"));
                Motoboy.setSituacao("situacaoEnt");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher campos", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
        return Motoboy;
    }

    public void editarEntregador(EntregadorModelo Motoboy) {
        try {

            String SQLInsertion = "update entregador set nomeEnt = ?, dtCadEnt = ?,  telEnt = ? where codEnt = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, Motoboy.getNome());
            pst.setString(2, Motoboy.getDataCad());
            pst.setString(3, Motoboy.getTelefone());
            pst.setInt(4, Motoboy.getCodigo());

            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Entregador alterado com sucesso!!", "Salvo", 1, new ImageIcon("imagens/ok.png"));
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do entregador!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }
    
    public void buscarEntregador(List<String> ListaMotoboy) {

        try {
            String SQLSelection = "select * from entregador where situacaoEnt like 'Ativo'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ListaMotoboy.add(rs.getString("nomeEnt"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Entregador", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }

    }

    

}
