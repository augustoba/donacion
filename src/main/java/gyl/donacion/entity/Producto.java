package gyl.donacion.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class Producto {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idProd;
    private String nombre;
    private String detalle;
    private String tipo;
    private Integer cantidad;
    private String estado;
    private String urlImag1;
    private String urlImag2;
    private String urlImag3;
    private String urlImag4;
    private Boolean disponible;
    
    @ManyToOne
    private Donante donante;
    
    @OneToOne
    private Usuario usuario;
       
    

}
