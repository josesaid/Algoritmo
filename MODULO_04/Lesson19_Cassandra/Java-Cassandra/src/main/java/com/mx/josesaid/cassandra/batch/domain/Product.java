package com.mx.josesaid.cassandra.batch.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author josesaidolanogarcia
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private UUID productId;
    private UUID variantId;
    private String productName;
    private String description;
    private float price;

}
