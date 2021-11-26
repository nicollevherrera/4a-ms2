package controllers;

import com.grupo5.output_ms.repositories.EventRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventController {
    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }


}
