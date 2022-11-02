package com.qac.shopping;

import java.util.Scanner;

public class GroceryShopDAO {
	
	 /*boolean   AddProduct(productdto)
     String removeProductByCompanyName(productName,companyName)

Treeset getAllProductByCompanyName(companyName)

HashSet getAllProductBynameofproduct(nameofproduct)

Int totalNumberOfProduct()

List getAllVegProduct()

Linkedlist getAllNonVegProduct()

Void showAllProduct()*/
	
	public void usecase() 
	{
		System.out.println("Bro, Just stay out of Admin Panel You are hacker");
		System.out.println("Go and Order Some thing to Eat");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Products pro = new Products();
		AddressDTO dto = new AddressDTO();
		GroceryShopDAO gsd = new GroceryShopDAO();
		
		String UserName = "admin";
		String Password = "pass";
		
		
		
		System.out.println("Aunthecate Your self or else you will be user");
		System.out.println("Enter Username");
		String uname= sc.nextLine(); 
		if(uname.equals(UserName)) 
		{
			System.out.println("Enter Password");
			String pname= sc.nextLine(); 
			if(pname.equals(Password)) 
			{
				System.out.println("Sucessfully Authenticated!...");
				System.out.println("Welcome Admin!");
			}else 
			{
				gsd.usecase();
			}
		}else 
		{
			gsd.usecase();
		}
		System.out.println("---------------------------------------");
		
		pro.ChooseAccoToProductSel();
		dto.ClientSideData();
	}

}
