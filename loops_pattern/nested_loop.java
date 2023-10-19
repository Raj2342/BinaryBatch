
class nested_loop { 
    public static void main(String[] args) 
    {
        //    star filled rectangle  normal pattern
           int n = 5; 
            for(int j=0; j<n ; j++ )
            {
                   for( int i=0; i<n; i++)
                {
                    System.out.print("*");
                }
               System.out.println();
             } 
             

            // inside blank  star  rectangle  Pattern programming 

            /*  int n=5;
            for(int i=0; i<n; i++ )
            {
                for(int j=0; j<n; j++)
                {
                    if(i==0|| j==0 || i==4 || j==4 )
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            */
        // A pattern 
           /*  int n= 5 ;
            for( int i=0; i<n ;i++)
            {
                for( int j=0; j<n; j++)
                {
                 if(j==0||j==4|| i==0|| i==2)
                 {
                 System.out.print("*");
                 }
                 else
                 {
                    System.out.print(" ");
                 }

                }
                System.out.println();
            }*/
     
       // H pattern 

       /*  int n= 5 ;
            for( int i=0; i<n ;i++)
            {
                for( int j=0; j<n; j++)
                {
                 if(j==0||j==4|| i==2)
                 {
                 System.out.print("*");
                 }
                 else
                 {
                    System.out.print(" ");
                 }

                }
                System.out.println();
            }
       */
    //   hexagonal pattern
      
  /*   int n= 10 ;
            for( int i=0; i<n ;i++)
            {
                for( int j=0; j<n; j++)
                {
                 if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || j==(n-1)/2 && i>0 || i==(n-1)/2 && j<(n-1)/2)
                 {
                 System.out.print("*");
                 }
                 else
                 {
                    System.out.print(" ");
                 }

                }
                System.out.println();
            }
         */
            //  D pattern

            /*     int n= 10 ;
            for( int i=0; i<n ;i++)
            {
                for( int j=0; j<n; j++)
                {
                 if(j==0 || i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1) || i==(n-1) && j<(n-1)/2)
                 {
                 System.out.print("*");
                 }
                 else
                 {
                    System.out.print(" ");
                 }

                }
                System.out.println();
            }
            */

           // DOUBLE D pattern - copy coloum loop or j loop and paste  in beofre         system.out.println()
          /*   int n= 10 ;
            for( int i=0; i<n ;i++)
            {
                // ist loop 
                for( int j=0; j<n; j++)
                {
                 if(j==0 || i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1) || i==(n-1) && j<(n-1)/2)
                 {
                 System.out.print("*");
                 }
                 else
                 {
                    System.out.print(" ");
                 }

                }
                // 2nd loop 
                 for( int j=0; j<n; j++)
                {
                 if(j==0 || i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1) || i==(n-1) && j<(n-1)/2)
                 {
                 System.out.print("*");
                 }
                 else
                 {
                    System.out.print(" ");
                 }

                }
                //3rd loop
                 for( int j=0; j<n; j++)
                {
                 if(j==0 || i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1) || i==(n-1) && j<(n-1)/2)
                 {
                 System.out.print("*");
                 }
                 else
                 {
                    System.out.print(" ");
                 }

                }
                System.out.println();
            }
           
          */
           
        //   complex structure
          /*  int n= 19 ;
            for( int i=0; i<n ;i++)
            {
                for( int j=0; j<n; j++)
                {
                    // long method 
                //  if(j==0 && i<1 || j==1 && i<2 && i>0 || j==2 && i<3 && i>1 || j==3 && i<4 && i>2 || j==4 && i<5 && i>3 || j==5 && i<6 && i>4)
                // note  one side  cross i==j , and other side cross i+j=10

                if( i==j || i+j==(n-1) || i+j==(n-1)/2 || j==0 || j==(n-1) || i==0 || i==(n-1)  || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2)  
                 {
                 System.out.print("*");
                 }
                 else
                 {
                    System.out.print(" ");
                 }

                }
                System.out.println();
            } */

            // copy of complex starcture
          /*  
             int n= 19 ;
            for( int i=0; i<n ;i++)
            {
               
                
                 for( int j=0; j<n; j++)
                {
                   

                if( i==j || i+j==(n-1) || i+j==(n-1)/2 || j==0 || j==(n-1) || i==0 || i==(n-1)  || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2)  
                 {
                 System.out.print("*");
                 }
                 else
                 {
                    System.out.print(" ");
                 }

                }
                // for space btw two structure 
                //   for copy  only p1, p2  k1 k2
                 for( int j=0; j<n; j++)
                {
                   

                if( i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j == (n-1) +(n-1)/2 || i==0 || i==(n-1) || j==0 || j==(n-1) )  
                 {
                 System.out.print("*");
                 }
                 else
                 {
                    System.out.print(" ");
                 }

                }

                // filled rectangle 
            
            

             for( int j=0; j<n; j++)
                {
                   

                if( i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j==(n-1)/2 || i+j<=(n-1)/2 || i==0 && j>=(n-1)/2 || j==(n-1) && i<=(n-1)/2 || j-i==(n-1)/2 || 
                j-i>=(n-1)/2   ||  i==(n-1) && j<=(n-1)/2 || i-j == (n-1)/2 || i-j >= (n-1)/2 || j>=(n-1)/2 && i==(n-1) || j==(n-1) && i>=(n-1)/2 || i+j==(n-1)+(n-1)/2 || i+j>=(n-1)+(n-1)/2 )  
                 {
                 System.out.print("*");
                 }
                 else
                 {
                    System.out.print(" ");
                 }

                }

                // insde fillde 
                for( int j=0; j<n; j++)
                {
                   

                if( i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j == (n-1) +(n-1)/2 || i==0 || i==(n-1) || j==0 || j==(n-1)|| j==(n-1)/2 || i==(n-1)/2 || i+j>=(n-1)/2 && j<=(n-1)/2 && i<=(n-1)/2 || j-i<=(n-1)/2 && j>=(n-1)/2  && i<=(n-1)/2 || i-j<=(n-1)/2 && i>=(n-1)/2 && j<=(n-1)/2  || i+j<=(n-1)+(n-1)/2 && j>=(n-1)/2 && i>=(n-1)/2)  
                 {
                 System.out.print("*");
                 }
                 else
                 {
                    System.out.print(" ");
                 }

                }

        
            
                System.out.println();
            }
            
      */




       
       

    }
}
