package com.grupo5.output_ms.controllers;

import com.grupo5.output_ms.repositories.SaleRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaleController {
    private final SaleRepository saleRepository;

    public SaleController(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }
}
