package dao;

import java.util.List;

import model.Produit;

public interface ProduitDao {
	List<Produit> findAllProduits(int first, int size);

} // interface ProduitsDao
