import java.util.Scanner;

public class books {

book theBooks[]=new book[50];
public static int count;

Scanner input=new Scanner(System.in);

//Checking exist or not
public int compareBookObjects(book b1,book b2){
    if(b1.bookName.equalsIgnoreCase(b2.bookName)){
        System.out.println("Book of this name already exist");
        return 0;
    }
    if(b1.sNo==b2.sNo){
        System.out.println("Book of this serial already exist");
        return 0;
    }
    return 1;
    
}
//addBook method
    public void addBook(book b){
        for(int i=0; i<count; i++){
            if(this.compareBookObjects(b, this.theBooks[i])==0)return;       
        }

        if(count<50){
            theBooks[count]=b;
            count++;
        }
        else{
            System.out.println("No Space Available");
        }
    }

    //SearchBySerialNumber
    public void searchBySno(){
        System.out.println(
            "\t\t\t\tSEARCH BY SERIAL NUMBER\n");

        int sNo;
        System.out.println("Enter serial number of book : ");
        sNo=input.nextInt();
        int flag=0;
        System.out.println(
            "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for(int i=0; i<count; i++){
            if(sNo==theBooks[i].sNo){
                System.out.println(
                    theBooks[i].sNo + "\t\t"
                    + theBooks[i].bookName + "\t\t"
                    + theBooks[i].authorName + "\t\t"
                    + theBooks[i].bookQtyCopy + "\t\t"
                    + theBooks[i].bookQty);
                    flag++;
                    return;
            }
        }
        if(flag==0){
            System.out.println("No book are found in this serial number");
        }
    }

    //SearchByAuthorName
    public void searchByAuthorName(){
         System.out.println(
            "\t\t\t\tSEARCH BY Author Name\n");
        System.out.println("Enter autor name : ");
        String authorName=input.nextLine();
        int flag=0;

        System.out.println(
            "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for(int i=0; i<count; i++){
            if(authorName.equalsIgnoreCase(theBooks[i].authorName)){
                System.out.println(
                    theBooks[i].sNo + "\t\t"
                    + theBooks[i].bookName + "\t\t"
                    + theBooks[i].authorName + "\t\t"
                    + theBooks[i].bookQtyCopy + "\t\t"
                    + theBooks[i].bookQty);
                    flag++;
                    return;
            }
        }
        if(flag==0){
            System.out.println("No book are found in this author name");
        }
    }

    //Display All Books
    public void showAllBooks(){
        System.out.println(
            "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for(int i=0; i<count; i++){
                System.out.println(
                    theBooks[i].sNo + "\t\t"
                    + theBooks[i].bookName + "\t\t"
                    + theBooks[i].authorName + "\t\t"
                    + theBooks[i].bookQtyCopy + "\t\t"
                    + theBooks[i].bookQty);      
        }
    }

    //Update Book Quantity
    public void upgradeBookQty(){
        System.out.println("Enter Serial number of Book");
        int sNo=input.nextInt();
        for(int i=0; i<count; i++){
            if(sNo==theBooks[i].sNo){
                System.out.println("Enter how many books added : ");
                int addingQty=input.nextInt();
                theBooks[i].bookQty+=addingQty;
                theBooks[i].bookQtyCopy+=addingQty;
                return;
            }
        }
    }

}
