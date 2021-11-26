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

    @GetMapping("/event/{idevent}")
    Event getIdevent(@PathVariable Integer idevent){
        return eventRepository.findById(idevent)
                .orElseThrow(
                        () -> new EventNotFoundException("Error: NO DATA"));
    }

    @GetMapping ("/events/")
    List<Event> listEvent(){
        return eventRepository.findAll();
    }

    //exception event 200

    @PostMapping("/event/")
    Event newEvent(@RequestBody Event event){
        return eventRepository.save(event);
    }

    @DeleteMapping("/event/{idevent}")
    void deleteEvent(@PathVariable String idevent){
        eventRepository.deleteById(Integer.valueOf(idevent));
    }
}
