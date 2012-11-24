/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

/**
 *
 * @author addiel
 */

@Named
@Stateless
@LocalBean
public class Acciones {
    
    @Inject
    private EntityManager em;
    
    public void add(Tienda producto){
        em.persist(producto);
    }
    
    public void update(Tienda producto){
        em.merge(producto);
    }
    
    public void delete(String producto){
        Tienda t = em.find(Tienda.class, producto);
        if( t != null){
            em.remove(t);
        }
    }
    
    public List<Tienda> buscaTodo(){
        return em.createQuery ("SELECT r  FROM Tienda r", Tienda.class).getResultList();
    }
}
