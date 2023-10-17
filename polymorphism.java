class calculator{
    public int calculate(int a,int b){
        return a+b;
    } 
    public int calculate(int a, int b, int c){
        return a+b+c;
    }
}
class newcalculator extends calculator{
    public int calculate(int a, int b){
        return a+b;             //This is method overriding of method calculate(int a, int b) from parent class calculator
    }
}
public class polymorphism {
    public static void main(String[] args){
        calculator cal=new calculator();
        calculator calcu=new calculator();
        System.out.println("Addition of 2 numbers: "+ cal.calculate(5,7));
        System.out.println("Addition of 3 numbers: "+ cal.calculate(2, 4, 8));
        System.out.println("Addition of 2 numbers in child class: "+calcu.calculate(9, 2));
    }
}
