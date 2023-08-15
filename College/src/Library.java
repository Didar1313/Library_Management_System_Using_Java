import java.util.Scanner;

public class Library {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println(
            "********************Welcome to Library Mangement System!********************");
        System.out.println(
            "                  Select From The Following Options:               ");
        System.out.println(
            "**********************************************************************");

        books ob=new books();
        students obStudents=new students();

        int choice;
        int searchChoice;

        do{
            System.out.println(
                "----------------------------------------------------------------------------------------------------------");
            System.out.println("Press 1 to Add new Book.");
            System.out.println("Press 0 to Exit Application.");
            System.out.println(
                "Press 2 to Upgrade Quantity of a Book.");
            System.out.println("Press 3 to Search a Book.");
            System.out.println("Press 4 to Show All Books.");
            System.out.println("Press 5 to Register Student.");
            System.out.println(
                "Press 6 to Show All Registered Students.");
            System.out.println(
                "-------------------------------------------------------------------------------------------------------");

            choice=input.nextInt();

            switch(choice){
                case 1:
                book b=new book();
                ob.addBook(b);
                break;

                case 2:
                ob.upgradeBookQty();
                break;

                case 3:
                System.out.println(
                    " press 1 to Search with Book Serial No.");
                System.out.println(
                    " Press 2 to Search with Book's Author Name.");
                searchChoice = input.nextInt();

                switch(searchChoice){
                    case 1:
                    ob.searchBySno();
                    break;

                    case 2:
                    ob.searchByAuthorName();
                    break;
                }
                break;

                case 4:
                ob.showAllBooks();
                break;

                case 5:
                student s=new student();
                obStudents.addStudent(s);
                break;

                case 6:
                obStudents.showAllStudents();
                break;


                default:
                System.out.println("Enter the number between 0 to 8 ");

            }
        }
        while(choice !=0);
        
    }
}
