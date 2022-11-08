package com.lfte.ejercicio.controller;

import com.lfte.ejercicio.dto.response.ProductResponseDTO;
import com.lfte.ejercicio.service.PricesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import java.util.Date;


@RestController
public class PricesController {

    @Autowired
    PricesService pricesService;

    @GetMapping("/product")
    public ProductResponseDTO ProductWithPriceAndRate(@RequestParam(name = "date")
                                                      @DateTimeFormat(pattern = "yyyy-MM-dd")
                                                      Date date,
                                                      @RequestParam(name = "productId") Integer productId,
                                                      @RequestParam(name = "brandId") Integer brandId) {
        return pricesService.ProductWithPriceAndRate(date, productId, brandId);
    }

}
