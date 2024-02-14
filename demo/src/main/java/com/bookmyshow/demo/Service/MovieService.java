package com.bookmyshow.demo.Service;

import java.util.List;

import com.bookmyshow.demo.Entities.Movie;

public interface MovieService {
	
	    List<Movie> getAllMovies();
	    Movie getMovieById(Integer id);
	    String createMovie(Movie movie);
	    String updateMovie(Integer id, Movie movie);
	    String deleteMovie(Integer id);
	}

