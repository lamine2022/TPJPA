package sn.ept.git.dic.Entity1;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic.Entity1.Commande;
import sn.ept.git.dic.Entity1.Employe;
import sn.ept.git.dic.Entity1.Magasin;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-13T01:03:03", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Employe.class)
public class Employe_ { 

    public static volatile SingularAttribute<Employe, Magasin> magasinId;
    public static volatile SingularAttribute<Employe, String> telephone;
    public static volatile SingularAttribute<Employe, Short> actif;
    public static volatile SingularAttribute<Employe, Integer> id;
    public static volatile SingularAttribute<Employe, Employe> managerId;
    public static volatile SingularAttribute<Employe, String> prenom;
    public static volatile SingularAttribute<Employe, String> nom;
    public static volatile CollectionAttribute<Employe, Employe> employeCollection;
    public static volatile SingularAttribute<Employe, String> email;
    public static volatile CollectionAttribute<Employe, Commande> commandeCollection;

}