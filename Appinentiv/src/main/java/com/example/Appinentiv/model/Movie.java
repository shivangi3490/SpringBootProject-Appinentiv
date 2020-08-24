package com.example.Appinentiv.model;
/*Data model class.
use to map table/data from DB*/


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.NamedAttributeNode;
import javax.persistence.Table;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Table(name="movietable")
public class Movie {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer Id;	
	private String movie_title;	
	private String category;	
	private float rating;
	
	public Movie() {
		
	}
	public Movie(Integer id, String movie_title, String category, float rating) {
		super();
		Id = id;
		this.movie_title = movie_title;
		this.category = category;
		this.rating = rating;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [Id=" + Id + ", movie_title=" + movie_title + ", category=" + category + ", rating=" + rating
				+ "]";
	}
}
