package com.devanshu.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devanshu.model.Alien;
import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

import jakarta.transaction.Transactional;

@Component
public class AlienDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Transactional
	public List<Alien> getAliens(){
		Session session = sessionFactory.getCurrentSession();
		List<Alien> aliens = session.createQuery("FROM Alien" , Alien.class).list();
		return aliens;
	}
	
	@Transactional
	public void addAlien(Alien a) {
		Session session = sessionFactory.getCurrentSession();
		session.save(a);
	}
	
	@Transactional
	public Alien getAlien(int aid) {
		Session session = sessionFactory.getCurrentSession();
		Alien a = session.get(Alien.class , aid);
		return a;
	}
}
