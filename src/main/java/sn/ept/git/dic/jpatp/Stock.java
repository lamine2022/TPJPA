/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic.jpatp;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import static javax.persistence.Persistence.createEntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author HP
 */
public class Stock {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = createEntityManagerFactory("PUproduction");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT e.produit.nom, SUM(e.quantite) FROM Stock e GROUP BY e.produit.id");
        List stocks  = q.getResultList();
             
        stocks.forEach(stock ->  {
            Object[] resultArray =(Object[]) stock ;
             System.out.println("Nom:" +resultArray[0] + "  "+ "Quantite:" + resultArray[1])  ;
        });  
        em.close();
        emf.close();
    }


}
