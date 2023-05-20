/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projet.entities;
import java.sql.Date;

/**
 *
 * @author arabaoui
 */

public class Candidat {
    private int id_Candidat;
    private String nom;
    private String prenom;
    private Date date_de_naissance;
    private String mail;
    private int tel;
    
    public Candidat(int id_Candidat,String nom, String prenom,Date date_de_naissance,String mail,int tel) {
        this.id_Candidat = id_Candidat;
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance ;
        this.mail = mail;
        this.tel = tel;
    }
    public Candidat(String nom, String prenom,Date date_de_naissance,String mail,int tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance ;
        this.mail = mail;
        this.tel = tel;
    }
    public int getId_Candidat() {
        return id_Candidat;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId_Candidat(int id_Candidat) {
        this.id_Candidat = id_Candidat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    public String getMail() {
        return mail;
    }

    public int getTel() {
        return tel;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Candidat{" + "id_Candidat=" + id_Candidat + ", nom=" + nom + ", prenom=" + prenom + ", date_de_naissance=" + date_de_naissance + ", mail=" + mail + ", tel=" + tel + '}';
    }

   
    
}    
    
    

