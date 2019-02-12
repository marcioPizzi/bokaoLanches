


package Controle;

import Modelo.EntregadorModelo;
import DAO.EntregadorDAO;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class EntregadorControle {
    
     EntregadorDAO MotoboyD;
     
     public EntregadorControle(){
         MotoboyD = new EntregadorDAO();
     }
     
     public boolean verificardados(EntregadorModelo Motoboy){
         if (Motoboy.getNome().equals("")) {
             JOptionPane.showMessageDialog(null, "Preencha o campo nome", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
         if (Motoboy.getDataCad().equals("  /  /    ")) {
             JOptionPane.showMessageDialog(null, "Preencha o campo data de Cadastro", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
         if (Motoboy.getTelefone().equals("Selecione a Função")) {
             JOptionPane.showMessageDialog(null, "Escolha a função do funcionário", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
             MotoboyD.cadastrarEntregador(Motoboy);
             return true;
     }
     
        public String ControleCodigo(){
            return MotoboyD.proximoFuncionario();
        }
        
       
        public EntregadorModelo ControlePreencherCampos(String nomeEntregador){
            return MotoboyD.preencherCampos(nomeEntregador);
        }
        public boolean verificardadosEditar(EntregadorModelo Motoboy){
         if (Motoboy.getNome().equals("")) {
             JOptionPane.showMessageDialog(null, "Preencha o campo nome", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
          if (Motoboy.getTelefone().equals("")) {
             JOptionPane.showMessageDialog(null, "Preencha o campo telefone", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
        MotoboyD.editarEntregador(Motoboy);
             return true;
}
        public boolean InativarEntregador(EntregadorModelo Motoboy){
            MotoboyD.editarEntregador(Motoboy);
             return true;
        }
        public void controlePesquisaEntregador(List<String> ListaMotoboy) {
        MotoboyD.buscarEntregador(ListaMotoboy);
    }
}
