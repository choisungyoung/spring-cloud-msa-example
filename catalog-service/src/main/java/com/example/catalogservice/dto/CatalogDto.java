package com.example.catalogservice.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CatalogDto implements Serializable {
    private String productId;
    private String qty;
    private String unitPrice;
    private String totalPrice;
    private String orderId;
    private String userId;
}
