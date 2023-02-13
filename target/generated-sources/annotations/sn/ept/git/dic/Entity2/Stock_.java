package sn.ept.git.dic.Entity2;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic.Entity2.Produit;
import sn.ept.git.dic.Entity2.StockPK;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-13T01:03:03", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Stock.class)
public class Stock_ { 

    public static volatile SingularAttribute<Stock, Produit> produit;
    public static volatile SingularAttribute<Stock, StockPK> stockPK;
    public static volatile SingularAttribute<Stock, Integer> quantite;

}