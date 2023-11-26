package application;

import java.util.Date;

import entities.Department;
import entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department department = new Department(1, "Books");
		Seller seller = new Seller(21, "Lucas", "lucas@gmail.com", new Date(), 3000.00, department);
		System.out.println(seller);

	}

}
