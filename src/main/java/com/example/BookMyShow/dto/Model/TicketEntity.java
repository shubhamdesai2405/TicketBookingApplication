package com.example.BookMyShow.dto.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@EntityListeners(value = { AuditingEntityListener.class })
@Table(name = "tickets")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "alloted_seats", nullable = false)
    private String allottedSeats;

    @Column(name = "amount", nullable = false)
    private double amount;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "booked_at", nullable = false)
    private Date bookedAt;

    @ManyToOne
    @JsonIgnore
    @JoinColumn
    private UserEntity user;

    @ManyToOne
    @JsonIgnore
    @JoinColumn
    private ShowEntity show;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowSeatsEntity> seats;
}