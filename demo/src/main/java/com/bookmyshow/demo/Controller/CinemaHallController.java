package com.bookmyshow.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookmyshow.demo.Entities.CinemaHall;
import com.bookmyshow.demo.Service.CinemaHallService;

@RestController
@RequestMapping("cinemaHall")
public class CinemaHallController {
	
	 @Autowired
	    private CinemaHallService cinemaHallService;

	    @GetMapping("/{id}")
	    public CinemaHall getCinemaHallById(@PathVariable Integer cinemaHallId) {
	    	return this.cinemaHallService.getCinemaHallById(cinemaHallId);
	    }
	    
	    @GetMapping
	    public List<CinemaHall> getAllCinemaHalls() {
	       return this.cinemaHallService.getAllCinemaHalls();
	    }

	    @PostMapping
	    public String createCinemaHall(@RequestBody CinemaHall cinemaHall) {
	        return this.cinemaHallService.createCinemaHall(cinemaHall);
	    }

	    @PutMapping("/{id}")
	    public String updateCinemaHall(@PathVariable Integer id, @RequestBody CinemaHall cinemaHall) {
	       return this.cinemaHallService.updateCinemaHall(id, cinemaHall);
	    }

	    @DeleteMapping("/{id}")
	    public String deleteCinemaHall(@PathVariable Integer id) {
	    	 return cinemaHallService.deleteCinemaHall(id);
	    }
	
	
	
	

}
