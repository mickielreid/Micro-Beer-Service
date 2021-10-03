package com.mickiel.MicroServiceBeerService.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {
    private UUID id;
    private  Integer version;

    private OffsetDateTime createdDate;
    private  OffsetDateTime lastModifiedDate;

    private String beerName;

    private  BeeStyleEnum beeStyleEnum;

    private long upc;

    private BigDecimal price;

    private Integer quantityOnHold;
}
