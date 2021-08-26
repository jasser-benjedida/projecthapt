package com.horizon.hapt.models;

    private int expereince;

    public Formateur(long id, int expereince)
        this.setId(id);
        this.setExpereince(expereince);
    }

    public long getId() {
        return id;
    }

    public int getExpereince() {
        return expereince;
    }

    public void setExpereince(int expereince) {
        this.expereince = expereince;
    }

    public void setId(long id) {
        this.id = id;
    }

