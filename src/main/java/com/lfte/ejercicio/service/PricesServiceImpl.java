package com.lfte.ejercicio.service;

import com.lfte.ejercicio.dto.response.ProductResponseDTO;
import com.lfte.ejercicio.repository.PricesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


@Service
public class PricesServiceImpl implements PricesService {

    @Autowired
    private PricesRepository pricesRepository;
    @Override
    public ProductResponseDTO ProductWithPriceAndRate(Date date, Integer productId, Integer brandId) {
        return pricesRepository.ProductWithPriceAndRate(date, productId, brandId);
    }
}
