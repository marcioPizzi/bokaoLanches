package Controle;

import Modelo.ClienteModelo;
import DAO.ClienteDAO;
import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClienteControle {

    ClienteDAO ClienteD;

    public ClienteControle() {
        ClienteD = new ClienteDAO();
    }

    public boolean verificardados(ClienteModelo Cliente) {
        if (Cliente.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        /*if (Cliente.getDataNascimento().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo data de nascimento", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }*/
        if (Cliente.getBairro().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo bairro", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        if (Cliente.getEndereco().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo endereço", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        if (Cliente.getNumero().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo número", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        if (Cliente.getTelefoneResidencial().equals("(  )     -    ") && (Cliente.getTelefoneCelular().equals("(  )     -    "))) {
            JOptionPane.showMessageDialog(null, "Preencha pelo menos 1 telefone", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        ClienteD.cadastrarCliente(Cliente);
        return true;
    }

    public String ControleCodigo() {
        return ClienteD.proximoCliente();
    }

    public void controlePesquisa(String Pesquisa, DefaultTableModel modelo) {
        ClienteD.buscarCliente(Pesquisa, modelo);
    }
    public void controlePesquisaCliente(String Pesquisa, List<String> Lista) {
        ClienteD.buscarClientePedido(Pesquisa, Lista);
    }

    public ClienteModelo ControlePreencherCampos(String nomeCliente) {
        return ClienteD.preencherCampos(nomeCliente);
    }
     public ClienteModelo ControlePreencherCamposClientePedido(int codigo) {
        return ClienteD.preencherCamposClientePedido(codigo);
    }
    
    

    public boolean verificardadosEditar(ClienteModelo Cliente) {
        if (Cliente.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        /*if (Cliente.getDataNascimento().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo data de nascimento", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }*/
        if (Cliente.getBairro().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo bairro", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        if (Cliente.getEndereco().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo endereço", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        if (Cliente.getNumero().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo número", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        if (Cliente.getTelefoneResidencial().equals("(  )     -    ") && (Cliente.getTelefoneCelular().equals("(  )     -    "))) {
            JOptionPane.showMessageDialog(null, "Preencha pelo menos 1 telefone", "Erro", 0, new ImageIcon("imagens/btn_sair"));
            return false;
        }
        ClienteD.editarCliente(Cliente);
        return true;
    }
}
