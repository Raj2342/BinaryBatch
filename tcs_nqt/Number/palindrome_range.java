import java.util.Scanner;

public class palindrome_range {

            public static void plaindrom(int a , int b){
                    
                        int temp;
                         
                        for(int i=a;i<=b;i++){
                             int sum =0;       
                               temp=i;     
                                    while(temp>0){
                                                int  rem =  temp %10; 
                                                temp = temp/10;
                                                 sum = (sum*10)+rem;
                                              }
                                    //           System.out.println("reverse value "+sum);
                       
                                              if (i == sum) {
                                               System.out.println("palindrome number "+i);
                                              }
                                             
                        }
            }
            public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the first value ");
                        int a = sc.nextInt();
                        System.out.println("Enter the second value ");
                        int b = sc.nextInt();
                        plaindrom(a,b);
                    

                    } 

            }

