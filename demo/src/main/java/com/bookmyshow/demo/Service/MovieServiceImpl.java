package com.bookmyshow.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyshow.demo.Entities.Movie;
import com.bookmyshow.demo.Repository.MovieRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepo movieRepo;

	@Override
	public List<Movie> getAllMovies() {
		return this.movieRepo.findAll();
	}

	@Override
	public Movie getMovieById(Integer id) {
	    Optional <Movie> optionalMovie = movieRepo.findById(id);
	    if (optionalMovie.isPresent()) {
	        return optionalMovie.get();
	    } else {
	        throw new EntityNotFoundException("Movie not found with id: " + id);
	    }
	}
	

	@Override
	public String createMovie(Movie movie) {
		this.movieRepo.save(movie);		
		return "Movie Saved Successfully";
	}

	@Override
	public String updateMovie(Integer id, Movie movie) {
	      if (!movieRepo.existsById(id)) {
	            throw new EntityNotFoundException("Movie not found with id: " + id);
	        }
	        movie.setMovieId(id);
	        movieRepo.save(movie);
		return "Movie Updated Successfully" ;
	}

	@Override
	public String deleteMovie(Integer id) {
		  if (!movieRepo.existsById(id)) {
	            throw new EntityNotFoundException("Movie not found with id: " + id);
	        }
	        movieRepo.deleteById(id);
		return "Movie Deleted Successfully";
	}

}
