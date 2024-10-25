package com.aicha.maska.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Entity
public class Membre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroadhesion;

    private String nom;
    private String prenom;
    private String pieceidentification;
    private String nationalite;

    @NotNull(message = "Date Adhesion is mandatory")
    @PastOrPresent(message = "Date Adhesion must be in the past or present")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateadhesion;

    @NotNull(message = "Date Expiration Licence is mandatory")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateexpirationlicence;

    // Getters and setters
    public int getNumeroadhesion() {
        return numeroadhesion;
    }

    public void setNumeroadhesion(int numeroadhesion) {
        this.numeroadhesion = numeroadhesion;
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

    public String getPieceidentification() {
        return pieceidentification;
    }

    public void setPieceidentification(String pieceidentification) {
        this.pieceidentification = pieceidentification;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public LocalDate getDateadhesion() {
        return dateadhesion;
    }

    public void setDateadhesion(LocalDate dateadhesion) {
        this.dateadhesion = dateadhesion;
    }

    public LocalDate getDateexpirationlicence() {
        return dateexpirationlicence;
    }

    public void setDateexpirationlicence(LocalDate dateexpirationlicence) {
        this.dateexpirationlicence = dateexpirationlicence;
    }
}
