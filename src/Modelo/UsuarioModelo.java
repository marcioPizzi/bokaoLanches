
package Modelo;

import java.util.Date;

/**
 *
 * @author bokao
 */
public class UsuarioModelo {
    
    private int codigo;
    private String nome;
    private String login;
    private String permissao;
    private String senha;
    private String dataCadastro;
    
    public UsuarioModelo(){
    
}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permisao) {
        this.permissao = permisao;
    }

   

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
    
    
}
