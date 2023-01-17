package gyl.donacion.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class Donante {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idDonante;
    @NotBlank(message = "el nombre no puede estar vacio")
    private String nombre;
    @NotBlank(message = "el apellido no puede estar vacio")
    private String apellido;
    @NotBlank(message = "el dni no puede estar vacio")
    private String dni;
    @NotBlank(message = "la direccion no puede estar vacia")
    private String direccion;
    @NotBlank(message = "el email no puede estar vacio")
    private String email;
    @NotBlank(message = "la ciudad no puede estar vacia")
    private String ciudad;
    @NotBlank(message = "la provincia no puede estar vacia")
    private String provincia;
    @NotBlank(message = "el codigo postal no puede estar vacio")
    private String cp;
    
    @OneToMany(mappedBy = "donante")
    private List<Producto> productos;
    
}
