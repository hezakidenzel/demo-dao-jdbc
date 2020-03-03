package model.Dao;

import java.util.List;

import model.entidade.Seller;

public interface SellerDao {
	
	void insert (Seller obj);
	void update (Seller obj);
	void deleteById(Integer ind);
	Seller findById(Integer id);
	List<Seller> findAll();

}
