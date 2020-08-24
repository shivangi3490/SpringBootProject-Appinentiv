package com.example.Appinentiv.service;

import java.util.List;

import com.example.Appinentiv.model.Movie;

public interface MovieService {
	
List<Movie> get();
	
	Movie get(int id);
	
	void save(Movie movie);
	
	void delete(int id);

}
