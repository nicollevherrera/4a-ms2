package com.grupo5.output_ms.repositories;
import com.grupo5.output_ms.models.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface EventRepository extends MongoRepository <Event, String> {
    List<Event> findByName (String name);
    //List<Event> findByOrganizer (String organizer);
}
