/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projet.services;


import com.projet.entities.Rdv;
import com.projet.utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arabaoui
 */
public class ServiceRdv {
    
    private Connection cnx = DataSource.getInstance().getCnx();
    
    public void ajouter(Rdv r) {
        try {
            String req = "INSERT INTO Rdv(idRdv, date, Resultat) VALUES (?,?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
             pst.setInt(1, r.getIdRdv());
            pst.setDate(1, r.getDate());
            pst.setString(2, r.getResultat());
            pst.executeUpdate();
            System.out.println("Rendez-vous ajoutée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void modifier(Rdv r) {
        try {
            String req = "UPDATE personne SET , date=?, resultat=? WHERE idRdv=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(3, r.getIdRdv());
            pst.setDate(1, r.getDate());
            pst.setString(2, r.getResultat());
            pst.executeUpdate();
            System.out.println("rendez-vous modifiée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void supprimer(Rdv r) {
        try {
            String req = "DELETE from personne WHERE idRdv=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, r.getIdRdv());
            pst.executeUpdate();
            System.out.println("Rendez-vous supprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Rdv> afficher() {
        List<Rdv> list = new ArrayList<>();
        
        String req = "SELECT * FROM Rdv";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                list.add(new Rdv(rs.getInt("idRdv"), rs.getDate("date"), rs.getString("resultat")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        return list;
    }
}
