package com.amigoscode.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FraudCheckHistoryDto {
    private boolean isFraudster;
}
