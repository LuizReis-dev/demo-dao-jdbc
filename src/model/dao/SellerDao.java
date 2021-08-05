package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	void insert(Seller obj);
	void update(Seller ob);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
