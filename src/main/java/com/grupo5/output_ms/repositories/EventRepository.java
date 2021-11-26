package com.grupo5.output_ms.repositories;
import com.grupo5.output_ms.models.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface EventRepository extends MongoRepository <Event, Integer> {

}
