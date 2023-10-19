class demo 
{
        public static void main(String[] args) {
              
                // reverse string 
                String st = "RAJKUMAR";
                String st1 = " ";
               for(int i=st.length()-1 ; i>=0; i--)
               {
                     st1 = st1 + st ;
               }
               System.out.println(st1);

        }
}