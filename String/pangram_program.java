package String;
public class pangram_program {
        public static void main(String[] args) {
            boolean bool = false;
            String str1 = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
            // str1 = str1.replace(" ", " ");
            str1 = str1.toLowerCase();
            char []srr = str1.toCharArray();

            int  arr[] = new int[26];
            for(int  i=0; i<srr.length; i++)
            {
                arr[srr[i]-65]++;
            }
            //  travesre in new array and check any one are 0,1
            for(int i=0; i<arr.length;i++)
            {   
                 
                if(arr[i]==0){
                    System.out.println(" its not pangrom");
                    bool = true;
                    break;
                }
            }

            if( !bool){

                System.out.println("it is pangrom");
            }
        }
}
