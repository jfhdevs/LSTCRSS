package dao;

import java.util.List;

import model.Produit;

public interface ProduitsDao {
	List<Produit> findAll(int first, int size);

} // interface ProduitsDao
