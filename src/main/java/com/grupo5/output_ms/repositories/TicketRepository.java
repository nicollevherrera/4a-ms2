package com.grupo5.output_ms.repositories;
import com.grupo5.output_ms.models.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface TicketRepository extends MongoRepository <Ticket, Integer> {
    List <Ticket> findByname (String name);
}
