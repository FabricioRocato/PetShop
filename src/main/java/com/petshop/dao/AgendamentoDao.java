package com.petshop.dao;

import com.petshop.entityA.Agendamento;

import java.util.List;

public interface AgendamentoDao {

    List<Agendamento> getAgendamentos();

    public void saveAgendamento(Agendamento theAgendamento);

    public Agendamento getAgendamento(int theId);

    public void deleteAgendamento(int theId);

}
