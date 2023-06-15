package com.example.BookMyShow.Repository;

import com.example.BookMyShow.dto.Model.TheaterSeatsEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TheaterSeatsRepository extends JpaRepository<TheaterSeatsEntity, Integer> {
}