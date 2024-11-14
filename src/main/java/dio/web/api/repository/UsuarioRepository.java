package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("SAVE - recebendo usuario na camada de repositório");
        else
            System.out.println("UPDATE - recebendo usuario na camada de repositório");
        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELET/id -recebendo o id: %d para exclusão"+ id));
        System.out.println(id);
    }
    public List<Usuario> findAll() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));
        return usuarios;
    }
    public Usuario finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gleyson","password");
    }
    public Usuario finByUserName(String usarname){
        System.out.println(String.format("FIND/usarname - Recebendo o usarname: %s para localizar um usuário", usarname));
        return new Usuario("gleyson","password");
    }
}
