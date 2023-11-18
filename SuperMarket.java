import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    String item;
    float price;
    int stock;

    public Product(String item, float price, int stock) {
        this.item = item;
        this.price = price;
        this.stock = stock;
    }
}

public class SuperMarket {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        boolean check = true;
        while (check) {
            System.out.println();
            System.out.println("Enter the new items");
            System.out.println("Add the stock");
            System.out.println("Buy the stock");
            System.out.println("Display items");
            System.out.println("Choose the option:");
            int num = sc3.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter the item:");
                    String item = sc.nextLine();
                    System.out.println("Enter the price:");
                    float price = sc2.nextFloat();
                    System.out.println("Enter the stock:");
                    int stock = sc3.nextInt();
                    list.add(new Product(item, price, stock));
                    break;
                case 2:
                    System.out.println("Enter the item to be added:");
                    String itemAdd = sc.nextLine();
                    System.out.println("Enter the stock to be added:");
                    int stockAdd = sc3.nextInt();
                    list.stream()
                            .filter(product -> product.item.equals(itemAdd))
                            .findFirst()
                            .map(product -> product.stock += stockAdd);
                            
                    break;
                case 3:
                    System.out.println("Enter the item to be buy:");
                    String itemBuy = sc.nextLine();
                    System.out.println("Enter the stock to be buy:");
                    int stockBuy = sc3.nextInt();
                    list.stream()
                            .filter(product -> product.item.equals(itemBuy))
                            .findFirst()
                            .map(product -> product.stock -= stockBuy);
                    break;
                case 4:
                    list.stream().forEach(name -> System.out.println(name.item + "-" + name.price + "-" + name.stock));
                    break;
                default:
                    check = false;
                    break;
            }
        }

    }
}
