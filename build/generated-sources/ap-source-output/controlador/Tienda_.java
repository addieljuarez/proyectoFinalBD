package controlador;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-23T16:51:33")
@StaticMetamodel(Tienda.class)
public class Tienda_ { 

    public static volatile SingularAttribute<Tienda, String> urlImagen;
    public static volatile SingularAttribute<Tienda, BigDecimal> precio;
    public static volatile SingularAttribute<Tienda, Date> fecha;
    public static volatile SingularAttribute<Tienda, String> descripcion;
    public static volatile SingularAttribute<Tienda, String> producto;

}