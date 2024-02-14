package com.bookmyshow.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmyshow.demo.Entities.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
