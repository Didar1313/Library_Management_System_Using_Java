import java.util.Scanner;

public class students {
    Scanner input=new Scanner(System.in);
    student theStudents[]=new student[50];

    public static int count=0;

    //Add New Student 
    public void addStudent(student s){
        for(int i=0; i<count; i++){
            if(s.regNum.equalsIgnoreCase(theStudents[i].regNum)){
                System.out.println("This student already registered");
                return;
            }
        }
        if(count<=50){
            theStudents[count]=s;
            count++;
        }
    }

    //Show All Student
    public void showAllStudents(){
        for(int i=0; i<count; i++){
            System.out.println(theStudents[i].studentName+"\t\t"+theStudents[i].regNum);
        }
    }
}
