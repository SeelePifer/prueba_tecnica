package com.lfte.ejercicio.dto.response;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponseDTO {
    private Integer productId;
    private Integer brandId;
    private Integer priceList;
    private Date startDate;
    private Date endDate;
    private BigDecimal price;
}
