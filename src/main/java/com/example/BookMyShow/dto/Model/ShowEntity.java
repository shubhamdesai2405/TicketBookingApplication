package com.example.BookMyShow.dto.Model;




import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@EntityListeners(value = { AuditingEntityListener.class }) //doubt
@Table(name = "shows")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ShowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "show_date", columnDefinition = "DATE", nullable = false)
    private LocalDate showDate;

    @Column(name = "show_time", columnDefinition = "TIME", nullable = false)
    private LocalTime showTime;


    @CreationTimestamp //doubt
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;

    //Must required in DTO
    @ManyToOne
    @JsonIgnore
    private MovieEntity movie;


    //Must required ?
    @ManyToOne
    @JsonIgnore
    private TheaterEntity theater;

    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<TicketEntity> tickets;


    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowSeatsEntity> seats;

}