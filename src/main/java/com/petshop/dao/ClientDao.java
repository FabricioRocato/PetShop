package com.petshop.dao;

import com.petshop.entityA.Client;

import java.util.List;

public interface ClientDao {

    List<Client> getClients();

    public void saveClient(Client theClient);

    public Client getClient(int theId);

    public void deleteClient(int theId);

}
