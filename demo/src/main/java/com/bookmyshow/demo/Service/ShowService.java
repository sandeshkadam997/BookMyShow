package com.bookmyshow.demo.Service;

import java.util.List;


import com.bookmyshow.demo.Entities.Show;

public interface ShowService {

	    Show getShowById(Integer showId);
	    List<Show> getAllShows();
	    String createShow(Show show);
	    String updateShow(Integer showId, Show show);
	    String deleteShow(Integer showId);
	}


