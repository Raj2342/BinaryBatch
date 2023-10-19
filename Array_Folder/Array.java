package Array_Folder;



public class Array {
     public static void main(String[] args) {
       /*  int nums[] = { 3,4,5,6};
       /*  String nums[] = { "navin" , "kamoo" , " chaman"};
        int a = 5;
        */
       /* 
        System.out.println(nums[0]); 
        System.out.println(nums[1]); 
         */

         // using loop print array when arrays hass 100value then it is useful
       /*  for( int i=0 ; i<=3 ; i++)
         {
          System.out.println(nums[i]);
         }
       */
         //  agar value arrays me nahi ho  baad me aye value tab kaise arrays banaye 
       
      int  nums[] = new int[4]; // this value store in heap memory
      nums[0] = 5;
      nums[1] = 6;
      nums[2] = 7;
      nums[3] = 8;
      
      for(int i=0; i<=3 ; i++)
      {
         System.out.println(nums[i]);
      }


      
   }
}
