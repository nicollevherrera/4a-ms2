package com.grupo5.output_ms.controllers;
import com.grupo5.output_ms.exceptions.EventNotFoundException;
import com.grupo5.output_ms.models.Event;
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
                orElseThrow(() -> new EventNotFoundException("No se encontró el evento"));
    }

    //eliminar un evento
    @DeleteMapping("/event/{idevent}")
    void deleteEvent(@PathVariable String idevent) {
        eventRepository.deleteById(idevent);
    }


}