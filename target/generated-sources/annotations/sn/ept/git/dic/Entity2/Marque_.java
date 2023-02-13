package sn.ept.git.dic.Entity2;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic.Entity2.Produit;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-13T01:03:03", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Marque.class)
public class Marque_ { 

    public static volatile CollectionAttribute<Marque, Produit> produitCollection;
    public static volatile SingularAttribute<Marque, Integer> id;
    public static volatile SingularAttribute<Marque, String> nom;

}