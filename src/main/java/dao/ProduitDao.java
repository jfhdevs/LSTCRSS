package dao;

import java.util.List;

import model.Produit;

public interface ProduitDao {
	List<Produit> findAll(int first, int size);

} // interface ProduitsDao
