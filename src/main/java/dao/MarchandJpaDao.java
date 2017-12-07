package dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import model.Marchand;

@Named
public class MarchandJpaDao implements MarchandDao {

	@Inject
	private EntityManager entityManager;

	public MarchandJpaDao() { super(); }

	@Override
	public List<Marchand> findAll(int first, int size) {
		return entityManager.createNamedQuery("Marchand.findAll", Marchand.class)
				.setFirstResult(first).setMaxResults(size).getResultList();
	} // findAll

} // class MarchandJpaDao
