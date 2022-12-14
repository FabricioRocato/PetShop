package com.petshop.service;


import com.petshop.dao.AgendamentoDao;
import com.petshop.dao.PetDao;
import com.petshop.dao.ClientDao;
import com.petshop.dao.VeterinarioDao;
import com.petshop.entityA.Agendamento;
import com.petshop.entityA.Client;
import com.petshop.entityA.Pet;
import com.petshop.entityA.Veterinario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ServiceImpl implements AgendamentoService, ClientService, PetService, VeterinarioService{

    @Autowired
    private ClientDao clientDao;

    @Override
    @Transactional
    public List<Client> getClients() {
        return clientDao.getClients();
    }


    @Override
    @Transactional
    public void saveClient(Client theClient) {

        clientDao.saveClient(theClient);
    }

    @Override
    @Transactional
    public Client getClient(int theId) {

        return clientDao.getClient(theId);
    }

    @Override
    @Transactional
    public void deleteClient(int theId) {

        clientDao.deleteClient(theId);
    }

    @Autowired
    private AgendamentoDao agendamentoDao;

    @Override
    @Transactional
    public List<Agendamento> getAgendamentos() {
        return agendamentoDao.getAgendamentos();
    }


    @Override
    @Transactional
    public void saveAgendamento(Agendamento theAgendamento) {

        agendamentoDao.saveAgendamento(theAgendamento);
    }

    @Override
    @Transactional
    public Agendamento getAgendamento(int theId) {

        return agendamentoDao.getAgendamento(theId);
    }

    @Override
    @Transactional
    public void deleteAgendamento(int theId) {

        agendamentoDao.deleteAgendamento(theId);
    }

    @Autowired
    private PetDao petDao;

    @Override
    @Transactional
    public List<Pet> getPets() {
        return petDao.getPets();
    }


    @Override
    @Transactional
    public void savePet(Pet thePet) {

        petDao.savePet(thePet);
    }

    @Override
    @Transactional
    public Pet getPet(int theId) {

        return petDao.getPet(theId);
    }

    @Override
    @Transactional
    public void deletePet(int theId) {

        petDao.deletePet(theId);
    }


    @Autowired
    private VeterinarioDao veterinarioDao;

    @Override
    @Transactional
    public List<Veterinario> getVeterinarios() {
        return veterinarioDao.getVeterinarios();
    }


    @Override
    @Transactional
    public void saveVeterinario(Veterinario theVeterinario) {

        veterinarioDao.saveVeterinario(theVeterinario);
    }

    @Override
    @Transactional
    public Veterinario getVeterinario(int theId) {

        return veterinarioDao.getVeterinario(theId);
    }

    @Override
    @Transactional
    public void deleteVeterinario(int theId) {

        veterinarioDao.deleteVeterinario(theId);
    }

}
