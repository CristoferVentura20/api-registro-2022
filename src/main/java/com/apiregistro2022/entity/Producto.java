
package com.apiregistro2022.entity;

//utilizamos un Loombok
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//utilizamos Loombok
@Builder // construccion
@NoArgsConstructor // metodo de construccion sin parametros
@AllArgsConstructor // metodo de construccion con parametros
@Data // metodo get y set
@Entity(name = "Producto")
@Table(name = "t_producto")

//para que sea una clase de Spring se tiene que serializar
public class Producto implements Serializable {
    
    @Id //definiendo la clave primaria
    @Column(name = "codpro")
    private long codigo;
    @Column(name = "nompro")
    private String nombre;
    @Column(name = "precpro")
    private double precioCompra;
    @Column(name = "prevpro")
    private double precioVenta;
    @Column(name = "canpro")
    private int cantidad;
    @Column(name = "estpro")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "codcat", nullable = false)
    private Categoria categoria;
    
}