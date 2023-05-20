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
public class Rdv {
    private int idRdv;
    private Date date;
    private String resultat;
    
    // Constructeur
    public Rdv(int idRdv, Date date, String resultat) {
        this.idRdv = idRdv;
        this.date = date;
        this.resultat = resultat;
    }

    public int getIdRdv() {
        return idRdv;
    }

    public Date getDate() {
        return date;
    }

    public String getResultat() {
        return resultat;
    }

    public void setIdRdv(int idRdv) {
        this.idRdv = idRdv;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    @Override
    public String toString() {
        return "Rdv{" + "idRdv=" + idRdv + ", date=" + date + ", resultat=" + resultat + '}';
    }
    
    
 }