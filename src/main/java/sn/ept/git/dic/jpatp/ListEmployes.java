/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic.jpatp;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import sn.ept.git.dic.Entity1.Employe;

/**
 *
 * @author HP
 */
public class ListEmployes {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PUvente");
        EntityManager em = emf.createEntityManager();
        Query requete = em.createQuery("SELECT e FROM Employe e",Employe.class);
        List<Employe> employes = requete.getResultList();
        employes.forEach(emp ->{
         System.out.println("id employe:" + emp.getId() + " " + "Prenom:" + emp.getPrenom());
        
        });
        em.close();
        emf.close();
    }
}
