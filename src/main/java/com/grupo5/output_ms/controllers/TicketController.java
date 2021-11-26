package com.grupo5.output_ms.controllers;

import com.grupo5.output_ms.models.Ticket;
import com.grupo5.output_ms.repositories.TicketRepository;
import exceptions.EventNotFoundException;
import exceptions.TicketNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {
    private final TicketRepository ticketRepository;

    public TicketController(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @GetMapping("/ticket/{name}")
    List<Ticket> getName(@PathVariable String name){
        return ticketRepository.findByname(name);
                //.orElseThrow(
                //        () -> new TicketNotFoundException("Error: NO DATA"));;


    }@GetMapping("/tickets")
    List<Ticket> ListTickets (){
        return  ticketRepository.findAll();
    }

    @PostMapping("/ticket")
    Ticket newTicket(@RequestBody Ticket ticket){
    return ticketRepository.save(ticket);
    }
}

