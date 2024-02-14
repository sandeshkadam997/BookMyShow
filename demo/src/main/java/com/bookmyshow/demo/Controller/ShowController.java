package com.bookmyshow.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookmyshow.demo.Entities.Show;
import com.bookmyshow.demo.Service.ShowService;

@RestController
@RequestMapping("show")
public class ShowController {
	
	@Autowired
	private ShowService showService;
	
	@GetMapping("/{id}")
    public Show getShowById(@PathVariable Integer id) {
       return this.showService.getShowById(id);
    }

    @GetMapping
    public List<Show> getAllShows() {
    	return this.showService.getAllShows();
    }

    @PostMapping
    public String createShow(@RequestBody Show show) {
    	 return this.showService.createShow(show);
    }

    @PutMapping("/{id}")
    public String updateShow(@PathVariable Integer id, @RequestBody Show show) {
        return this.showService.updateShow(id, show);
    }

    @DeleteMapping("/{id}")
    public String deleteShow(@PathVariable Integer id) {
       return this.showService.deleteShow(id);
    }
}

