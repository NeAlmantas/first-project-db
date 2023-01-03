package com.example.firstprojectdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "darbuotojas")
public class Darbuotojas {

    @Id
    @Column(name = "ASMENSKODAS")
    private String asmensKodas;

    @Column(name = "VARDAS")
    private String vardas;

    @Column(name = "PAVARDE")
    private String pavarde;

    //--------------------------------------------------------------------------------------
    public String getAsmensKodas() {
        return asmensKodas;
    }

    public void setAsmensKodas(String asmensKodas) {
        this.asmensKodas = asmensKodas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }
}
