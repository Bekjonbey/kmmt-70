package org.example.kmmt70.telegramBot.dto;

import lombok.Data;

@Data
public class ProblemCreateDto {
    private Long allProductCount1;
    private Long allProductCount2;

    private Double permanentCost1;
    private Double permanentCost2;

    private Double changeableCost1;
    private Double changeableCost2;
}
