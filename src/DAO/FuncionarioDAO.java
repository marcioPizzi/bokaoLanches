/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.FuncionarioModelo;
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
public class FuncionarioDAO {
    
    
    
    public FuncionarioDAO(){
        
    }
    public void cadastrarFuncionario(FuncionarioModelo Func){
        
        try {
        
        String SQLInsertion = "insert into funcionario (nomeFunc, dtCadFunc,funcaoFunc, situacaoFunc) values (?,?,?,?)";
        PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
        pst.setString(1, Func.getNome());
        pst.setString(2, Corretores.ConverterParaSQL(Func.getDataCadastro()));
        pst.setString(3, Func.getFuncao());
        pst.setString(4, "Ativo");
        pst.execute();
        Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com sucesso!!", "Salvo", 1, new ImageIcon("imagens/ok.png"));
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Cliente!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }
    
    public String proximoFuncionario() {
        String SQLSelection = "select * from funcionario order by codFunc ";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return (Integer.parseInt(rs.getString("codFunc")) + 1 + "");
            }else{
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir código", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            return "0";
        }
    }
    public void buscarFuncionario(String Pesquisa, DefaultTableModel modelo){
        
        try {
            String SQLSelection = "select * from funcionario where nomeFunc like '%" + Pesquisa + "%' and situacaoFunc like 'Ativo'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("codFunc"),rs.getString("nomeFunc"),rs.getString("funcaoFunc"),Corretores.ConverterParaJava(rs.getString("dtCadFunc")),});
            }
            } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Buscar Funcionario", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }      
    }
    public FuncionarioModelo preencherCampos(String nomeFunc){
            FuncionarioModelo Func = new FuncionarioModelo();
            String SQLSelection = "select * from funcionario where nomeFunc ='" + nomeFunc + "' and situacaoFunc like 'Ativo'";
            try {
                PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
                //pst.setInt(1, codigo);
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    Func.setCodigo(rs.getInt("codFunc"));
                    Func.setNome(rs.getString("nomeFunc"));
                    Func.setDataCadastro(Corretores.ConverterParaJava(rs.getString("dtCadFunc")));
                    Func.setFuncao(rs.getString("funcaoFunc"));
                    
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao preencher campos", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            }
            return Func;
        }
    public void editarFuncionario(FuncionarioModelo Func){
            try {
        
        String SQLInsertion = "update Funcionario set nomeFunc = ?, dtCadFunc = ?, funcaoFunc = ? where codFunc = ?";
        PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
        pst.setString(1, Func.getNome());
        pst.setString(2, Func.getDataCadastro());
        pst.setString(3, Func.getFuncao());
        pst.setInt(4, Func.getCodigo());
                
        pst.execute();
        Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Funcionario Alterado com sucesso!!", "Salvo", 1, new ImageIcon("imagens/ok.png"));
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do Funcionario!!", "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
        }
    }
    
    }
