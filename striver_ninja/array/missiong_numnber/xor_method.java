public class xor_method {
      
     public static void main(String[] args) {
           
          int arr[] = { 1,2,3,4,6};
        //   int xor1 = (1^2^3^4^6)^(1^2^3^4^5^6);
      int expeted_array_length  = arr.length + 1;
    int  xor1 = arr[0];

    for(int i=0; i<arr.length; i++){
         xor1 = xor1^arr[i];
    }
      System.out.println(xor1);
    
      int  xor2 = 0;

      for(int i=0; i<arr.length+1; i++){
        xor2 = xor2^i;
      }
      System.out.println(xor2);
    
       System.out.println(xor1^xor2);

    }
}
