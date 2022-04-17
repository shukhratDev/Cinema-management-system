package com.company.cinema_management_system.entity.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentDto {
    private String cardNumber;
    private Date expireDate;
    private Integer securityCode;
    private double totalAmountOfMoney;
}
