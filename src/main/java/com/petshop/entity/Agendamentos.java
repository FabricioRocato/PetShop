package com.petshop.entity;

import javax.persistence.*;

@Entity
@Table(name = "agendamentos")
public class Agendamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "veterinario_id")
    private Veterinario veterinario;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "data")
    private String data;
    @Column(name = "horario")
    private String horario;

    public Agendamentos(){
    }

    public Agendamentos(int veterinario_id, int client_id, String data, String horario) {
        this.veterinario_id = veterinario_id;
        this.client_id = client_id;
        this.data = data;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVeterinario_id() {
        return veterinario_id;
    }

    public void setVeterinario_id(int veterinario_id) {
        this.veterinario_id = veterinario_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Agendamentos{" +
                "id=" + id +
                ", veterinario_id=" + veterinario_id +
                ", client_id=" + client_id +
                ", data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}
