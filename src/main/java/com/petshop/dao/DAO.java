package com.petshop.dao;

import com.petshop.entityA.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DAO implements AgendamentoDao, ClientDao, PetDao,VeterinarioDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Client> getClients() {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query  ... sort by first name
        Query<Client> theQuery =
                currentSession.createQuery("from Client order by name",
                        Client.class);

        // execute query and get result list
        List<Client> clients = theQuery.getResultList();

        // return the results
        return clients;
    }

    @Override
    public void saveClient(Client theClient) {

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // save/update the customer ... finally LOL
        currentSession.saveOrUpdate(theClient);

    }

    @Override
    public Client getClient(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // now retrieve/read from database using the primary key
        Client theClient = currentSession.get(Client.class, theId);

        return theClient;
    }


    @Override
    public void deleteClient(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // delete object with primary key
        Query theQuery =
                currentSession.createQuery("delete from Client where id=:clientId");
        theQuery.setParameter("clientId", theId);

        theQuery.executeUpdate();
    }

    @Override
    public List<Agendamento> getAgendamentos() {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query  ... sort by first name
        Query<Agendamento> theQuery =
                currentSession.createQuery("from Agendamento order by id",
                        Agendamento.class);

        // execute query and get result list
        List<Agendamento> Agendamentos = theQuery.getResultList();

        // return the results
        return Agendamentos;
    }

    @Override
    public void saveAgendamento(Agendamento theAgendamento) {

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // save/update the customer ... finally LOL
        currentSession.saveOrUpdate(theAgendamento);

    }

    @Override
    public Agendamento getAgendamento(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // now retrieve/read from database using the primary key
        Agendamento theAgendamento = currentSession.get(Agendamento.class, theId);

        return theAgendamento;
    }


    @Override
    public void deleteAgendamento(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // delete object with primary key
        Query theQuery =
                currentSession.createQuery("delete from Agendamento where id=:agendamentoId");
        theQuery.setParameter("agendamentoId", theId);

        theQuery.executeUpdate();
    }


    @Override
    public List<Pet> getPets() {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query  ... sort by first name
        Query<Pet> theQuery =
                currentSession.createQuery("from Pet order by id",
                        Pet.class);

        // execute query and get result list
        List<Pet> pets = theQuery.getResultList();

        // return the results
        return pets;
    }

    @Override
    public void savePet(Pet thePet) {

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // save/update the customer ... finally LOL
        currentSession.saveOrUpdate(thePet);

    }

    @Override
    public Pet getPet(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // now retrieve/read from database using the primary key
        Pet thePet = currentSession.get(Pet.class, theId);

        return thePet;
    }


    @Override
    public void deletePet(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // delete object with primary key
        Query theQuery =
                currentSession.createQuery("delete from Pet where id=:petId");
        theQuery.setParameter("petId", theId);

        theQuery.executeUpdate();
    }

    @Override
    public List<Veterinario> getVeterinarios() {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query  ... sort by first name
        Query<Veterinario> theQuery =
                currentSession.createQuery("from Veterinario order by name",
                        Veterinario.class);

        // execute query and get result list
        List<Veterinario> veterinarios = theQuery.getResultList();

        // return the results
        return veterinarios;
    }

    @Override
    public void saveVeterinario(Veterinario theVeterinario) {

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // save/update the customer ... finally LOL
        currentSession.saveOrUpdate(theVeterinario);

    }

    @Override
    public Veterinario getVeterinario(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // now retrieve/read from database using the primary key
        Veterinario theVeterinario = currentSession.get(Veterinario.class, theId);

        return theVeterinario;
    }


    @Override
    public void deleteVeterinario(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // delete object with primary key
        Query theQuery =
                currentSession.createQuery("delete from Veterinario where id=:veterinarioId");
        theQuery.setParameter("veterinarioId", theId);

        theQuery.executeUpdate();
    }


}
