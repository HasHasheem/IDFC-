package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Stddto;



public class Stddao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insert(Stddto dto) {
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
}
	public Stddto fetch(int id) {
	Stddto stddto=entityManager.find(Stddto.class, id);
		return stddto;
	}
}
