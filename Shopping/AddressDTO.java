package com.qac.shopping;

import java.util.Scanner;

public class AddressDTO {
	/* Client Side*/
	String Name;
	String Buildingno;
    String Area;
    String City;
    String State;
    String Country;
    int ZipCode;

    public void ClientSideData() 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Your Name: ");  
		String clientname = sc.nextLine();              //reads string  
		Name = clientname;
		
		System.out.print("Enter Your Buildingno: ");  
		String BuildingNo = sc.nextLine();              //reads string  
		Buildingno = BuildingNo;
    	
		System.out.print("Enter Your Area: ");  
		String area = sc.nextLine();              //reads string  
		Area = area;
		
		System.out.print("Enter Your ZipCode: ");  
		int zip = sc.nextInt();              //reads int  
		ZipCode = zip;
		
		System.out.print("Enter Your City: ");  
		String city = sc.nextLine();              //reads string  
		City = city;
		
		System.out.print("Enter Your State: ");  
		String state = sc.nextLine();              //reads string  
		State = state;
		
		System.out.print("Enter Your Country: ");  
		String country = sc.nextLine();              //reads string  
		Country = country;
		
		System.out.println("You have Entered Above Data: "+Name+" "+Buildingno+" "+Area+" "+ZipCode+" "+City+" "+State+" "+Country);
		System.out.println("Mr."+Name+" the order will arrive soon");
    }
}
