/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author addiel
 */
@Named("cCapturar")
@Model
public class Capturar implements Serializable{
    
    @Inject
    private Tienda modelo;
    
    @Inject
    private Acciones info;
    
    public void add (){
        info.add(modelo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Producto Agregado"));
    }

    public Tienda getModelo() {
        return modelo;
    }
    
}
