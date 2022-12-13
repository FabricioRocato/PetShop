package com.petshop.entityA;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "veterinario")
public class Veterinario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private int id;
@Column(name = "name")
private String name;
@Column(name = "cellphone")
private String cellphone;
@Column(name = "email")
private String email;
@Column(name = "license")
private int license;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "veterinario_id")
    private Set<Agendamento> agendamentos;


public Veterinario(){
}


    public Veterinario(String name, String cellphone, String email, int license) {
        this.name = name;
        this.cellphone = cellphone;
        this.email = email;
        this.license = license;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getLicense() {
        return license;
    }

    public void setLicense(int license) {
        this.license = license;
    }

    public Set<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(Set<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", email='" + email + '\'' +
                ", license=" + license +
                '}';
    }
}
