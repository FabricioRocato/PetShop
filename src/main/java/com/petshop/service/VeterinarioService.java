package com.petshop.service;

import com.petshop.entityA.Veterinario;

import java.util.List;

public interface VeterinarioService {

    List<Veterinario> getVeterinarios();

    public void saveVeterinario(Veterinario theVeterinario);

    public Veterinario getVeterinario(int theId);

    public void deleteVeterinario(int theId);

}
