
package Utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Conexao {
    private final String URL = "jdbc:mysql://localhost:3306/bokaolanches2018";
    private final String Driver = "org.gjt.mm.mysql.Driver";
    private final String Usuario = "root";
    private final String Senha = "";
    private static Connection con;
    
    public Conexao(){
        try {
           con = DriverManager.getConnection(URL, Usuario, Senha);
           con.setAutoCommit(false);
           //JOptionPane.showMessageDialog(null, "Conectado com sucesso", "Conectado", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro", 0, new ImageIcon("imagens/btn_sair.png"));
            //JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco", "Erro:", 0);
        }
            
        
    }

    public static Connection getConnection(){
        if (con == null){
            new Conexao();
        }
     return con;   
    }
    
    public static void fecharConexao(){
       
        try {
            if (!con.isClosed()){
                con.close();
             }
        }catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    public static void main(String args[]){
    
        Conexao.getConnection();
}
}
