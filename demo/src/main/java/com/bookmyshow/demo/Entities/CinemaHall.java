package com.bookmyshow.demo.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class CinemaHall {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer cinemaHallId;
	    private String name;
	    private int capacity;
	    
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "theatre_id")
	    private Theatre theatre;
	    
	    @OneToMany(cascade = CascadeType.ALL)
	    private List<Show> showId;
	    
		public Integer getCinemaHallId() {
			return cinemaHallId;
		}
		
		public void setCinemaHallId(Integer cinemaHallId) {
			this.cinemaHallId = cinemaHallId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		

		public CinemaHall(Integer cinemaHallId, String name, int capacity) {
			super();
			this.cinemaHallId = cinemaHallId;
			this.name = name;
			this.capacity = capacity;
		
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		public CinemaHall() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "CinemaHall [cinemaHallId=" + cinemaHallId + ", name=" + name + ", capacity=" + capacity
					+  "]";
		}
	    
		
	    
		
		

}
