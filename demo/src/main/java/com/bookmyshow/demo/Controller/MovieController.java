package com.bookmyshow.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookmyshow.demo.Entities.Movie;
import com.bookmyshow.demo.Service.MovieService;

@RestController
@RequestMapping("movies")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	 @GetMapping("/{id}")
	    public Movie getMovieById(@PathVariable Integer id) {
	       return this.movieService.getMovieById(id);
	    }

	    @GetMapping
	    public List<Movie> getAllMovies() {
	        return this.movieService.getAllMovies();
	    }

	    @PostMapping
	    public String createMovie(@RequestBody Movie movie) {
	        return this.movieService.createMovie(movie);
	    }

	    @PutMapping("/{id}")
	    public String updateMovie(@PathVariable Integer id, @RequestBody Movie movie) {
	       return this.movieService.updateMovie(id, movie);
	    }

	    @DeleteMapping("/{id}")
	    public String deleteMovie(@PathVariable Integer id) {
	       return this. movieService.deleteMovie(id);
	    }
	}
		
