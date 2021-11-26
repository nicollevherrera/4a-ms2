package controllers;

import com.grupo5.output_ms.models.Event;
import com.grupo5.output_ms.repositories.EventRepository;
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
    Optional<Event> getIdevent(@PathVariable Integer id){
        return eventRepository.findById(id);
    }

    @GetMapping ("/eventos")
    List<Event> listEvent(){
        return eventRepository.findAll();
    }

    @PostMapping("/evento")
    Event newEvent(@RequestBody Event event){
        return eventRepository.save(event);
    }
}
