package com.petshop.dao;

import com.petshop.entityA.Veterinario;

import java.util.List;

public interface VeterinarioDao {

    List<Veterinario> getVeterinarios();

    public void saveVeterinario(Veterinario theVeterinario);

    public Veterinario getVeterinario(int theId);

    public void deleteVeterinario(int theId);

}
