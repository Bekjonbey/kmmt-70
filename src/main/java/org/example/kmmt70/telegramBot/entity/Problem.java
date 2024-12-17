package org.example.kmmt70.telegramBot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "problems")
public class Problem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_date")
    @CreatedDate
    private LocalDateTime createdDate;

    @Column(name = "updated_date")
    @LastModifiedDate
    private LocalDateTime updatedDate;

    private Long allProductCount1;
    private Long allProductCount2;
    private Long allProductCountDifference;//allProductCount1 - allProductCount2

    private Double permanentCost1;
    private Double permanentCost2;
    private Double permanentCostDifference;

    private Double changeableCost1;
    private Double changeableCost2;
    private Double changeableCostDifference;

    private Double totalCost1;//changeableCost1 + permanentCost1
    private Double totalCost2;
    private Double totalCostDifference;

    private Double changeableCostProductRatio1;//changeableCost1 / allProductCount1
    private Double changeableCostProductRatio2;
    private Double changeableCostProductRatioDifference;

    private Double permanentCostProductRatio1;//permanentCost1 / allProductCount1
    private Double permanentCostProductRatio2;
    private Double permanentCostProductRatioDifference;

    private Double ratioPrice1;//changeableCostProductRatio1 + permanentCostProductRatio1
    private Double ratioPrice2;
    private Double ratioPriceDifference;

    private Double row1Result;
    private Double row2Result;
    private Double row3Result;
    private Double row4Result;

    private Double effect1;
    private Double effect2;
    private Double effect3;

}
