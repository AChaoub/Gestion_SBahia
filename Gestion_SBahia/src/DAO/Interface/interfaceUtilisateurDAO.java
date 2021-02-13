package DAO.Interface;

import com.beans.produit;
import java.sql.SQLException;
import java.util.ArrayList;

public interface interfaceUtilisateurDAO {
    
    public ArrayList<produit> AfficherTout()throws SQLException;
    public produit ajouterProduit(produit p) throws SQLException;
    public void modifierProduit(int id,String libelle , int prix , int qte) throws SQLException;
    public void supprimerProduit(int id) throws SQLException;
    public produit recupererProduitParID(int id) throws SQLException;
    public void voterProduit(int p) throws SQLException;
    public produit recupererPlusVotes() throws SQLException;
    public void seLoguer();
    public void sIdentifier();
    
}
