/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.PedidoDAO;
import Modelo.PedidoModelo;
import Telas.LoginTela;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcio
 */
public class PedidoControle {
    
    PedidoDAO PedidoD;
    
    public PedidoControle(){
        PedidoD = new PedidoDAO();
    }
    public void ControleItens(String Pesquisa, List<String>ListaItens){
        PedidoD.pesquisaItens(Pesquisa, ListaItens);
    }
    public void ControleItensCodigo(String Pesquisa, List<String>ListaItens){
        PedidoD.pesquisaProdutoPedidoTeste(Pesquisa, ListaItens);
    }
    public double controleValor(String Pesquisa){
        return PedidoD.valorItem(Pesquisa);
    }
    public int controleCodigo(String Pesquisa){
        return PedidoD.CodigoItem(Pesquisa);
    }
    public boolean VerificarQtde(String Qtde){
        if (Qtde.equals("") ){
            JOptionPane.showMessageDialog(null, "Insira a quantidade", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            return false;
        }
        if (Qtde.equals("0")){
            JOptionPane.showMessageDialog(null, "A quantidade não pode ser zero", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            return false;
        }
        return true;
    }
    public void ControlePedido(String codCliente, String CodEntregador, String Total,int TamanhoTabela, PedidoModelo PedidoB){
        PedidoD.CadastrarPedido(codCliente, CodEntregador, Total, TamanhoTabela, PedidoB);
    }
    
    
}
