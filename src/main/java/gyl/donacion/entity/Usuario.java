package gyl.donacion.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idUser;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String email;
    private String ciudad;
    private String provincia;
    private String cp;
    

    @OneToOne
    private Producto producto;
    
}
