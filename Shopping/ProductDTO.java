/*  Project Grocery shop
ProductDTO
    String Nameofproduct
    double MRPrice
    Long Barcodenumber
    ManufacturercompanyDTO  dto
    Boolean IsVag
    String Manufacturingdate
    String Expiry date
    Int Quantity
ManufacturercompanyDTO
     String Companyname
     Address add
     Long ContactNo
     String Mailid
AddressDTO
    String Buildingno
    String Area
    String City
    String State
    String Country
    Int Zip
    

GroceryShopDAO

      boolean   AddProduct(productdto)
         String removeProductByCompanyName(productName,companyName)

Treeset getAllProductByCompanyName(companyName)

HashSet getAllProductBynameofproduct(nameofproduct)

Int totalNumberOfProduct()

List getAllVegProduct()

Linkedlist getAllNonVegProduct()

Void showAllProduct()*/
package com.qac.shopping;

public class ProductDTO {
	/*List all products n*/
	Boolean IsVeg;
	int Quantity;//-----------
	Double MRP;
	String Nameofproduct;
    Long Barcodenumber;
    String Manufacturingdate;
    String ExpiryDate;
    ManufacturercompanyDTO  dto;

		public void ProductData() 
		{
			System.out.println("Product Data");
		}
			//int-----------------------------
			public int Quantity() 
			{
				return Quantity;
			}

			public void setQty(int Quantity) 
			{
				this.Quantity = Quantity;
			}
			
			// Double---------------------------
			public Double MRP() 
			{
				return MRP;
			}

			public void setMRP(Double MRP) 
			{
				this.MRP = MRP;
			}
 
			// String Nameofproduct------------------
			public String  ProductName() 
			{
				return  Nameofproduct;
			}

			public void setProductname(String  productname) 
			{
				this. Nameofproduct =  productname;
			}
			
			// long barcode no----------------------------
			public Long barcode() 
			{
				return Barcodenumber;
			}
			public void setbarcodeNo(Long barcode) 
			{
				this.Barcodenumber = barcode;
			}
			
			//string manufacdate----------------------------
			 public String ManufDate() 
			 {
				return Manufacturingdate;
			}

			public void setprice1(String manuDate) 
			{
				this.Manufacturingdate = manuDate;
			}

			//String expiredate--------------------------------
			public String getexpiredate() 
			{
				return ExpiryDate;
			}

			public void setSerielNumber(String expdate) 
			{
				this.ExpiryDate = expdate;
			}
 
}
