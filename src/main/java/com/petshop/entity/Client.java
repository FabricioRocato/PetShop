package com.petshop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {

    public Client(){
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "cellphone")
    private String cellphone;




    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id")
    private List<Pet> pets;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private List<Agendamentos> agendamentos;








    public Client(String name, String cellphone) {
        this.name = name;
        this.cellphone = cellphone;
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

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public List<Agendamentos> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamentos> agendamentos) {
        this.agendamentos = agendamentos;
    }

    public void addPets(Pet thePets){
        if (pets == null){
            pets = new ArrayList<>();
        }
        pets.add(thePets);
    }

    public void addAgendamentos(Agendamentos theAgendamentos){
        if (agendamentos == null){
            agendamentos = new ArrayList<>();
        }
        agendamentos.add(theAgendamentos);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cellphone='" + cellphone + '\'' +
                '}';
    }
}
