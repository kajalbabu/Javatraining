  class Student{
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
}
   public class encapsulation{
    public static void main(String[] args){
      Student encaps= new Student();
      encaps.setname("Kajal");
      encaps.setrollno(101);
      System.out.println("Name: "+encaps.getname() +" and Roll No: "+encaps.getrollno());

    }
}

