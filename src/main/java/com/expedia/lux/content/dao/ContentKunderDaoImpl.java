package com.expedia.lux.content.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.springframework.stereotype.Component;

@Component
public class ContentKunderDaoImpl implements ContentDAO {
	EntityManagerFactory entityManagerFactory;

	public EntityManager getEntityManager() {
		EntityManager em = entityManagerFactory.createEntityManager();
		return em;
	}

}
