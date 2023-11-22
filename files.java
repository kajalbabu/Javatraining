import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Products {
    String item;
    int price;

    public Products(String item, int price) {
        this.item = item;
        this.price = price;
    }
}

public class files {
    public static void main(String[] args) {
        // Create File
        File fileObj = new File("C:/Users/KajalBabu/Desktop/samples/sample.txt");
        try {
            boolean str = fileObj.createNewFile();
            if (str) {
                System.out.println("New file created...");
            } else {
                System.out.println("File already exists...");
            }
        } catch (Exception e) {
            System.out.println("Error occured...");
        }

        // Write to File
        List<Products> list = new ArrayList<>();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String choice = "yes";
        while (choice.equals("yes")) {
            System.out.println("Enter the item:");
            String item = sc1.nextLine();
            System.out.println("Enter the price:");
            int price = sc2.nextInt();
            list.add(new Products(item, price));

            System.out.println("Do you want to add item(yes/no)");
            choice = sc1.nextLine();

        }
        try {
            FileWriter fileWrite = new FileWriter("C:/Users/KajalBabu/Desktop/samples/sample.txt");
            for (int i = 0; i < list.size(); i++) {
                fileWrite.write(list.get(i).item + " - " + list.get(i).price + "\n");
            }
            fileWrite.close();
            System.out.println("Products added...");
        } catch (Exception e) {
            System.out.println("Error occured...");
        }

        // Read from file
        try {
            FileReader fileRead = new FileReader("C:/Users/KajalBabu/Desktop/samples/sample.txt");
            BufferedReader bufferedReader=new BufferedReader(fileRead);
            String str=" ";
            while ((str=bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
            bufferedReader.close();
            fileRead.close();
        } catch (Exception e) {
            System.out.println("Error occured...");
        }

    }
}
