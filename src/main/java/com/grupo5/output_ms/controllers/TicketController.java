package com.grupo5.output_ms.controllers;
import com.grupo5.output_ms.models.Ticket;
import com.grupo5.output_ms.repositories.TicketRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class TicketController {

    private final TicketRepository ticketRepository;

    public TicketController(TicketRepository ticketRepository){
        this.ticketRepository = ticketRepository;
    }

    //crear un ticket
    @PostMapping("/ticket/")
    Ticket newTicket(@RequestBody Ticket ticket){
        return ticketRepository.save(ticket);
    }

    //traer los tickets por nombre
    @GetMapping("/tickets/{name}")
    List<Ticket> getName(@PathVariable String name){
        return ticketRepository.findByName(name);
    }


    //traer ticket pot id
    @GetMapping("/ticket/{idticket}")
    Optional <Ticket> getTicket(@PathVariable String idticket){
        return ticketRepository.findById(idticket);
    }


    //traer todos los tickets
    @GetMapping("/tickets/")
    List<Ticket> listTicket (){
        return ticketRepository.findAll();
    }


    //eliminar un ticket
    @DeleteMapping("/ticket/{idticket}")
    void deleteTicket(@PathVariable String idticket){
        ticketRepository.deleteById(idticket);
    }


}