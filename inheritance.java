
 class vehicle {
 public void usage(){
    System.out.println("Anywhere can go");
}
}
class Road extends vehicle{
    public void Bike(){
        System.out.println("It is a two wheeler");
    }
}
class Rail extends vehicle{
    public void Train(){
        System.out.println("It is moving through the rail");
    }
}
class Air extends vehicle{
    public void Airplane(){
        System.out.println("It is moving through the air");
    }
} class Fourwheeler extends Road{
    public void Car(){
        System.out.println("It is a four wheeler");
    }
}
public class inheritance{
public static void main(String[] args){
    Fourwheeler f= new Fourwheeler();
    Air a= new Air();
    Rail r= new Rail();
    f.usage();
    a.Airplane();
    f.Car();
    f.Bike();
    r.Train();
}
}