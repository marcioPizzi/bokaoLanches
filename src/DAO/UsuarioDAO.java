/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.UsuarioModelo;
import Utilitarios.Conexao;
import Utilitarios.Corretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bokao
 */
public class UsuarioDAO {

    public UsuarioDAO() {

    }

    public void cadastrarUsuario(UsuarioModelo usuario) {

        try {

            String SQLInsertion = "insert into usuario (nomeUsu, dataCadUsu, permissaoUsu, loginUsu, senhaUsu, situacao) values (?,?,?,?,?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, usuario.getNome());
            pst.setString(2, Corretores.ConverterParaSQL(usuario.getDataCadastro()));
            pst.setString(3, usuario.getPermissao());
            pst.setString(4, usuario.getLogin());
            pst.setString(5, usuario.getSenha());
            pst.setString(6, "Ativo");
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado com sucesso!!", "Salvo", 1, new ImageIcon("imagens/ok.png"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            //JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuario!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }

    public String proximoUsuario() {
        String SQLSelection = "select * from usuario order by codUsu desc";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("codUsu")) + 1 + "");
            } else {
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir código", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            return "0";
        }
    }

    public void buscarUsuario(String Pesquisa, DefaultTableModel modelo) {

        try {
            String SQLSelection = "select * from usuario where nomeUsu like '%" + Pesquisa + "%' and situacao like 'Ativo'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("codUsu"), rs.getString("nomeUsu"), rs.getString("LoginUsu"), rs.getString("permissaoUsu")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            //JOptionPane.showMessageDialog(null, "Erro ao Buscar usuario", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }

    public UsuarioModelo preencherCampos(String nomeUsuario) {
        UsuarioModelo usuario = new UsuarioModelo();
        String SQLSelection = "select * from usuario where nomeUsu = ? and situacao like 'Ativo'";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            pst.setString(1, nomeUsuario);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                usuario.setCodigo(rs.getInt("codUsu"));
                usuario.setNome(rs.getString("nomeUsu"));
                usuario.setDataCadastro(Corretores.ConverterParaJava(rs.getString("dataCadUsu")));
                usuario.setPermissao(rs.getString("permissaoUsu"));
                usuario.setLogin(rs.getString("loginUsu"));
                usuario.setSenha(rs.getString("senhaUsu"));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher campos", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
        return usuario;
    }

    public void editarUsuario(UsuarioModelo usuario) {
        try {

            String SQLInsertion = "update usuario set nomeUsu = ?, dataCadUsu = ?, permissaoUsu = ?, loginUsu = ?, senhaUsu = ? where codUsu = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getDataCadastro());
            pst.setString(3, usuario.getPermissao());
            pst.setString(4, usuario.getLogin());
            pst.setString(5, usuario.getSenha());
            pst.setInt(6, usuario.getCodigo());

            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Usuario Alterado com sucesso!!", "Salvo", 1, new ImageIcon("imagens/ok.png"));
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do Funcionario!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }

}
