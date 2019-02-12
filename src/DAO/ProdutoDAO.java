/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ProdutoModelo;
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
public class ProdutoDAO {
    
    
    
    public ProdutoDAO(){
        
    }
    public void cadastrarProduto(ProdutoModelo prod){
        
        try {
        
        String SQLInsertion = "insert into produto (descricaoProd, tipoProd, precoCusto, precoVenda) values (?,?,?,?)";
        PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
        pst.setString(1, prod.getDescricao());
        pst.setString(2, (prod.getTipo()));
        pst.setDouble(3, prod.getPrecoCusto());
        pst.setDouble(4, prod.getPrecoVenda());
        
        pst.execute();
        Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso!!", "Salvo", 1, new ImageIcon("imagens/ok.png"));
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }
    
    public String proximoProduto() {
        String SQLSelection = "select * from produto order by codProd desc";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return (Integer.parseInt(rs.getString("codProd")) + 1 + "");
            }else{
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir código", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            return "0";
        }
    }
    
    public ProdutoModelo preencherCampos(String descricao){
            ProdutoModelo prod = new ProdutoModelo();
            String SQLSelection = "select * from produto where descricaoProd = ?";
            try {
                PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
                pst.setString(1, descricao);
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    prod.setCodigo(rs.getInt("codProd"));
                    prod.setDescricao(rs.getString("descricaoProd"));
                    prod.setTipo(rs.getString("tipoProd"));
                    prod.setPrecoCusto(rs.getDouble("precoCusto"));
                    prod.setPrecoVenda(rs.getDouble("precoVenda"));
                    
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao preencher campos", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            }
            return prod;
        }
    public void pesquisaProdutoPedido(String Pesquisa, List<String>ListaItens){
        try {
            String SQL = "SELECT * from produto WHERE descricaoProd like '%" + Pesquisa + "%'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQL);            
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                ListaItens.add(rs.getString("descricaoProd"));
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Buscar Produto", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
           //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }
        
    public ProdutoModelo preencherCamposProdutoPedido(String descricao){
            ProdutoModelo prod = new ProdutoModelo();
            String SQLSelection = "select * from produto where descricaoProd = ?";
            try {
                PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
                pst.setString(1, descricao);
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    prod.setCodigo(rs.getInt("codProd"));
                    prod.setDescricao(rs.getString("descricaoProd"));
                    //prod.setTipo(rs.getString("tipoProd"));
                    //prod.setPrecoCusto(rs.getDouble("precoCusto"));
                    prod.setPrecoVenda(rs.getDouble("precoVenda"));
                    
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao preencher campos", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            }
            return prod;
        }
    public void editarProduto(ProdutoModelo prod){
            try {
        
        String SQLInsertion = "update produto set descricaoProd = ?, tipoProd = ?, precoCusto = ?, precoVenda = ?  where codProd = ?";
        PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
        pst.setString(1, prod.getDescricao());
        pst.setString(2, prod.getTipo());
        pst.setDouble(3, prod.getPrecoCusto());
        pst.setDouble(4, prod.getPrecoVenda());
        pst.setInt(5, prod.getCodigo());
                
        pst.execute();
        Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Produto Alterado com sucesso!!", "Salvo", 1, new ImageIcon("imagens/ok.png"));
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do produto!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }
    
    }
