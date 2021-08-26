package com.horizon.hapt.models;

public class Etudiant {
    private long id;
    private int contactF;

    public Etudiant(long id, int contactF) {
        this.contactF = contactF;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getContact() {
        return contactF;
    }

    public void setContact(int contact) {
        this.contactF = contact;
    }

}
