/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author addiel
 */

@Named("cConsulta")
@Model
public class Consulta {
    
    @Inject
    private Acciones info;
    
    public List<Tienda> buscaTodo(){
        return info.buscaTodo();
    }
    
}
