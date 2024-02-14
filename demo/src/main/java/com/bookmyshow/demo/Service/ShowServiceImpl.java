package com.bookmyshow.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyshow.demo.Entities.Show;
import com.bookmyshow.demo.Repository.ShowRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ShowServiceImpl implements ShowService{
	
	@Autowired
	private ShowRepo showRepo;

	@Override
	public Show getShowById(Integer showId) {
		Optional<Show> optionalShow = showRepo.findById(showId);
	    if (optionalShow.isPresent()) {
	        return optionalShow.get();
	    } else {
	        throw new EntityNotFoundException("Show not found with id: " + showId);
	    }
	}

	@Override
	public List<Show> getAllShows() {
	    return showRepo.findAll();
	}

	@Override
	public String createShow(Show show) {
	 showRepo.save(show);
	 return "Show Created Successfully";
	}

	@Override
	public String updateShow(Integer showId, Show show) {
		 if (!showRepo.existsById(showId)) {
	            throw new EntityNotFoundException("Show not found with id: " + showId);
	        }
	        show.setShowId(showId); // Ensure the provided ID matches the entity's ID
	         showRepo.save(show);
		return "Show Updated Successfully";
	}

	@Override
	public String deleteShow(Integer showId) {
		 if (!showRepo.existsById(showId)) {
	            throw new EntityNotFoundException("Show not found with id: " + showId);
	        }
	        showRepo.deleteById(showId);
		return "Show Deleted Successfully";
	}

}
