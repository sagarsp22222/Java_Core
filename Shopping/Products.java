package com.qac.shopping;
import java.util.Scanner;

public class Products {
	
	int item;
	
	/*public void QtySelection() 
	   {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Select How Much You Need:");
		   int Foodqty = sc.nextInt();              //reads int
			int qty = Foodqty;
			System.out.println("You have Selected"+qty);
	   }*/
	public void ChooseAccoToProductSel() 
	{
		System.out.println("Select Your Food To Order");
		System.out.println("1.Gulam jamun");
		System.out.println("2.Ras Gulla");
		System.out.println("3.Marshmallow");
		System.out.println("4.Jalebi");
		
		ProductDTO dto = new ProductDTO();
		Scanner sc = new Scanner(System.in); //System.in is a standard input stream  
		
		System.out.print("Enter the Choice: ");  
		int Foodid = sc.nextInt();              //reads int
		int item = Foodid;
		
		if(item == 1) 
		{
			System.out.println("Gulam jamun");
			int qty = 5;
			dto.setQty(qty);
			System.out.println("Total Quantity:"+qty);
			//Scanner sc = new Scanner(System.in);
			   System.out.println("Select How Much You Need:");
			   int Foodqty = sc.nextInt();              //reads int
				int fooditemqty = Foodqty;
				System.out.println("You have Selected:"+fooditemqty);
				System.out.println("You Need"+qty+" Gulam jamun");
		}else if(item == 2) 
		{
			System.out.println("Ras Gulla");
			int qty = 3;
			dto.setQty(qty);
			System.out.println("Total Quantity:"+qty);
			System.out.println("Select How Much You Need:");
			   int Foodqty = sc.nextInt();              //reads int
				int fooditemqty = Foodqty;
				System.out.println("You have Selected:"+fooditemqty);
				System.out.println("You Need"+qty+" Ras Gulla");
		}else if(item == 3) 
		{
			System.out.println("Marshmallow");
			int qty = 8;
			dto.setQty(qty);
			System.out.println("Total Quantity:"+qty);
			System.out.println("Select How Much You Need:");
			   int Foodqty = sc.nextInt();              //reads int
				int fooditemqty = Foodqty;
				System.out.println("You have Selected:"+fooditemqty);
				System.out.println("You Need"+qty+" Marshmallow");
		}else if(item == 4) 
		{
			System.out.println("Jalebi");
			int qty = 4;
			dto.setQty(qty);
			System.out.println("Total Quantity:"+qty);
			System.out.println("Select How Much You Need:");
			   int Foodqty = sc.nextInt();              //reads int
				int fooditemqty = Foodqty;
				System.out.println("You have Selected:"+fooditemqty);
				System.out.println("You Need"+qty+" Jalebi");
		}else 
		{
			System.out.println("Enter b/w 1 to 4");
		}
		
		}
	
	   
}
