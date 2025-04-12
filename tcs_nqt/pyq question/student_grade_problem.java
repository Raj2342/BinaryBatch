import java.util.*;
public class student_grade_problem {
            
            public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        // find 
                        // print student name who 10 year old 
                        String Name20yearold = "";
                        int avgOfGradeFemale=0;
                         System.out.println("enter the size");
                        int n= sc.nextInt();// Number of students
                        sc.nextLine();// Consume the newline
                        String selectedName[] = new String[n];// max n possible names
                        int count=0;

                       int totalfemal =0;
                       int totalGrade=0;


                        for(int i=0;i<n;i++){
                        System.out.println("Enter name");
                           String name = sc.nextLine();
                           System.out.println("Enter age");
                           int age = sc.nextInt();
                           sc.nextLine();// Consume the newline
                           System.out.println("Enter grade");
                           char grade = sc.nextLine().charAt(0);
                           System.out.println("Enter gender");
                           String  gender = sc.nextLine();

                           if(age>20){
                                    selectedName[count]=name;
                                    count++;

                                    if(gender.equals("Female")){
                                                totalfemal++;
                                                totalGrade= totalGrade+grade;


                                    }
                           }
                        }
                        
                        for(int i=0;i<selectedName.length;i++){
                                    System.out.println(selectedName[i]);
                        }
              
                        // calculate avg grade of female

                        double avg ;
                        if (totalfemal==0) {
                                    avg=0;
                                    
                        }
                        else{
                               avg = totalGrade/totalfemal;
                               System.out.println(avg);
                        }
                        
                        
                        

            }    
}
