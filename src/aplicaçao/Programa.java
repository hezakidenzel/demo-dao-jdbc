package aplicaçao;

import java.util.Date;

import model.Dao.DaoFactory;
import model.Dao.SellerDao;
import model.entidade.Department;
import model.entidade.Seller;

public class Programa {

	public static void main(String[] args) {
		

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1 seller findbyid===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
