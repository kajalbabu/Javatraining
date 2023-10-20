import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
 List<String> books=new ArrayList<String>();

 public void addBooks(String book){
     books.add(book);
 }
 public void removeBooks(String book){
    books.remove(book);
 }
 public void printall(){
    System.out.println("Books in the library:");
    for(String b:books){
        System.out.println(b);
}
 }
 public static void main(String[] args){
    Library LibraryObj=new Library();
    Scanner scanner=new Scanner(System.in);
    Scanner scanner2=new Scanner(System.in);
    int choice;
    boolean run=true;
    while(run){
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. View Books");;
        System.out.println("Choose one case:");
        choice=scanner2.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the book:");
                String book=scanner.nextLine();
                LibraryObj.addBooks(book);
                
                break;
            case 2:
                System.out.println("Enter the book to remove:");
                String book1=scanner.nextLine();
                LibraryObj.removeBooks(book1);
                break;
            case 3:
                LibraryObj.printall();
                break;
            default:
                run=false;
                break;
        }
        
    }
 }
}
