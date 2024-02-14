package com.bookmyshow.demo.Entities;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
public class Show {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer showId;
		@Column(name = "show_Price")
		private Integer showPrice;
		
		@ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "movie_id")
	    private Movie movie;
	    
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "theatre_Id",referencedColumnName = "theatreId")
	    private Theatre theatre;
	    
		
		public Integer getShowId() {
			return showId;
		}

		public void setShowId(Integer showId) {
			this.showId = showId;
		}

		

		public Integer getShowPrice() {
			return showPrice;
		}

		public void setShowPrice(Integer showPrice) {
			this.showPrice = showPrice;
		}

		public Movie getMovie() {
			return movie;
		}

		public void setMovie(Movie movie) {
			this.movie = movie;
		}

		public Theatre getTheatre() {
			return theatre;
		}

		public void setTheatre(Theatre theatre) {
			this.theatre = theatre;
		}
		
		public Show(Integer showId, Date startTime, Date endTime, Movie movie, Theatre theatre) {
			super();
			this.showId = showId;
			
			this.movie = movie;
			this.theatre = theatre;
		}

		public Show() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Show [showId=" + showId + ", showPrice=" + showPrice + ", movie=" + movie + ", theatre=" + theatre
					+ "]";
		}
		
	  
	  
}
