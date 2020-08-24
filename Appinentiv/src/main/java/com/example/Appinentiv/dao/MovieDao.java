package com.example.Appinentiv.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Appinentiv.model.Movie;

public interface MovieDao  {
	List<Movie> get();
	
	Movie get(int id);
	
	void save(Movie movie);
	
	void delete(int id);
}
