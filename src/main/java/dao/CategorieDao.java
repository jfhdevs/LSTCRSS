package dao;

import java.util.List;

import model.Categorie;

public interface CategorieDao {
	List<Categorie> findAll();
	List<Categorie> findAll(int first, int size);

} // interface CategorieDao
