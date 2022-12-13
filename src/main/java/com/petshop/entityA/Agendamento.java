package com.petshop.entityA;

import javax.persistence.*;

@Entity
@Table(name = "agendamentos")
public class Agendamento {

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

    public Agendamento(){
    }

    public Agendamento(Veterinario veterinario, Client client, String data, String horario) {
        this.veterinario = veterinario;
        this.client = client;
        this.data = data;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
        return "Agendamento{" +
                "id=" + id +
                ", veterinario=" + veterinario +
                ", client=" + client +
                ", data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}
