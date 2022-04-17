package com.company.cinema_management_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Film {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer numberOfTicketsSold;
    private Long durationInMillis;
    private LocalDateTime beginDate;
    @ManyToOne
    private Hall hall;
    private String description;
    private double price;
}
