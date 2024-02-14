package com.bookmyshow.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmyshow.demo.Entities.Show;

public interface ShowRepo extends JpaRepository<Show, Integer> {

}
