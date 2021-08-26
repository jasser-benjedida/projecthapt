package com.horizon.hapt.models;

public class Entreprise {
    private long id;
    private String raison;
    private String matriculeFiscale;
    private String rc;

    public Entreprise(long id, String raison, String matriculeFiscale, String rc) {
        this.id = id;
        this.raison = raison;
        this.matriculeFiscale = matriculeFiscale;
        this.rc = rc;
    }
}
