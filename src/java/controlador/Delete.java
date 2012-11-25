/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author addiel
 */

@Named("ctrlDelete")
@Model
public class Delete implements Serializable{
    
    @Inject
    private Tienda modelo;
    @Inject
    private Acciones info;

    public Tienda getModelo() {
        return modelo;
    }
    
    public String detalle(Tienda producto){
        this.modelo = producto;
        return "delete";
    }

    public String delete(){
      info.delete(modelo.getProducto());
      return "index?faces-redirect=true";
    }

    public void setInfo(Acciones info) {
        this.info = info;
    }

    public void setModelo(Tienda modelo) {
        this.modelo = modelo;
    }
    
    
    
}
