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
import sn.ept.git.dic.Entity2.Produit;

/**
 *
 * @author HP
 */
public class ListProduits {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PUproduction");
        EntityManager em = emf.createEntityManager();
        Query requete = em.createQuery("SELECT p FROM Produit p",Produit.class);
        List<Produit> produit = requete.getResultList();
        produit.forEach(prod ->{
         System.out.println("id produit:" + prod.getId() + " " + "nom:" + prod.getNom());
        });
        em.close();
        emf.close();
    }
}
