package Array_Folder;
   // other class 



class  Calc
{
    // public int add(int x , int y) // for input 2 values 
    public int add(int nums[]) // for multiple values  // pass array in method 
    {
         // result =0; it show error you are not tell data type  
          // int result = 0; donot write local variable a result  it show error in return result so 
         // we need global variable 
        // int result = x + y;  // FOR NORMAL VALUE 
        int result = 0;  // FOR ARRAY
        for(int n: nums)
        {
            result = result +n;
        }
        return   result;
        
    }
    
}
     // another class 
public class Anny_Array {
    public static void main(String[] args) {
        
        Calc obj = new Calc();
         /*  0+3=3
        3+4=7
        7+5=12
        12+6=18
        18+7=25
        */
        
        // int result = obj.add(5 ,6);// input only two values 
        // int nums[] =  {5,3,4,7};
        // int result = obj.add(nums[]);
        int result = obj.add(new int[] {5,3,4,7}); // input multiple values 
        System.out.println(result);
    }
}



