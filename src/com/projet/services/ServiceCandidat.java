/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projet.services;
import com.projet.entities.Candidat;
import com.projet.utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arabaoui
 */
public class ServiceCandidat {
    
    private Connection cnx = DataSource.getInstance().getCnx();
    
    public void ajouter(Candidat c) {
        try {
            String req = "INSERT INTO Candidat(id_Candidat,nom, prenom, date_de_naissance, mail, tel) VALUES (?,?,?,?,?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, c.getId_Candidat());
            pst.setString(2, c.getNom());
            pst.setString(3, c.getPrenom());
            pst.setInt(6, c.getTel());
            pst.setString(5, c.getMail());
            pst.setDate(4, c.getDate_de_naissance());
            pst.executeUpdate();
            System.out.println("Candidat ajoutée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void modifier(Candidat c) {
        try {
            String req = "UPDATE personne SET nom=?, prenom=? WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(3, c.getId_Candidat());
            pst.setString(1, c.getNom());
            pst.setString(2, c.getPrenom());
            pst.setInt(6, c.getTel());
            pst.setString(5, c.getMail());
            pst.setDate(4, c.getDate_de_naissance());
            pst.executeUpdate();
            System.out.println("Personne modifiée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void supprimer(Candidat c) {
        try {
            String req = "DELETE from personne WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, c.getId_Candidat());
            pst.executeUpdate();
            System.out.println("candidat supprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Candidat> afficher() {
        List<Candidat> list = new ArrayList<>();
        
        String req = "SELECT * FROM Candidat";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                list.add(new Candidat(rs.getInt("id_candidat"), rs.getString("nom"), rs.getString("prenom"),rs.getDate("date_de_naissance"), rs.getString("mail"), rs.getInt("tel")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        return list;
    }
}
