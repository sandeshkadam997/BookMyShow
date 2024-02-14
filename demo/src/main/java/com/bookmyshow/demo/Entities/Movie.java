package com.bookmyshow.demo.Entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Movie {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer movieId;
	    private String title;
	    private String description;
	    private int durationInMins;
	    private String language;
	    private String country;
	    private String genre;
	    
		public Integer getMovieId() {
			return movieId;
		}
		public void setMovieId(Integer movieId) {
			this.movieId = movieId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getDurationInMins() {
			return durationInMins;
		}
		public void setDurationInMins(int durationInMins) {
			this.durationInMins = durationInMins;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
	
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public Movie(Integer movieId, String title, String description, int durationInMins, String language,
				 String country, String genre) {
			super();
			this.movieId = movieId;
			this.title = title;
			this.description = description;
			this.durationInMins = durationInMins;
			this.language = language;
			this.country = country;
			this.genre = genre;
		}
		public Movie() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Movie [movieId=" + movieId + ", title=" + title + ", description=" + description
					+ ", durationInMins=" + durationInMins + ", language=" + language +  ", country=" + country + ", genre=" + genre + "]";
		}
	    
	    

}
