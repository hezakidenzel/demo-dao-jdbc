package aplicaçao;

import java.util.Date;

import model.entidade.Department;
import model.entidade.Seller;

public class Programa {

	public static void main(String[] args) {
		
		Department obj = new Department(1,"Books");
		
		Seller seller = new Seller(21,"bob","bob@gmail.com",new Date(),3000.0,obj);
		System.out.println(obj);
		System.out.println(seller);

	}

}
