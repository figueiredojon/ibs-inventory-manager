package projeto.entities;
import java.util.HashMap;

public class UserManager extends Usuario {
     private HashMap<String, Usuario> usuarios;

    public UserManager() {
        super();
        usuarios = new HashMap<>();
    }

    public UserManager(String usuario, String senha){
        super(usuario, senha);
    }

    public boolean register(String usuario, String senha) {
        if (usuarios.containsKey(usuario)) {
            return false;
        }
        usuarios.put(usuario, new Usuario(usuario, senha));
            return true;
    }

    public Usuario login(String usuario, String senha) {
        Usuario user = usuarios.get(usuario);
        if (user != null && user.getSenha().equals(senha)) {
            return user;
        }
            return null;
        }  

}
