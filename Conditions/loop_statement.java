class loop_statement {
            public static void main (String [] str)
          
              {
            
             byte []rupees ={10,50,67,34,56,87,28};
			 
              System .out.println("size of the array"+rupees.length );
			  
             for (byte j=0; j<=6; j++)
             {

                  if ( rupees[j] <40){
                        System .out.println(rupees[j]+"is even");
                   }
                  else {                 
                         System .out.println(rupees [j]+"is odd");
                  }  
               
              {
                if( rupees[j]%2 ==0){
                }
                else{
                     System .out.println("print the odd number:"+rupees[j]);
                 }
               }   

                if( rupees[j]%2 ==0){
                     System .out.println("print the even number:"+rupees[j]);
                 }
                



               {
                int[] z = { 10,5,4,9,7,2,1,3};  
                int _m =0 ;
                int _n =0 ;
                
                 System .out.println("size of the array"+z.length);
                    for (int i=0;i<=7 ;i++)
                       {
                         if ( z [i] %2 ==0)
                          { 
                            _m = _m + z [i];
                           }
                          else{
                             _n = _n + z [i];
                          }
                        }
                System .out.println ("sum of even numbers:"+_m);
                System .out.println ("sum of 0dd numbers:"+_n);
             }
           }
        }

}