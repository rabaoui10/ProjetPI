/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.projet.services;
import com.projet.entities.Candidat;
import com.projet.entities.Rdv;
import java.util.List;

/**
 *
 * @author arabaoui
 * @param <T>
 */
public interface IService<T> {
    
    public void ajouter(T c);
    public void modifier(T c);
    public void supprimer(T c);
    public List<T> afficher();
}
