package com.grupo5.output_ms.controllers;
import com.grupo5.output_ms.models.Sale;
import com.grupo5.output_ms.models.Ticket;
import com.grupo5.output_ms.repositories.TicketRepository;
import com.grupo5.output_ms.exceptions.TicketNotFoundException;
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
    List <Ticket> getName(@PathVariable String name){
        return ticketRepository.findByName(name);
    }


    //traer ticket pot id
    @GetMapping("/ticket/{idticket}")
    Ticket getTicket(@PathVariable String idticket){
        return ticketRepository.findById(idticket)
                .orElseThrow(() -> new TicketNotFoundException("No existe el ticket: " + idticket));
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

    //Actualizar un ticket
    @PutMapping("/event/{idticket}")
    Ticket updateTicket(@PathVariable String idticket, @RequestBody Ticket new_ticket){
        Ticket old_ticket = ticketRepository.findById(idticket).orElse(null);
        old_ticket.setType(new_ticket.getType());
        old_ticket.setPrice(new_ticket.getPrice());
        old_ticket.setName(new_ticket.getName());
        old_ticket.setAddress(new_ticket.getAddress());
        old_ticket.setDate(new_ticket.getDate());
        old_ticket.setHour(new_ticket.getHour());
        return ticketRepository.save(old_ticket);
    }
}