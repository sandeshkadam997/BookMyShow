package com.bookmyshow.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyshow.demo.Entities.Theatre;
import com.bookmyshow.demo.Repository.TheatreRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TheatreServiceImpl implements TheatreService{

	   @Autowired
	    private TheatreRepo theatreRepo;
	   
	@Override
	public Theatre getTheatreById(Integer theatreId) {
		 Optional<Theatre> optionalTheatre = theatreRepo.findById(theatreId);
		    if (optionalTheatre.isPresent()) {
		        return optionalTheatre.get();
		    } else {
		        throw new EntityNotFoundException("Theatre not found with id: " + theatreId);
		    }
		}

	@Override
	public List<Theatre> getAllTheatres() {
		 return theatreRepo.findAll();
	}

	@Override
	public String createTheatre(Theatre theatre) {
		 theatreRepo.save(theatre);
		return "Threatre Create Successfully";
	}

	@Override
	public String updateTheatre(Integer theatreId, Theatre theatre) {
		 if (!theatreRepo.existsById(theatreId)) {
	            throw new EntityNotFoundException("Theatre not found with id: " + theatreId);
	        }
	        theatre.setTheatreId(theatreId); // Ensure the provided ID matches the entity's ID
	       theatreRepo.save(theatre);
	       return "Threatre Updated Successfully";
	    }


	@Override
	public String deleteTheatre(Integer theatreId) {
		 if (!theatreRepo.existsById(theatreId)) {
	            throw new EntityNotFoundException("Theatre not found with id: " + theatreId);
	        }
	        theatreRepo.deleteById(theatreId);
	        return "Threatre Deleted Successfully";
	    }
		
	}

