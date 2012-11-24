/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author addiel
 */
public class Conexiones {
    
    @Produces
    @PersistenceContext
    public EntityManager em;
    
}
