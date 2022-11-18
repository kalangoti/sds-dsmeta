package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.entities.SaleEntity;
import com.devsuperior.dsmeta.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public List<SaleEntity> findSales() {
        return service.findSales();
    }
}
