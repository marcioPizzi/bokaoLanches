/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.TelaPedidosDAO;
import Modelo.PedidoModelo;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcio 
 */
public class TelaPedidosControle {
    
    TelaPedidosDAO TelaPD;
    
    public TelaPedidosControle(){
        TelaPD = new TelaPedidosDAO();
    }
    public void ControlePesquisa(DefaultTableModel modelo){
        TelaPD.MostrarPedidos(modelo);
    }
    public void ControlePreencherComboboxMotoboy(List<String> Lista){
        TelaPD.PreencherComboboxMotoboy(Lista);
    }
    public void ControleAtualizarPedido(PedidoModelo PedidoB ){
        TelaPD.AtualizarPedido(PedidoB);
        
    }
}
