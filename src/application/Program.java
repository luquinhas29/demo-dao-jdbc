package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1 : seller findByID ===");
		Seller seller = sellerDao.findByID(3);
		
		System.out.println(seller);
		

	}

}
