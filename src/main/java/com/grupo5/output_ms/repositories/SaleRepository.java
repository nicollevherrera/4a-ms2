package com.grupo5.output_ms.repositories;
import com.grupo5.output_ms.models.Sale;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface SaleRepository extends MongoRepository <Sale, String> {

}