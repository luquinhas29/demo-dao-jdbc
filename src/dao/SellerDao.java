package dao;

import java.util.List;

import entities.Seller;

public interface SellerDao {

	void insert(Seller seller);
	void update(Seller seller);
	void deleteById(Integer id);
	Seller findByID(Integer id);
	List<Seller> findAll();
}
