package com.grupo5.output_ms.controllers;
import com.grupo5.output_ms.exceptions.SaleNotFoundException;
import com.grupo5.output_ms.models.Sale;
import com.grupo5.output_ms.repositories.SaleRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController

public class SaleController {

    private final SaleRepository saleRepository;

    public SaleController(SaleRepository saleRepository){
        this.saleRepository = saleRepository;
    }

    //crear una venta
    @PostMapping("/sale/")
    Sale newEvent(@RequestBody Sale sale){
        return saleRepository.save(sale);
    }

    //traer una venta especifica
    @GetMapping("/sale/{idsale}")
    Sale getEvent(@PathVariable String idsale){
        return saleRepository.findById(idsale)
                .orElseThrow(
                        () -> new SaleNotFoundException("No hay venta registrada como: " + idsale));
    }

    //eliminar una venta
    @DeleteMapping("/sale/{idsale}")
    void deleteSale(@PathVariable String idsale) {
        saleRepository.deleteById(idsale);
    }


}