package com.petshop.service;

import com.petshop.entityA.Agendamento;

import java.util.List;

public interface AgendamentoService {

    List<Agendamento> getAgendamentos();

    public void saveAgendamento(Agendamento theAgendamento);

    public Agendamento getAgendamento(int theId);

    public void deleteAgendamento(int theId);

}
