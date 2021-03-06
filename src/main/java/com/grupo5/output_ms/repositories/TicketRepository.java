package com.grupo5.output_ms.repositories;
import com.grupo5.output_ms.models.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface TicketRepository extends MongoRepository <Ticket, String> {
   // List <Ticket> findByType (String type);
    List <Ticket> findByOrganizer (String organizer);
}
