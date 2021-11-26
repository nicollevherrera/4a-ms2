package com.grupo5.output_ms.controllers;

import com.grupo5.output_ms.models.Event;
import com.grupo5.output_ms.repositories.EventRepository;
import exceptions.EventNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EventController {
    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @GetMapping("/evento/id")
    Event getIdevent(@PathVariable Integer idevent){
        return eventRepository.findById(idevent)
                .orElseThrow(
                        () -> new EventNotFoundException("404"));
    }

    @GetMapping ("/evento")
    List<Event> listEvent(){
        return eventRepository.findAll();
    }

    @PostMapping("/evento")
    Event newEvent(@RequestBody Event event){
        return eventRepository.save(event);
    }

    @DeleteMapping("/evento/{id}")
    void deleteEvent(@PathVariable String idevent){
        eventRepository.deleteById(Integer.valueOf(idevent));
    }
}
