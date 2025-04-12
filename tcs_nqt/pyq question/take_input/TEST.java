

package take_input;
import java.util.*;

public class TEST {
            public static ArrayList<Integer> arrayInput(){
                        ArrayList<Integer> arr1 = new ArrayList<>();
                        Scanner sc = new Scanner(System.in);
                        String str = sc.nextLine();
                        Scanner ss = new Scanner(str).useDelimiter(",");
                        while(ss.hasNextInt()){
                                    arr1.add(ss.nextInt());
                        }
            }





            public static void main(String[] args) {
                    // 
                    ArrayList<Integer> arr =  arrayInput() ; 
                    // new Array 
                    int newarr[] = new int[arr.size()];
                    for(int i=0;i<arr.size();i++){
                         newarr[i]=arr.get(i);
                    }
                    add(newarr);

            }
}
