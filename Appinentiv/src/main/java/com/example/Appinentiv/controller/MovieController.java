package com.example.Appinentiv.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Appinentiv.dao.MovieDao;
import com.example.Appinentiv.model.Movie;
import com.example.Appinentiv.service.MovieServiceImpl;

@RestController
@RequestMapping("/api")
public class MovieController {
	
	@Autowired
	private MovieServiceImpl movieService;
	
	
	//To get all the records of Movie from Database
	@GetMapping("/allMovie")
	public List<Movie> getAllMovie(){
		//return (List<Movie>) movieDao.findAll();
		return movieService.get();
	}
		
	//To add movie record in DB.
	@PostMapping("/addMovie")
	public Movie addMovie(@RequestBody Movie movie) {
		 movieService.save(movie);
		 return movie;
	}
	
	//To get single record from DB based on id.
	@GetMapping("/Movie/{id}")
	public Movie getMovieById(@PathVariable int id) {
		Movie movieObj = movieService.get(id);
		if(movieObj == null ) {
			throw new RuntimeException("record with id = "+id+" not present in DB");
		}
		return movieObj;
	}
	
	//delete record from DB
	@DeleteMapping("/deleteMovie/{id}")
	public String deleteMovie(@PathVariable int id) {
		movieService.delete(id);
		return "record for "+id+" is deleted";
	}
	
	//Update existing record in DB.
	@PutMapping("/Movie")
	public Movie UpdateMovie(@RequestBody Movie movie) {
		movieService.save(movie);
		return movie;
		
	}
	
}
