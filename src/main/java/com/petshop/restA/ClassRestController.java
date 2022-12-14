package com.petshop.restA;

import com.petshop.service.*;
import com.petshop.entityA.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ClassRestController {

        // autowire the CustomerService
        @Autowired
        private ClientService clientService;

        // add mapping for GET /customers
        @GetMapping("/clients")
        public List<Client> getClients(){
            return clientService.getClients();
        }

        // add mapping for GET /customers/{customerId}

        @GetMapping("/clients/{clientId}")
        public Client getClient (@PathVariable int clientId) {
            Client theClient = clientService.getClient(clientId);

            if (theClient == null){
                throw new NotFoundException("Client id not found - " + clientId);
            }

            return theClient;

        }

        // add mapping for POST /customers - add new customer

        @PostMapping("/clients")
        public Client addClient(@RequestBody Client theClient){

            // also just in case the pass an id in JSON ... set id to 0
            // this is force a save of new item ... instead of update

            theClient.setId(0);

            clientService.saveClient(theClient);

            return theClient;
        }

        // add mapping for PUT /customer - update existing customer

        @PutMapping ("/clients")
        public Client updateClient (@RequestBody Client theClient){

            clientService.saveClient(theClient);
            return theClient;
        }

        // add mapping for DELETE /customers/ {customerId} - delete customer
        @DeleteMapping("/clients/{clientId}")
        public String deleteClient(@PathVariable int clientId){

            Client tempClient = clientService.getClient(clientId);

            // throw exception if null

            if (tempClient == null){
                throw new NotFoundException("Client id not found - " + clientId);
            }

            clientService.deleteClient(clientId);

            return "Deleted client id - " + clientId;
        }

        @Autowired
        private AgendamentoService agendamentoService;

        // add mapping for GET /customers
        @GetMapping("/agendamentos")
        public List<Agendamento> getAgendamentos(){
            return agendamentoService.getAgendamentos();
        }

        // add mapping for GET /customers/{customerId}

        @GetMapping("/agendamentos/{agendamentoId}")
        public Agendamento getAgendamento (@PathVariable int agendamentoId){
            Agendamento theAgendamento = agendamentoService.getAgendamento(agendamentoId);

            if (theAgendamento == null){
                throw new NotFoundException("Booking id not found - " + agendamentoId);
            }

            return theAgendamento;

        }

        // add mapping for POST /customers - add new customer

        @PostMapping("/agendamentos")
        public Agendamento addAgendamento(@RequestBody Agendamento theAgendamento){

            // also just in case the pass an id in JSON ... set id to 0
            // this is force a save of new item ... instead of update

            theAgendamento.setId(0);

            agendamentoService.saveAgendamento(theAgendamento);

            return theAgendamento;
        }

        // add mapping for PUT /customer - update existing customer

        @PutMapping ("/agendamentos")
        public Agendamento updateAgendamento (@RequestBody Agendamento theAgendamento){

            agendamentoService.saveAgendamento(theAgendamento);
            return theAgendamento;
        }

        // add mapping for DELETE /customers/ {customerId} - delete customer
        @DeleteMapping("/agendamentos/{agendamentoId}")
        public String deleteAgendamento(@PathVariable int agendamentoId){

            Agendamento tempAgendamento = agendamentoService.getAgendamento(agendamentoId);

            // throw exception if null

            if (tempAgendamento == null){
                throw new NotFoundException("Booking id not found - " + agendamentoId);
            }

            agendamentoService.deleteAgendamento(agendamentoId);

            return "Deleted booking id - " + agendamentoId;
        }


        @Autowired
        private PetService petService;

        // add mapping for GET /customers
        @GetMapping("/pets")
        public List<Pet> getPets(){
            return petService.getPets();
        }

        // add mapping for GET /customers/{customerId}

        @GetMapping("/pets/{petId}")
        public Pet getPet (@PathVariable int petId){
            Pet thePet = petService.getPet(petId);

            if (thePet == null){
                throw new NotFoundException("Pet id not found - " + petId);
            }

            return thePet;

        }

        // add mapping for POST /customers - add new customer

        @PostMapping("/pets")
        public Pet addPet(@RequestBody Pet thePet){

            // also just in case the pass an id in JSON ... set id to 0
            // this is force a save of new item ... instead of update

            thePet.setId(0);

            petService.savePet(thePet);

            return thePet;
        }

        // add mapping for PUT /customer - update existing customer

        @PutMapping ("/pets")
        public Pet updatePet (@RequestBody Pet thePet){

            petService.savePet(thePet);
            return thePet;
        }

        // add mapping for DELETE /customers/ {customerId} - delete customer
        @DeleteMapping("/pets/{petId}")
        public String deletePet(@PathVariable int petId){

            Pet tempPet = petService.getPet(petId);

            // throw exception if null

            if (tempPet == null){
                throw new NotFoundException("Pet id not found - " + petId);
            }

            petService.deletePet(petId);

            return "Deleted pet id - " + petId;
        }


        @Autowired
        private VeterinarioService veterinarioService;

        // add mapping for GET /customers
        @GetMapping("/veterinarios")
        public List<Veterinario> getVeterinarios(){
            return veterinarioService.getVeterinarios();
        }

        // add mapping for GET /customers/{customerId}

        @GetMapping("/veterinarios/{veterinarioId}")
        public Veterinario getVeterinario (@PathVariable int veterinarioId){
            Veterinario theVeterinario = veterinarioService.getVeterinario(veterinarioId);

            if (theVeterinario == null){
                throw new NotFoundException("Veterinario id not found - " + veterinarioId);
            }

            return theVeterinario;

        }

        // add mapping for POST /customers - add new customer

        @PostMapping("/veterinarios")
        public Veterinario addVeterinario(@RequestBody Veterinario theVeterinario){

            // also just in case the pass an id in JSON ... set id to 0
            // this is force a save of new item ... instead of update

            theVeterinario.setId(0);

            veterinarioService.saveVeterinario(theVeterinario);

            return theVeterinario;
        }

        // add mapping for PUT /customer - update existing customer

        @PutMapping ("/veterinarios")
        public Veterinario updateVeterinario (@RequestBody Veterinario theVeterinario){

            veterinarioService.saveVeterinario(theVeterinario);
            return theVeterinario;
        }

        // add mapping for DELETE /customers/ {customerId} - delete customer
        @DeleteMapping("/veterinarios/{veterinarioId}")
        public String deleteVeterinario(@PathVariable int veterinarioId){

            Veterinario tempVeterinario = veterinarioService.getVeterinario(veterinarioId);

            // throw exception if null

            if (tempVeterinario == null){
                throw new NotFoundException("Veterinario id not found - " + veterinarioId);
            }

            veterinarioService.deleteVeterinario(veterinarioId);

            return "Deleted veterinario id - " + veterinarioId;
        }

}
