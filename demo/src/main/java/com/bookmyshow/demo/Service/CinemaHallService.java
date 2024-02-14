package com.bookmyshow.demo.Service;

import java.util.List;

import com.bookmyshow.demo.Entities.CinemaHall;

public interface CinemaHallService {
	
	    CinemaHall getCinemaHallById(Integer cinemaHallId);
	    List<CinemaHall> getAllCinemaHalls();
	    String createCinemaHall(CinemaHall cinemaHall);
	    String updateCinemaHall(Integer cinemaHallId, CinemaHall cinemaHall);
	    String deleteCinemaHall(Integer cinemaHallId);

}