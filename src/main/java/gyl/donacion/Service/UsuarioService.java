package gyl.donacion.Service;

import gyl.donacion.Repository.UsuarioRepository;
import gyl.donacion.entity.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    public Usuario create(Usuario usuario) throws Exception {
        if (usuario.getNombre().isEmpty()) {
            throw new Exception("el nombre no puede estar vacio");
        }
        if (usuario.getApellido().isEmpty()) {
            throw new Exception("el apellido no puede estar vacio");
        }

        if (usuario.getDireccion().isEmpty()) {
            throw new Exception("la direccion no puede estar vacia");
        }
        if (usuario.getDni().length() > 10) {
            throw new Exception("el dni no puede tener menos de 10 digitos");
        }

        if (usuario.getEmail().isEmpty()) {
            throw new Exception("el email no puede estar vacio");
        }
        if (usuario.getDireccion().isEmpty()) {
            throw new Exception("la direccion no puede estar vacia");
        }
        
        if (usuario.getCiudad().isEmpty()) {
            throw new Exception("la ciudad no puede estar vacia");
        }
         
          if (usuario.getProvincia().isEmpty()) {
            throw new Exception("la provincia no puede estar vacia");
        }
          
           if (usuario.getCp().isEmpty()) {
            throw new Exception("el codigo postal no puede estar vacio");
        }

        return usuarioRepo.save(usuario);
    }

    public void delete(String id) {
        Optional<Usuario> respuesta = usuarioRepo.findById(id);
        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();
            usuarioRepo.delete(usuario);

        } else {
            throw new Error("no existe el Donante");
        }
    }

    public Usuario update(Usuario usuario) {

        return usuarioRepo.save(usuario);
    }

    public List<Usuario> listAll() {

        return usuarioRepo.findAll();
    }

}
