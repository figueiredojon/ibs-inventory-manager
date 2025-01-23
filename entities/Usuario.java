package projeto.entities;

public class Usuario {
    protected String usuario;
    protected String senha;

    public Usuario(){

    }

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
}

