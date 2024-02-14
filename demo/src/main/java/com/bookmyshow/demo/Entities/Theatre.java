package com.bookmyshow.demo.Entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Theatre {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer theatreId;
	    private String name;
	    private String location;
	    
//	    @OneToMany(cascade = CascadeType.ALL)
//	    @JoinColumn(name="show_id")
//	    private List<Show> show;
	    
		public Integer getTheatreId() {
			return theatreId;
		}
		public void setTheatreId(Integer theatreId) {
			this.theatreId = theatreId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public Theatre(Integer theatreId, String name, String location) {
			super();
			this.theatreId = theatreId;
			this.name = name;
			this.location = location;
		}
		public Theatre() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Theatre [theatreId=" + theatreId + ", name=" + name + ", location=" + location + "]";
		}
	    
	    

}
