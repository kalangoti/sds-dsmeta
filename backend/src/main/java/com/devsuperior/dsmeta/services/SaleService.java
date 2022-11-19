package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.entities.SaleEntity;
import com.devsuperior.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public Page<SaleEntity> findSales(String minDate, String maxDate, Pageable pageable) {

        LocalDate today = LocalDate.now();

        LocalDate min = minDate.equals("") ? today.minusYears(1) : LocalDate.parse(minDate);
        LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

        return repository.findSales(min, max, pageable);
    }
}
