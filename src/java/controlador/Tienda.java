/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author addiel
 */

@Entity
public class Tienda implements Serializable{ 
    
    @Id
    private String producto;
    @NotNull
    private String descripcion;
    @NotNull
    private BigDecimal precio;
 
    
    private String clasificacion;
    private String imagen;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }
    
    
    
   

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

   
    
    
}
