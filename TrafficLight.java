import java.util.Scanner;

public class TrafficLight {
    String colour;
    int duration;
    public void time(String colour,int duration){
        this.colour=colour;
        this.duration=duration;
        System.out.println("Colour is:"+colour);
        System.out.println("Duration is: "+duration);
    }
    public void changeColour(String clr){
        this.colour=clr;
    }
    public void check(){
        if(colour.equals("green")){
            System.out.println("The colour is green.....");
        }
        else if(colour.equals("red")){
            System.out.println("The colour is red.....");
        }
        else{
            System.out.println("It is invalid colour.....");
        }
    }
    public static void main(String[] args){
        TrafficLight lightObj=new TrafficLight();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the colour: ");
        String colour=scanner.nextLine();
        lightObj.time(colour,20);
        //Scanner scanner2=new Scanner(System.in);
        System.out.println("Enter the colour to be changed: ");
        String colour1=scanner.nextLine();
        lightObj.changeColour(colour1);
        lightObj.check();
        
        
    }
}
