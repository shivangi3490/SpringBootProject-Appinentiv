package com.example.Appinentiv.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Appinentiv.model.Movie;
import com.example.Appinentiv.dao.MovieDao;
import com.example.Appinentiv.model.*;




@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieDao movieDao;
	
	@Transactional
	@Override
	public List<Movie> get() {
		
		return movieDao.get();
	}
	
	@Transactional
	@Override
	public Movie get(int id) {
		
		return movieDao.get(id);
	}

	@Transactional
	@Override
	public void save(Movie movie) {
		
		 movieDao.save(movie);		
	}

	@Transactional
	@Override
	public void delete(int id) {
		
		movieDao.delete(id);
	}	
}
