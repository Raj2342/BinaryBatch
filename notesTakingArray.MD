
# step to use mark down- heading1
>>  imp note
## heading 2
**most impotant word**
## code  writing 
 ```java
  class pro{

  }
 ```
*** when you create  other class like ``Innermixed_concept`` do not write public , it write only in main mehtod ***
eg,`` wrong method `` 
   ```java
   
 **public** class Innermixed_concept {
 
       public void play(int a){
    }
}
           
public class mixed_concept {
    
    public static void main(String[] args) {
           
    }
}
   ```
   eg, ``right method`` 

   ```java
 
  class Innermixed_concept {
 
       public void play(int a){
    }
}
           
public class mixed_concept {
    
    public static void main(String[] args) {
           
    }
}

   ```
  

# 1. array to string  convert print as it is : Arrays.toString()
        int arr[] = { 2, 3,4,5,6};
        System.out.println(Arrays.toString(arr));
        
 
 # 2. we canot call directly function in sout     
 eg:  
        int arr[] = { 7,8,3,1,2 , 4 ,6 ,3 };
               System.out.println(play(arr));  

 # 3. print first and last element : 
     a={1,2,3,4,5};
     int size=a.length;
System.out.println("First element of an array is" +a[0]);
System.out.println("Last element of an array is "+a[size-1]);

 # 4. return- console me output nahi deta 
    println- console me output deta hai 
   
    eg,
     public  static int play(){
        return 5; 
     }

     public static String boy(){
        return "mohan";

     }

     public static void main(String[] args){
        int a = play();
        String b = boy();
        System.out.println(a);
        System.out.println(b);
     }

### imp tag it is for sorting sortcut: 
``````java
static int sort(int arr[]){
  Arrays.sort(arr);
}
``````

 # Return 
  if two int, int return
  ``````java
public static  int[]  play(int n , int arr[]){

  
     int ohm1 = arr[arr.length-2] ;
     int ohm2 =  arr[1] ;
        
   return  new int[] {ohm1 ,ohm2};
   
}
  ``````
  or
  ``````java
static int[] getSumAndSub(int a, int b) 
    { 
        int[] ans = new int[2]; 
        ans[0] = a + b; 
        ans[1] = a - b; 
  
        // returning array of elements 
        return ans; 
    } 

     public static void main(String[] args) 
    { 
        int[] ans = getSumAndSub(100, 50); 
        System.out.println("Sum = " + ans[0]); 
        System.out.println("Sub = " + ans[1]); 
    } 
  ``````
  ## If returned elements are of different types

``````java
import javafx.util.Pair; 
  
class GfG { 
    public static Pair<Integer, String> getTwo() 
    { 
        return new Pair<Integer, String>(10, "GeeksforGeeks"); 
    } 
  
    // Return multiple values from a method in Java 8 
    public static void main(String[] args) 
    { 
        Pair<Integer, String> p = getTwo(); 
        System.out.println(p.getKey() + " " + p.getValue()); 
    } 
} 

``````

 ## Returning list of Object Class

 ``````java
import java.util.*; 
  
class GfG { 
    public static List<Object> getDetails() 
    { 
        String name = "Geek"; 
        int age = 35; 
        char gender = 'M'; 
  
        return Arrays.asList(name, age, gender); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        List<Object> person = getDetails(); 
        System.out.println(person); 
    } 
} 


 ``````

# CREATE AN EMPTY ARRAY
```java
int[] myArray = new int[3]

```   
# Remove Zeros from array
```java
int[] array = {0, 5, 6, 0, 0, 2, 5};
        int len = 0;
        for (int i=0; i<array.length; i++)
        {
            if (array[i] != 0)
                len++;
        }
       int[] newArray = new int[len];
        for (int i=0, j=0; i<array.length; i++){
            if (array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
```
### creae an array using arrayList
``` java
ArrayList<String> cars = new ArrayList<>();
         cars.add("volvo");
         cars.add("hundai");
         cars.add("mahindra");
         System.out.println(cars);

```
output: 
 [volvo, hundai, mahindra]

 # if Array code me nahi hai but Arraylist/other-method ka use karke array bani hai vo console me hai uss array ka use kaise kare ?
 or 
 ## add array  using for each loop
   *** for each loop ***
   ```java
    int SumEven =0;
   for(int even : s1){
                  SumEven = SumEven + even;
             }
  ```
## add  array using loop
```java

             int arr[] = { 2,3,4,5,6};
           int sum =0;
           for(int i=0; i<arr.length;i++){
              sum = sum + arr[i];
            }
            System.out.println( sum);
            
```