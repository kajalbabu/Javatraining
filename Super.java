class Animal{
	public void  sound(){
		System.out.println("It is dog");
}
}
class Cat extends Animal{
	public void sound(){
		super.sound();
		System.out.println("It is cat");
}
}
public class Super{
	public static void main(String[] args){
		Cat obj=new Cat();
		obj.sound();
}
}

