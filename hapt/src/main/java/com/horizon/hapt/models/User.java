package com.horizon.hapt.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(schema = "horizondb", uniqueConstraints = @UniqueConstraint(columnNames = "mail"))

public class User implements Serializable {
    private static final long serialVersionUID = 1l;
    @Column
    private long id;
    @Column
    private String mail;
    @Column
    private String password;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String address;
    @Column
    private int tel;
    @Column
    private Date dateN;
    @Column
    private int cin;
    @Column
    private String niveau;
    @ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "id")
    private Role role;

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

    public Role getRole() {
        return role;
    }

    public void setRole(Role Role) {
        this.role = role;
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
        return address;
    }

    public void setAddrese(String addrese) {
        this.address = address;
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

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}