


package Controle;


import Modelo.UsuarioModelo;
import DAO.FuncionarioDAO;
import DAO.UsuarioDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class UsuarioControle {
    
     UsuarioDAO UsuarioD;
     
     public UsuarioControle(){
         UsuarioD = new UsuarioDAO();
     }
     
     public boolean verificardados(UsuarioModelo usuario){
         if (usuario.getNome().equals("")) {
             JOptionPane.showMessageDialog(null, "Preencha o campo nome", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
         if (usuario.getDataCadastro().equals("  /  /    ")) {
             JOptionPane.showMessageDialog(null, "Preencha o campo data de Cadastro", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
         if (usuario.getPermissao().equals("Selecione a permissão")) {
             JOptionPane.showMessageDialog(null, "Escolha a permissão do usuario", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
             UsuarioD.cadastrarUsuario(usuario);
             return true;
     }
     
        public String ControleCodigo(){
            return UsuarioD.proximoUsuario();
        }
        
        public void controlePesquisa(String Pesquisa, DefaultTableModel modelo){
            UsuarioD.buscarUsuario(Pesquisa, modelo);
        }
        public UsuarioModelo ControlePreencherCampos(String nomeUsuario){
            return UsuarioD.preencherCampos(nomeUsuario);
        }
        public boolean verificardadosEditar(UsuarioModelo usuario){
         if (usuario.getNome().equals("")) {
             JOptionPane.showMessageDialog(null, "Preencha o campo nome", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
         if (usuario.getDataCadastro().equals("  /  /    ")) {
             JOptionPane.showMessageDialog(null, "Preencha o campo data de cadastro", "Erro", 0, new ImageIcon("imagens/btn_sair"));
             return false;
         }
         UsuarioD.editarUsuario(usuario);
             return true;
}
}
