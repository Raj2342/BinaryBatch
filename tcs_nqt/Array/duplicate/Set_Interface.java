package duplicate;
import java.util.*;
public class Set_Interface {
            public static void main(String[] args) {
                        int arr[] = { 3,5,4,3,2,2,1,3};
                        Set<Integer> s = new HashSet<>();
                        for(int no:arr){
                                    if(s.add(no)==false){
                                                System.out.println(no);
                                    }
                        }
            }
}
