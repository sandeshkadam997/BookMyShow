package com.bookmyshow.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookmyshow.demo.Entities.Theatre;
import com.bookmyshow.demo.Service.TheatreService;

@RestController
@RequestMapping
public class TheatreController {
	
	@Autowired
	private TheatreService theatreService;
	
	 @GetMapping("/{id}")
	    public Theatre getTheatreById(@PathVariable Integer id) {
	        return theatreService.getTheatreById(id);
	    }

	    @GetMapping
	    public List<Theatre> getAllTheatres() {
	        return theatreService.getAllTheatres();
	    }

	    @PostMapping
	    public String createTheatre(@RequestBody Theatre theatre) {
	        return theatreService.createTheatre(theatre);
	    }

	    @PutMapping("/{id}")
	    public String updateTheatre(@PathVariable Integer id, @RequestBody Theatre theatre) {
	        return theatreService.updateTheatre(id, theatre);
	    }

	    @DeleteMapping("/{id}")
	    public String deleteTheatre(@PathVariable Integer id) {
	        return theatreService.deleteTheatre(id);
	    }

}
