package com.bookmyshow.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmyshow.demo.Entities.Theatre;

public interface TheatreRepo extends JpaRepository<Theatre, Integer>{

}
