import java.util.*;
public class experiment {
            public static void main(String[] args) {
                       Scanner sc = new Scanner(System.in);
                       // find 
                       String higerSellingItem ="";
                       int higerSellingItemPrice=0;
                       int totalSelling=0;
                       int avgSelling =0;
                 int n = sc.nextInt();
                       for(int i=0;i<n;i++){
                           String item = sc.next(); 
                           sc.nextLine();
                           int quantity = sc.nextInt(); 
                           int price = sc.nextInt(); //20

                           int percost= quantity*price;
                           // higer selling item
                         if(percost>higerSellingItemPrice){
                                    higerSellingItemPrice=percost;
                                    higerSellingItem = item;
                         }
                          // total selling price 
                          totalSelling = totalSelling + percost;
                       }

                       System.out.println(higerSellingItem);
                       System.out.println(totalSelling);
                       int avg = totalSelling/n;
                       System.out.println();
            }
}
