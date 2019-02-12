package Controle;

import Modelo.ProdutoModelo;
import DAO.ProdutoDAO;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProdutoControle {

    ProdutoDAO prodD;

    public ProdutoControle() {
        prodD = new ProdutoDAO();
    }

    public boolean verificardados(ProdutoModelo prod) {
        if (prod.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo descrição", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        if (prod.getTipo().equals("selecione um tipo de produto")) {
            JOptionPane.showMessageDialog(null, "Escolha o tipo de produto", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        if (prod.getPrecoCusto() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o valor de custo", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        if (prod.getPrecoVenda() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o valor de venda", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        prodD.cadastrarProduto(prod);
        return true;
    }

    public String ControleCodigo() {
        return prodD.proximoProduto();
    }

    public ProdutoModelo ControlePreencherCampos(String codProd) {
        return prodD.preencherCampos(codProd);
    }
    public ProdutoModelo ControlePreencherCamposPedido(String codProd) {
        return prodD.preencherCamposProdutoPedido(codProd);
    }

    public boolean verificardadosEditar(ProdutoModelo prod) {
        if (prod.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo descrição", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        if (prod.getTipo().equals("selecione um tipo de produto")) {
            JOptionPane.showMessageDialog(null, "Escolha o tipo de produto", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        if (prod.getPrecoCusto().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o valor de custo", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        if (prod.getPrecoVenda().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o valor de venda", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        prodD.editarProduto(prod);
        return true;
    }
    public void ControleItens(String Pesquisa, List<String>ListaItens){
        prodD.pesquisaProdutoPedido(Pesquisa, ListaItens);
    }
}
