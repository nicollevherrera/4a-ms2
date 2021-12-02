package com.grupo5.output_ms.controllers;
import com.grupo5.output_ms.exceptions.EventNotFoundException;
import com.grupo5.output_ms.models.Event;
import com.grupo5.output_ms.models.Ticket;
import com.grupo5.output_ms.repositories.EventRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class EventController {

    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    //crear un evento
    @PostMapping("/event/")
    Event newEvent(@RequestBody Event event){
        return eventRepository.save(event);
    }

    //traer todos los eventos
    @GetMapping("/events/")
    List<Event> listEvent () {
        return eventRepository.findAll();
    }

    //traer un evento especifico
    @GetMapping("/event/{idevent}")
    Event getEvent(@PathVariable String idevent){
        return eventRepository.findById(idevent).
                orElseThrow(() -> new EventNotFoundException("No se encontró el evento con ID: " + idevent));
    }

    //traer los eventos por nombre
    @GetMapping("/tickets/{name}")
    List <Event> getName(@PathVariable String name){
        return eventRepository.findByName(name);
    }

    //traer un evento por organizador
    @GetMapping ("/event/{organizer}")
    List <Event> getOrganizer(@PathVariable String organizer){return eventRepository.findByOrganizer(organizer);}

    //eliminar un evento
    @DeleteMapping("/event/{idevent}")
    void deleteEvent(@PathVariable String idevent) {
        eventRepository.deleteById(idevent);
    }

    //Actualizar un evento
    @PutMapping("/event/{idevent}")
    Event updateEvent(@PathVariable String idevent, @RequestBody Event new_event){
        Event old_event = eventRepository.findById(idevent).orElse(null);
        old_event.setName(new_event.getName());
        old_event.setOrganizer(new_event.getOrganizer());
        old_event.setDate(new_event.getDate());
        old_event.setHour(new_event.getHour());
        old_event.setCity(new_event.getHour());
        old_event.setCity(new_event.getCity());
        old_event.setAddress(new_event.getAddress());
        return eventRepository.save(old_event);
    }
}