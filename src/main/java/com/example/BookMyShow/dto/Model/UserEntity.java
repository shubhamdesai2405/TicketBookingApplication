package com.example.BookMyShow.dto.Model;
import jakarta.persistence.*;
import lombok.*;


import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "users")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) //bidirectional mapping
    private List<TicketEntity> ticketEntities;

}