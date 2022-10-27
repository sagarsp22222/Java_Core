package maap;
import java.util.Scanner;
import java.util.TreeMap;

public class map_locker {
	
	public static void main(String[] args) {
	
		int k = 123;
		String d = "SSP";
		
	TreeMap map = new TreeMap();
	/*Scanner sc= new Scanner(System.in); //System.in is a standard input stream */
	
/*	System.out.print("Enter Serial Number: ");  
	int _key = sc.nextInt();            //reads int  
	int k = _key;
	
	System.out.print("Enter Data: ");  
	String _data = sc.nextLine();         //reads int  
	String d = _data;*/
	
	
	map.put(k, d);
	
	/*map.put(123, "Sagar");
	map.put(124, "Sam");
	map.put(125, "Son");
	map.put(126, "sus");
	map.put(127, "nik");*/
	
	System.out.println(map.get(k));
	/*System.out.println(map.keySet());
	System.out.println(map.values());*/
	
	}

}