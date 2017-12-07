package dao;

import java.util.List;

import model.Marchand;

public interface MarchandDao {
	List<Marchand> findAll(int first, int size);

} // interface MarchandDao
