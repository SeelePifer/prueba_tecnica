package com.lfte.ejercicio.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRICE_LIST")
    private Integer priceList;

    @Column(name = "BRAND_ID")
    private Integer brandId;
    @Column(name = "START_DATE")
    private Date startDate;
    @Column(name = "PRICE")
    private BigDecimal price;
    @Column(name = "CURR")
    private String curr;
    @Column(name = "END_DATE")
    private Date endDate;
    @Column(name = "PRODUCT_ID")
    private Integer productId;
    @Column(name = "PRIORITY")
    private Integer priority;


}
