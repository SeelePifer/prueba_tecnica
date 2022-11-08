package com.lfte.ejercicio.service;

import com.lfte.ejercicio.dto.response.ProductResponseDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public interface PricesService {
    ProductResponseDTO ProductWithPriceAndRate(Date date,
                                               Integer productId,
                                               Integer brandId);
}
