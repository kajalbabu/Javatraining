import java.util.ArrayList;
import java.util.List;
public class Movies {
    String title;
    String director;
    List<String> actors=new ArrayList<String>(); 
    List<String> reviews=new ArrayList<String>();
    public void movie(String title, String director){
        this.title=title;
        this.director=director;
        System.out.println("Title: "+title);
        System.out.println( "Director: "+director);
    }

    public void addActors(String actor){
        actors.add(actor);
    }
    public void retreiveActors(){
         System.out.println("Actors:");
        for(String s: actors){
        System.out.println(s);}
    }


    public void addReview(String rev){
        reviews.add(rev);
    }
    public void retreiveReview(){
        System.out.println("Reviews:");
        for(String r: reviews){
        System.out.println(r);}
    }
    public static void main(String[] args){
        Movies m=new Movies();
        m.addReview("Very nice film");
        m.addReview("Good film");
        m.addActors("Mohanlal");
        m.addActors("Mammootty");
        m.movie("20-20", "shaji");
        m.retreiveActors();
        m.retreiveReview();
    }
}
