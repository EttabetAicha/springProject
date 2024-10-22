package com.aicha.maska.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Membre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroAdhesion;
    private String nom;
    private String prenom;
    private String pieceIdentification;
    private String nationalite;
    private Date dateAdhesion;
    private Date dateExpirationLicence;

    public int getNumeroAdhesion() {
        return numeroAdhesion;
    }

    public void setNumeroAdhesion(int numeroAdhesion) {
        this.numeroAdhesion = numeroAdhesion;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPieceIdentification() {
        return pieceIdentification;
    }

    public void setPieceIdentification(String pieceIdentification) {
        this.pieceIdentification = pieceIdentification;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public Date getDateAdhesion() {
        return dateAdhesion;
    }

    public void setDateAdhesion(Date dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }

    public Date getDateExpirationLicence() {
        return dateExpirationLicence;
    }

    public void setDateExpirationLicence(Date dateExpirationLicence) {
        this.dateExpirationLicence = dateExpirationLicence;
    }
}