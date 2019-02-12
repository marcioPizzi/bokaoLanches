/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.PedidoModelo;
import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcio
 */
public class PedidoDAO {
    public PedidoDAO() {
        
    }
    
    public void pesquisaItens(String Pesquisa, List<String>ListaItens){
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
    /*public void pesquisaItensCodigo(String Pesquisa, List<String>ListaItens){
        try {
            String SQL = "SELECT * from produto WHERE codProd = '%" + Pesquisa + "%'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQL);            
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                ListaItens.add(rs.getString("codProd"));
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Buscar Produto", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
           //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
        
    }*/
    public double valorItem(String Pesquisa){
        try {
            String SQL = "SELECT * from produto WHERE descricaoProd  = ? ";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQL);
            pst.setString(1, Pesquisa);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return rs.getDouble("precoVenda");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Buscar Produto", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
           //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
        return 0;
        
    }
    
    public int CodigoItem(String Pesquisa){
        try {
            String SQL = "SELECT * from produto WHERE descricaoProd  = ? ";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQL);
            pst.setString(1, Pesquisa);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return rs.getInt("codProd");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Buscar código", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
           //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
        return 0;
        
    }
    public void CadastrarPedido(String codCliente, String CodEntregador, String Total, int TamanhoTabela, PedidoModelo PedidoB){
        Date Data = new Date();
        SimpleDateFormat FormatoData = new SimpleDateFormat("yyy-MM-dd");
        SimpleDateFormat FormatoHora = new SimpleDateFormat("HH:mm:ss");
        
        
        
        try {
            String SQLInsertion = "INSERT INTO pedido(CodCliPed, CodFuncPed, codEntPed, statusPed, horaPed, dataPed, totalPed) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, codCliente);
            pst.setString(2, "1");
            pst.setString(3, CodEntregador);
            pst.setString(4, "Aberto");
            pst.setString(5, FormatoHora.format(Data));
            pst.setString(6, FormatoData.format(Data));
            pst.setString(7, Total.replace(',', '.'));
            
            pst.execute();
            CadastrarItens(codCliente, CodEntregador, CodigoPedido(), TamanhoTabela, PedidoB);
            CodigoPedido();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Pedido Salvo com sucesso!!", "Aviso", 1, new ImageIcon("imagens/btn_ok.png"));
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            //JOptionPane.showMessageDialog(null, "Erro ao registrar pedido", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }
    public String CodigoPedido(){
        String cod = "0";
        try{
            String SQLSelection = "select codPed from pedido order by codPed desc limit 1";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                cod = rs.getString("codPed");
                //JOptionPane.showMessageDialog(null, cod, "Aviso", 1, new ImageIcon("imagens/btn_ok.png"));                
            }            
        } catch (SQLException ex) {
           //JOptionPane.showMessageDialog(null, "Erro ao Buscar codigo", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
           //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
        return cod;
    }
    public void CadastrarItens(String CodigoCliente, String CodigoFuncionario, String codigoPedido, int TamanhoTabela, PedidoModelo PedidoB){
        for (int i =0; i < TamanhoTabela; i++){
            try {
                String SQL = "INSERT INTO item (codEntItem, codFuncItem, codCliItem, codPedItem, codProdItem, quantidadeItem) VALUES (?,?,?,?,?,?)";
                PreparedStatement pst = Conexao.getConnection().prepareStatement(SQL);
                pst.setString(1, "1");
                pst.setString(2, CodigoFuncionario);
                pst.setString(3, CodigoCliente);
                pst.setString(4, codigoPedido);
                pst.setInt(5, PedidoB.getCodProduto(i));
                pst.setInt(6, PedidoB.getQtde(i));
                //pst.setString(7, PedidoB.getStatusPed());
                
                pst.execute();      
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar itens", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
                //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            }
            
        }
    }
    public void pesquisaProdutoPedidoTeste(String Pesquisa, List<String>ListaItens){
        try {
            String SQL = "SELECT * from produto WHERE codProd like '%" + Pesquisa + "%'";
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
    
}
