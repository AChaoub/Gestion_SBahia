package DAO.Test;
import DAO.Services.serviceUtilisateur;
import com.beans.produit;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestingDAO {
     public static void main(String[] args) throws SQLException  {
         
        serviceUtilisateur serviceDAO = new serviceUtilisateur();
         
        
        
         //serviceDAO.modifierProduit(1,"SARA", 111, 222);
         //produit p = new produit("Imane", 999, 99);
         //serviceDAO.ajouterProduit(p);
         //serviceDAO.voterProduit(2);
         
         
         
         //le produit qui a le plus nombre du votes
         produit recupererPlusVotes = serviceDAO.recupererPlusVotes();
         System.out.println(recupererPlusVotes.toString());
         
         
         //affcihage
         ArrayList<produit> listeProduits = serviceDAO.AfficherTout();
         for(int i = 0 ; i<listeProduits.size();i++){
         System.out.println(listeProduits.get(i).toString());
         }
         
         
         //serviceDAO.supprimerProduit(5);

     }  
}
