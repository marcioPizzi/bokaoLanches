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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bokao
 */
public class TelaPedidosDAO {
    
    public TelaPedidosDAO(){
        
        
    }
    public void MostrarPedidos(DefaultTableModel modelo){
    try {
            String SQLPesquisa = "SELECT pedido.codPed, cliente.endCli, cliente.numeroEnd, pedido.horaPed, pedido.totalPed,pedido.statusPed, pedido.nomeMotoboy from cliente INNER JOIN pedido ON pedido.codCliPed = cliente.codCli WHERE pedido.statusPed != 'Finalizado'";
            //String SQLPesquisa = "select * from pedido where statusPed != 'Finalizado' order by horaPed asc limit 17";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLPesquisa);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getInt("codPed"),rs.getString("endCli"),rs.getString("numeroEnd"), rs.getString("horaPed"), rs.getDouble("totalPed"),rs.getString("statusPed"), rs.getString("nomeMotoboy")});
            }
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao Buscar Pedido", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }
       public void PreencherComboboxMotoboy(List<String> Lista){
              
        try {
            String pesquisa = "Select * from entregador ";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(pesquisa);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                Lista.add(rs.getString("nomeEnt"));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }
       
       public void AtualizarPedido(PedidoModelo PedidoB){
           
           String SQLUpdate = "update pedido set statusPed = ?, nomeMotoboy = ? where codPed = ?";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLUpdate);
            pst.setString(1, PedidoB.getStatusPed());
            pst.setString(2, PedidoB.getNomeMotoboy());
            pst.setInt(3, PedidoB.getCodPedido());
            pst.execute();
            Conexao.getConnection().commit();
             JOptionPane.showMessageDialog(null, "Pedido Alterado com sucesso!!", "Salvo", 1, new ImageIcon("imagens/ok.png"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
         
       }
       
    
    
}
