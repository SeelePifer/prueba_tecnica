package com.lfte.ejercicio.service;


import com.lfte.ejercicio.dto.response.ProductResponseDTO;
import com.lfte.ejercicio.model.Prices;
import com.lfte.ejercicio.repository.PricesRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.Date;
import java.time.LocalDate;


import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class PriceServiceTest {

    @Mock
    PricesRepository pricesRepository;

    @InjectMocks
    PricesServiceImpl pricesService;

    @Test
    public void requestAt10AndDay14byBrand1AndProduct35455(){
        Prices priceExample = Prices.builder()
                .brandId(1)
                .startDate(Date.valueOf(LocalDate.of(20200, 02, 14)))
                .productId(35455)
                .build();


        ProductResponseDTO productResponseDTO = ProductResponseDTO.builder().
                productId(priceExample.getProductId())
                .startDate(priceExample.getStartDate())
                .brandId(priceExample.getBrandId())
                .build();
        when(pricesRepository.ProductWithPriceAndRate(priceExample.getStartDate(),
                priceExample.getProductId(),
                priceExample.getBrandId())).thenReturn(productResponseDTO);

        final var actual = pricesService.ProductWithPriceAndRate(priceExample.getStartDate(),
                priceExample.getProductId(),
                priceExample.getBrandId());

        Assertions.assertThat(actual).usingRecursiveComparison().isEqualTo(productResponseDTO);
    }
    @Test
    public void requestAt16AndDay14byBrand1AndProduct35455(){
        Prices priceExample = Prices.builder()
                .brandId(1)
                .startDate(Date.valueOf(LocalDate.of(2022,02, 14)))
                .productId(35455)
                .build();
        ProductResponseDTO productResponseDTO = ProductResponseDTO.builder().
                productId(priceExample.getProductId())
                .startDate(priceExample.getStartDate())
                .brandId(priceExample.getBrandId())
                .build();
        when(pricesRepository.ProductWithPriceAndRate(priceExample.getStartDate(),
                priceExample.getProductId(),
                priceExample.getBrandId())).thenReturn(productResponseDTO);

        final var actual = pricesService.ProductWithPriceAndRate(priceExample.getStartDate(),
                priceExample.getProductId(),
                priceExample.getBrandId());

        Assertions.assertThat(actual).usingRecursiveComparison().isEqualTo(productResponseDTO);
    }
    @Test
    public void requestAt21AndDay14byBrand1AndProduct35455(){
        Prices priceExample = Prices.builder()
                .brandId(1)
                .startDate(Date.valueOf(LocalDate.of(2022,02, 14)))
                .productId(35455)
                .build();
        ProductResponseDTO productResponseDTO = ProductResponseDTO.builder().
                productId(priceExample.getProductId())
                .startDate(priceExample.getStartDate())
                .brandId(priceExample.getBrandId())
                .build();
        when(pricesRepository.ProductWithPriceAndRate(priceExample.getStartDate(),
                priceExample.getProductId(),
                priceExample.getBrandId())).thenReturn(productResponseDTO);

        final var actual = pricesService.ProductWithPriceAndRate(priceExample.getStartDate(),
                priceExample.getProductId(),
                priceExample.getBrandId());

        Assertions.assertThat(actual).usingRecursiveComparison().isEqualTo(productResponseDTO);
    }

    @Test
    public void requestAt10AndDay15byBrand1AndProduct35455(){
        Prices priceExample = Prices.builder()
                .brandId(1)
                .startDate(Date.valueOf(LocalDate.of(2022,02, 15)))
                .productId(35455)
                .build();
        ProductResponseDTO productResponseDTO = ProductResponseDTO.builder().
                productId(priceExample.getProductId())
                .startDate(priceExample.getStartDate())
                .brandId(priceExample.getBrandId())
                .build();
        when(pricesRepository.ProductWithPriceAndRate(priceExample.getStartDate(),
                priceExample.getProductId(),
                priceExample.getBrandId())).thenReturn(productResponseDTO);

        final var actual = pricesService.ProductWithPriceAndRate(priceExample.getStartDate(),
                priceExample.getProductId(),
                priceExample.getBrandId());

        Assertions.assertThat(actual).usingRecursiveComparison().isEqualTo(productResponseDTO);
    }
    @Test
    public void requestAt21AndDay16byBrand1AndProduct35455(){
        Prices priceExample = Prices.builder()
                .brandId(1)
                .startDate(Date.valueOf(LocalDate.of(2022,02, 16)))
                .productId(35455)
                .build();
        ProductResponseDTO productResponseDTO = ProductResponseDTO.builder().
                productId(priceExample.getProductId())
                .startDate(priceExample.getStartDate())
                .brandId(priceExample.getBrandId())
                .build();
        when(pricesRepository.ProductWithPriceAndRate(priceExample.getStartDate(),
                priceExample.getProductId(),
                priceExample.getBrandId())).thenReturn(productResponseDTO);

        final var actual = pricesService.ProductWithPriceAndRate(priceExample.getStartDate(),
                priceExample.getProductId(),
                priceExample.getBrandId());

        Assertions.assertThat(actual).usingRecursiveComparison().isEqualTo(productResponseDTO);
    }
}
