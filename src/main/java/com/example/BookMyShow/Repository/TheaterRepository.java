package com.example.BookMyShow.Repository;

import com.example.BookMyShow.dto.Model.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {
}