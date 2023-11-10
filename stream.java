import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class superMarket {
    String item;
    int price;
    int stock;

    public superMarket(String item, int price,int stock) {
        this.item = item;
        this.price=price;
        this.stock = stock;

    }
}

public class stream {
    public static void main(String[] args) {
        List<superMarket> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String n = "yes";
        while (n.equals("yes")) {
            System.out.println("Enter the item:");
            String item = sc.nextLine();
            System.out.println("Enter the price:");
            int price=sc2.nextInt();
            System.out.println("Enter the stock:");
            int stock = sc2.nextInt();
            list.add(new superMarket(item,price,stock));
            System.out.println("Do you want to enter the item again? yes/no");
            n=sc.nextLine();
        }
        System.out.println("Items in the SuperMarket:");
        list.stream().forEach(name->
                        System.out.println(name.item + "-"+ name.price+ "-" + name.stock));
        long count=list.stream()
                    .filter(pr->pr.stock<5) 
                    .count();
                    System.out.println("The number of items less than stock 5 is "+count);

    }
}
