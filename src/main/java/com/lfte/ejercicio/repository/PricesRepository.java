package com.lfte.ejercicio.repository;

import com.lfte.ejercicio.dto.response.ProductResponseDTO;
import com.lfte.ejercicio.model.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Repository
public interface PricesRepository extends JpaRepository<Prices, Integer> {

    @Query("select p.productId, p.brandId, p.priceList, p.startDate, p.endDate, p.price  from Prices p where p.startDate = ?1 and p.productId = ?2 and p.brandId = ?3")
    ProductResponseDTO ProductWithPriceAndRate( Date date,
                                                 Integer productId,
                                                 Integer brandId);
}
