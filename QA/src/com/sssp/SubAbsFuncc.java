package com.sssp;

import java.util.Scanner;

public class SubAbsFuncc {

	// Subclass (inherit)
	class subAbs extends AbsFuncc 
	{
		
	}
	public void Getall() 
	{
		sp sp = new sp();
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		
		System.out.print("Enter Mobile Brand Name: ");  
		String mobn= sc.nextLine();              //reads string  
		sp.brandName = mobn;
		//System.out.print("You have entered: "+str);
		
		System.out.print("Enter Model Name: ");  
		String modn= sc.nextLine();              //reads string  
		sp.modelName = modn;
		//System.out.print("You have entered: "+str);
			
		
		System.out.print("Enter Mobile ID - ");  
		int mobid = sc.nextInt();  
		int id = mobid;  
		sp.mobileID = id;
		
		//System.out.println("Total= " +d);  
		
		//Mobile price
		System.out.print("Enter Mobile Price - ");  
		int mobprice = sc.nextInt();  
		int p =mobprice; 
		sp.price = p;
		
		//Mobile memory
			System.out.print("Enter Mobile memory In GB - ");  
			int mobmemory = sc.nextInt();  
			int m =mobmemory;
			sp.memory = m;
			
		//Mobile memory
			System.out.print("Enter Mobile Serial Number - ");  
			int mobser = sc.nextInt();  
			int mobse =mobser;
			sp.serialNumber = mobse;
			
			//Mobile Cam
			 System.out.print("Enter Mobile Total Number of Cameras - ");  
			 int mobcam = sc.nextInt();  
			 int mobcamera =mobcam;
			 sp.noOfCamera = mobcamera;
			 
			 System.out.print("You have "+sp.brandName+" With Model "+sp.modelName+" of "+sp.mobileID+" Range of "+sp.price+" with "+sp.memory+" Gigs of ram & with serial no "+sp.serialNumber+" and has Only "+sp.noOfCamera+" Camera ");
	}
	

	
}
