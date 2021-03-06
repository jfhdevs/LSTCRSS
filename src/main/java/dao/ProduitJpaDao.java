package dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import model.Produit;

@Named
public class ProduitJpaDao implements ProduitDao {

	@Inject
	private EntityManager entityManager;

	public ProduitJpaDao() { super(); }

	@Override
	public List<Produit> findAllProduits(int first, int size) {
		return entityManager.createNamedQuery("Produit.findAll", Produit.class)
				.setFirstResult(first).setMaxResults(size).getResultList();
	} // findAll
	
} // class ProduitJpaDao
