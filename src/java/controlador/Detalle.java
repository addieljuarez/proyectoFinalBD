/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author addiel
 */

@Named("ctrlDetalle")
@Model
public class Detalle {
    
    @Inject
    private Tienda producto;
    
    @Inject
    private Acciones info;

    public Tienda getProducto() {
        return producto;
    }
    
    public String detalle(Tienda producto){
        this.producto = producto;
        return "modifica";
    }
    
    public String add(){
        info.update(producto);
        return "index?faces-redirect=true";
    }
    
}
