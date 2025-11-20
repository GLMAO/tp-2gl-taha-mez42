package com.polytech.tp;

public class Etudiant implements Observer {

    private String nom;

    // utilisé par les tests pour vérifier la notification
    public String lastMessage = "";

    public Etudiant(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification pour l'étudiant " + nom + " : " + message);
        this.lastMessage = message;
    }
}