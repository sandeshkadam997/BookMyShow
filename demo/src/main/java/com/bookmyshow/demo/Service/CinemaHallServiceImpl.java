package com.bookmyshow.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyshow.demo.Entities.CinemaHall;
import com.bookmyshow.demo.Repository.CinemaHallRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {
	
	@Autowired
	private CinemaHallRepo cinemaHallRepo;

	@Override
	public CinemaHall getCinemaHallById(Integer cinemaHallId) {
		Optional<CinemaHall> optionalCinemaHall = this.cinemaHallRepo.findById(cinemaHallId);
	    if (optionalCinemaHall.isPresent()) {
	        return optionalCinemaHall.get();
	    } else {
	        throw new EntityNotFoundException("CinemaHall not found with id: " + cinemaHallId);
	}
	}

	@Override
	public List<CinemaHall> getAllCinemaHalls() {
		return this.cinemaHallRepo.findAll();
	}

	@Override
	public String createCinemaHall(CinemaHall cinemaHall) {
		this.cinemaHallRepo.save(cinemaHall);
		return "Cinema Saves successfully" ;
	}

	@Override
	public String updateCinemaHall(Integer cinemaHallId, CinemaHall cinemaHall) {
		 if (!cinemaHallRepo.existsById(cinemaHallId)) {
	            return "CinemaHall not found with id: " + cinemaHallId;
	        }
	        cinemaHall.setCinemaHallId(cinemaHallId); 
	        cinemaHallRepo.save(cinemaHall);
	    	return "CinemaHall Updated Successfully" ;
	}
	
	@Override
	public String deleteCinemaHall(Integer cinemaHallId) {
		 if (!cinemaHallRepo.existsById(cinemaHallId)) {
	            return "CinemaHall not found with id: " + cinemaHallId;
	        }
	        cinemaHallRepo.deleteById(cinemaHallId);
		return "CinemaHall Deleted Successfully" ;
	}
}

	