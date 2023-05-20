/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projet.tests;
import com.projet.entities.Candidat;
import com.projet.entities.Rdv;
import com.projet.services.ServiceRdv;
import com.projet.services.ServiceCandidat;
import com.projet.utils.DataSource;
import java.sql.Date;

/**
 *
 * @author arabaoui
 */
public class MainProg {
    
    public static void main(String[] args) {
//ServiceCandidat c1 = new ServiceCandidat();
//        System.out.println(c1.afficher());
        ServiceCandidat c1 = new ServiceCandidat();
//        c1.ajouter(new Candidat( "anis", "mejri",Date.valueOf("2000-02-03"),"anis.mejri@gmail.com",95478456));
                c1.supprimer(new Candidat( "anis", "mejri",Date.valueOf("2000-02-03"),"anis.mejri@gmail.com",95478456));

    }
}
