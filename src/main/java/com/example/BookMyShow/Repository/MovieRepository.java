package com.example.BookMyShow.Repository;

import com.example.BookMyShow.dto.Model.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {

    boolean existsByName(String name);
}