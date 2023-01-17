package gyl.donacion.Service;

import gyl.donacion.Repository.DonanteRepository;
import gyl.donacion.entity.Donante;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonanteService {

    @Autowired
    private DonanteRepository donanteRepo;

    public Donante create(Donante donante) throws Exception {

        if (donante.getNombre().isEmpty()) {
            throw new Exception("el nombre no puede estar vacio");
        }
        if (donante.getApellido().isEmpty()) {
            throw new Exception("el apellido no puede estar vacio");
        }

        if (donante.getDireccion().isEmpty()) {
            throw new Exception("la direccion no puede estar vacia");
        }
        if (donante.getDni().length() > 10) {
            throw new Exception("el dni no puede tener menos de 10 digitos");
        }

        if (donante.getEmail().isEmpty()) {
            throw new Exception("el email no puede estar vacio");
        }
        if (donante.getDireccion().isEmpty()) {
            throw new Exception("la direccion no puede estar vacia");
        }
        
         if (donante.getCiudad().isEmpty()) {
            throw new Exception("la ciudad no puede estar vacia");
        }
         
          if (donante.getProvincia().isEmpty()) {
            throw new Exception("la provincia no puede estar vacia");
        }
          
           if (donante.getCp().isEmpty()) {
            throw new Exception("el codigo postal no puede estar vacio");
        }

        return donanteRepo.save(donante);
    }

    public void delete(String id) {
        Optional<Donante> respuesta = donanteRepo.findById(id);
        if (respuesta.isPresent()) {
            Donante donante = respuesta.get();
            donanteRepo.delete(donante);

        } else {
            throw new Error("no existe el Donante");
        }
    }

    public Donante update(Donante donante) {

        return donanteRepo.save(donante);
    }

    public List<Donante> listAll() {

        return donanteRepo.findAll();
    }
}
