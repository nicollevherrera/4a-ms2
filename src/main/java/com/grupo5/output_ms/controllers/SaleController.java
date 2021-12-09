package com.grupo5.output_ms.controllers;
import com.grupo5.output_ms.exceptions.SaleNotFoundException;
import com.grupo5.output_ms.models.Sale;
import com.grupo5.output_ms.repositories.SaleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
                        () -> new SaleNotFoundException("No existe una venta registrada con ID: " + idsale));
    }

    //traer todas las ventas
    @GetMapping("/sales/")
    List<Sale> listSale (){
        return saleRepository.findAll();
    }

    //traer una venta por status
   // @GetMapping ("/sale/{status}")
    //List<Sale> getStatus (@PathVariable String status){return saleRepository.findByStatus(status);}

    //traer ventas por nombre del evento
    //@GetMapping ("/sale/{event}")
    //List<Sale> getEvent(@PathVariable String event){return saleRepository.findByEvent(event);}

    //eliminar una venta
    @DeleteMapping("/sale/{idsale}")
    void deleteSale(@PathVariable String idsale) {
        saleRepository.deleteById(idsale);
    }

    //Actualizar un venta
    @PutMapping("/sale/{idsale}")
    Sale updateSale(@PathVariable String idsale, @RequestBody Sale new_sale){
        Sale old_sale = saleRepository.findById(idsale).orElse(null);
        old_sale.setPrice(new_sale.getPrice());
        old_sale.setQuantity(new_sale.getQuantity());
        old_sale.setStatus(new_sale.getStatus());
        old_sale.setEvent(new_sale.getEvent());
        return saleRepository.save(old_sale);
    }
}