  public class encapsulation{
   private String name;
   private int rollno;

   public void setname(String stname){
    name = stname;
   }

   public void setrollno(int num){
    rollno= num;
   }

   public String getname(){
    return name;
   }

   public int getrollno(){
    return rollno;
   }
   
    public static void main(String[] args){
      encapsulation encaps= new encapsulation();
      encaps.setname("Kajal");
      encaps.setrollno(101);
      System.out.println("Name: "+encaps.getname() +" and Roll No: "+encaps.getrollno());

    }
}

