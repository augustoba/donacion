package gyl.donacion.Service;

import gyl.donacion.Repository.ProductoRepository;
import gyl.donacion.entity.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepo;
    
     public Producto create(Producto producto) throws Exception {
         if (producto.getNombre().isEmpty()) {
             throw new Exception("el nombre del producto no puede estar vacio");
         }
         
          if (producto.getDetalle().isEmpty()) {
             throw new Exception("el detalle del producto no puede estar vacio");
         }
          
          if (producto.getEstado().isEmpty()) {
             throw new Exception("el detalle del producto no puede estar vacio");
         }
          if (producto.getCantidad()>=0) {
             throw new Exception("la cantidad de productos no puede ser 0");
         }
          
          if (producto.getNombre().isEmpty()) {
             throw new Exception("el nombre del producto no puede estar vacio");
         }
          
          if (producto.getTipo().isEmpty()) {
             throw new Exception("el tipo de producto no puede estar vacio");
         }
          
          if (producto.getUrlImag1().isEmpty()) {
             throw new Exception("debe ingresar una foto");
         }
          producto.setDisponible(true);

        return productoRepo.save(producto);
    }

    public void delete(String id) {
        Optional<Producto> respuesta = productoRepo.findById(id);
        if (respuesta.isPresent()) {
            Producto producto = respuesta.get();
            productoRepo.delete(producto);

        } else {
            throw new Error("no existe el Producto");
        }
        
    }

    public Producto update(Producto producto) {

        return productoRepo.save(producto);
    }

    public List<Producto> listAll() {

        return productoRepo.findAll();
    }

}
