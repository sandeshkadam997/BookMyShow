package com.bookmyshow.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmyshow.demo.Entities.CinemaHall;

public interface CinemaHallRepo extends JpaRepository<CinemaHall,Integer> {

}
