package com.example.Appinentiv.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Appinentiv.model.Movie;
/*this is Dao Implemetaion class 
*we use right business logic to get and update DB 
*using MySQL DB.
*/

@Repository()
public class MovieDaoImpl implements MovieDao  {

	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<Movie> get() {
		
		Session session = entityManager.unwrap(Session.class);
		Query<Movie> query = session.createQuery(" from Movie ",Movie.class);
		List list = query.getResultList();	
		System.out.println("movie list "+list.size());
		return list;
	}

	@Override
	public Movie get(int id) {
		Session getSession = entityManager.unwrap(Session.class);
		Movie movieById = getSession.get(Movie.class, id);		
		return movieById;
	}

	@Override
	public void save(Movie movie) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(movie);
	}

	@Override
	public void delete(int id) {
		
		Session session = entityManager.unwrap(Session.class);
		Movie movieObj = session.get(Movie.class, id);
		session.delete(movieObj);
	}
}