package dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import model.Categorie;

@Named
public class CategorieJpaDao implements CategorieDao {

	@Inject
	private EntityManager entityManager;

	public CategorieJpaDao() { super(); }

	@Override
	public List<Categorie> findAll(int first, int size) {
		return entityManager.createNamedQuery("Categorie.findAll", Categorie.class)
				.setFirstResult(first).setMaxResults(size).getResultList();
	} // findAll

} // class CategorieJpaDao
