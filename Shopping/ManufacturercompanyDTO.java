package com.qac.shopping;

public class ManufacturercompanyDTO {
	/* needs to go in ProductDTO*/
	Long ContactNo;
	String Companyname;
    String Address;
    String Mailid;
    
    public Long Contact() 
	{
		return ContactNo;
	}
	public void setContactNo(Long contact) 
	{
		this.ContactNo = contact;
	}
	
	public String CompanyName() 
	 {
		return Companyname;
	}

	public void setCompName(String compname) 
	{
		this.Companyname = compname;
	}
	
	public String CompAddrress() 
	 {
		return Address;
	}

	public void setAddress(String address) 
	{
		this.Address = address;
	}
	
	public String email() 
	 {
		return Mailid;
	}

	public void setemailid(String mailid) 
	{
		this.Mailid = mailid;
	}

}
