import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Movie {
    String title;
    String director;
    List<String> actors= new ArrayList<String>();
    List<String> reviews=new ArrayList<String>();
    public void addReview(String rev){
        reviews.add(rev);
    }
    public void addActors(String actor){
        actors.add(actor);
    }
    public void printall(){
        System.out.println("Title: "+title);
        System.out.println("Director: "+director);
        System.out.println("Actors: ");
        for(String a:actors){
        System.out.println(a);}
        System.out.println("Rviews: ");
        for(String r:reviews){
            System.out.println(r);
        }
    }
    public static void main(String[] args){
        Movie m=new Movie();
        m.addActors("Mohanlal");
        m.addActors("Mammootty");
        m.title="20-20";
        m.director="Shaji";
        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Do you want to add a review? ");
        char str=scanner2.next().charAt(0);
        while(str=='y'){
            System.out.println("Enter a review: ");
            String rev = scanner.nextLine();
            m.addReview(rev);
            System.out.println("Do you want to add more review? ");
           str=scanner2.next().charAt(0);
        }
        m.printall();
    }
}
    

