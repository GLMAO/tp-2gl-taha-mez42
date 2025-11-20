package com.polytech.tp;

public class Responsable implements Observer {  
    private String nom;

    // utilisé par les tests pour vérifier la notification
    public String lastMessage = ""; 

    public Responsable(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {     
        System.out.println("Notification pour le responsable " + nom + " : " + message);
        this.lastMessage = message; 
    }
}
