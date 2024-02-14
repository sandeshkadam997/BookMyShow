package com.bookmyshow.demo.Service;

import java.util.List;

import com.bookmyshow.demo.Entities.Theatre;

public interface TheatreService {
	
	    Theatre getTheatreById(Integer theatreId);
	    List<Theatre> getAllTheatres();
	   String createTheatre(Theatre theatre);
	   String updateTheatre(Integer theatreId, Theatre theatre);
	   String deleteTheatre(Integer theatreId);
	}



