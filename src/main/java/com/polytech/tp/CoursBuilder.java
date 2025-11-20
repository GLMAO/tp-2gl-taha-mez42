package com.polytech.tp;

public class CoursBuilder {
// TODO: Implémenter le pattern Builder
    private Cours cours;

    public CoursBuilder() {
        this.cours = new Cours(); 
    }

    public CoursBuilder setMatiere(String matiere) {
        cours.setMatiere(matiere);
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        cours.setEnseignant(enseignant);
        return this;
    }

    public CoursBuilder setSalle(String salle) {
        cours.setSalle(salle);
        return this;
    }

    public CoursBuilder setDate(String date) {
        cours.setDate(date);
        return this;
    }

    public CoursBuilder setHeureDebut(String heure) {
        cours.setHeureDebut(heure);
        return this;
    }

    public CoursBuilder setEstOptionnel(boolean optionnel) {
        cours.setEstOptionnel(optionnel);
        return this;
    }

    public CoursBuilder setNiveau(String niveau) {
        cours.setNiveau(niveau);
        return this;
    }

    public CoursBuilder setNecessiteProjecteur(boolean necessite) {
        cours.setNecessiteProjecteur(necessite);
        return this;
    }

    public Cours build() {
        return cours;
    }
}
