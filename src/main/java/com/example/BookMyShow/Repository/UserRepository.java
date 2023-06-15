package com.example.BookMyShow.Repository;

import com.example.BookMyShow.dto.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}