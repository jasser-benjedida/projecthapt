package com.horizon.hapt.models;

import java.util.Date;
import java.util.List;

public class User {
    private long id;
    private String mail;
    private String password;
    private String nom;
    private String prenom;
    private String address;
    private int tel;
    private Date dateN;
    private int cin;
    private String niveau;
    private List<Role> listRole;
    private List<Etudiant> listeEtudiant;
    private List<Entreprise> lisetEntreprise;

    public User(String nom, String prenom, String addrese, int tel, String password, Date dateN, int cin, String niveau,
            String mail, String expereince, long id) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAddrese(addrese);
        this.setTel(tel);
        this.setDateN(dateN);
        this.setCin(cin);
        this.setNiveau(niveau);
        this.setMail(mail);

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Etudiant> getListeEtudiant() {
        return listeEtudiant;
    }

    public void setListeEtudiant(List<Etudiant> listeEtudiant) {
        this.listeEtudiant = listeEtudiant;
    }

    public List<Entreprise> getLisetEntreprise() {
        return lisetEntreprise;
    }

    public void setLisetEntreprise(List<Entreprise> lisetEntreprise) {
        this.lisetEntreprise = lisetEntreprise;
    }

    public List<Etudiant> getEtudiant() {
        return getEtudiant();
    }

    public void setEtudiant(List<Etudiant> etudiant) {
        this.listeEtudiant = etudiant;
    }

    public List<Role> getListRole() {
        return listRole;
    }

    public void setListRole(List<Role> listRole) {
        this.listRole = listRole;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public Date getDateN() {
        return dateN;
    }

    public void setDateN(Date dateN) {
        this.dateN = dateN;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getAddrese() {
        return addrese;
    }

    public void setAddrese(String addrese) {
        this.addrese = addrese;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}