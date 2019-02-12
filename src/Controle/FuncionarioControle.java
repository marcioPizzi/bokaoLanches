


package Controle;

import Modelo.ClienteModelo;
import Modelo.FuncionarioModelo;
import DAO.ClienteDAO;
import DAO.FuncionarioDAO;
import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class FuncionarioControle {
    
     FuncionarioDAO FuncD;
     
     public FuncionarioControle(){
         FuncD = new FuncionarioDAO();
     }
     
     public boolean verificardados(FuncionarioModelo Func){
         if (Func.getNome().equals("")) {
             JOptionPane.showMessageDialog(null, "Preencha o campo nome", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
         if (Func.getDataCadastro().equals("  /  /    ")) {
             JOptionPane.showMessageDialog(null, "Preencha o campo data de Cadastro", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
         if (Func.getFuncao().equals("Selecione a Função")) {
             JOptionPane.showMessageDialog(null, "Escolha a função do funcionário", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
             FuncD.cadastrarFuncionario(Func);
             return true;
     }
     
        public String ControleCodigo(){
            return FuncD.proximoFuncionario();
        }
        
        public void controlePesquisa(String Pesquisa, DefaultTableModel modelo){
            FuncD.buscarFuncionario(Pesquisa, modelo);
        }
        public FuncionarioModelo ControlePreencherCampos(String nomeFunc){
            return FuncD.preencherCampos(nomeFunc);
        }
        public boolean verificardadosEditar(FuncionarioModelo Func){
         if (Func.getNome().equals("")) {
             JOptionPane.showMessageDialog(null, "Preencha o campo nome", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
         if (Func.getDataCadastro().equals("  /  /    ")) {
             JOptionPane.showMessageDialog(null, "Preencha o campo data de cadastro", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
         FuncD.editarFuncionario(Func);
             return true;
}
}
