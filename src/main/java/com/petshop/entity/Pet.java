package com.petshop.entity;

import javax.persistence.*;

@Entity
@Table(name = "pet")
public class Pet {

public Pet(){
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private int id;
@Column(name = "pet_type")
private String petType;
@Column(name = "breed")
private String Breed;
@Column(name = "name")
private String Name;
@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,
                      CascadeType.DETACH, CascadeType.REFRESH})
@JoinColumn(name = "owner_id")
private Client client;

    public Pet(String petType, String breed, String name, Client client) {
        this.petType = petType;
        Breed = breed;
        Name = name;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", petType='" + petType + '\'' +
                ", Breed='" + Breed + '\'' +
                ", Name='" + Name + '\'' +
                ", client=" + client +
                '}';
    }
}
