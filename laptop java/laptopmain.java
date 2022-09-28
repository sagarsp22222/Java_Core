class laptopmain {
	
     public static void main(String []arge){
     laptopdata _laptopdata = new laptopdata();
	 laptopcomponents _laptopcomponents = new laptopcomponents();
	 
	 laptopbrandname brandname = new laptopbrandname(); // took from laptopbrandname class

// dump in all the data here from all classes

    System.out.println("All data about processor:" +brandname ); 
    System.out.println("Processor Brand Name is:" + processor.processorbrand);
    System.out.println("Processor clockspeed  is:" + processor.clockspeed);
    System.out.println("Processor no of cores is:" + processor.core);
    System.out.println("Processor no of threads is:" + processor.threats);
    System.out.println("Processor cache size is:" + processor.cache);
    System.out.println("------------------------------------------------------");
	
	System.out.println("laptop components"); 
	System.out.println("laptop graphics card brandname:" +_laptopcomponents.graphicsbrand ); 
	System.out.println("graphics card size is:" + _laptopcomponents.graphics+" GB");
	System.out.println("SSD size is:" + _laptopcomponents.ssdsize+" GB");
	System.out.println("SSD brand name is:" + _laptopcomponents.ssdbrand);
	System.out.println("HDD size is:" + _laptopcomponents.harddisksize+" GB");
	System.out.println("HDD size is:" + _laptopcomponents.harddisksize);
	System.out.println("------------------------------------------------------");
	System.out.println(_laptopdata.Laptopcolor);
	brandname.specsTextExecute();
}