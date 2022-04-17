package com.company.cinema_management_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @ManyToOne
    private Film film;
    private LocalDateTime bookingDate;
    @OneToOne
    private Seat seat;
    private LocalDateTime filmDate;
    private LocalDateTime sessionDate;
    private boolean isPaid;
}
