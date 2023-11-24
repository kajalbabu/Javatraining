
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class marketProducts {
    String item;
    int stock;
    float price;

    public marketProducts(String item, int stock, float price) {
        this.item = item;
        this.stock = stock;
        this.price = price;
    }
}

public class Excelsheet {
    public static void main(String[] args) {
        File excelFile = new File("C:/Users/KajalBabu/Desktop/excelfile.csv");
        try {
            boolean str = excelFile.createNewFile();
            if (str) {
                System.out.println("New file created...");
            } else {
                System.out.println("File already exists...");
            }
        } catch (Exception e) {
            System.out.println("Error occured..." +e.getMessage());
        }
        List<marketProducts> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        String n = "yes";
        while (n.equals("yes")) {
            System.out.println("Enter the item:");
            String item = sc.nextLine();
            System.out.println("Enter the stock:");
            int stock = sc2.nextInt();
            System.out.println("Enter the price:");
            float price = sc3.nextFloat();
            list.add(new marketProducts(item, stock, price));
            System.out.println("Do you want to enter the item again? yes/no");
            n = sc.nextLine();
        }

        //Writing to file

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(excelFile));
            bufferedWriter.write("Product" + "," + "Stock" + "," + "Price \n");
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i).item + "," + list.get(i).stock + "," + list.get(i).price + "\n");
            }
            bufferedWriter.close();

            System.out.println("Products added...");
        } catch (Exception e) {
            System.out.println("Error.." +e.getMessage());
        }

        //Initial products

        System.out.println("Initial Product List:");
        try (BufferedReader reader = new BufferedReader(new FileReader(excelFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error.." +e.getMessage());
        }


        //Updating products


        List<marketProducts> updatedList = new ArrayList<>();
        System.out.println("Enter the item to be updated:");
        String item = sc.nextLine();
        System.out.println("Enter the stock to be updated:");
        String stock = sc.nextLine();
        System.out.println("Enter the price to be updated:");
        String price = sc.nextLine();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(excelFile));
            String tempStr = " ";
            while ((tempStr = bufferedReader.readLine()) != null) {
                String[] str = tempStr.split(",");
                if (!str[0].equals("Product") && !str[1].equals("Stock") && !str[2].equals("Price")) {                        
                    if (str[0].trim().equals(item.trim())) {
                        str[1] = String.valueOf(stock);
                        str[2] = String.valueOf(price);
                    }
                    updatedList.add(new marketProducts(str[0].trim(), Integer.parseInt(str[1].trim()),
                            Float.parseFloat(str[2].trim())));
                }
            }

            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Error occured..."+e.getMessage());
        }

        //Writing updated products to file

        
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(excelFile));
            bufferedWriter.write("Product" + "," + "Stock" + "," + "Price \n");
            for (int i = 0; i < updatedList.size(); i++) {
                bufferedWriter.write(updatedList.get(i).item + "," + updatedList.get(i).stock + ","
                        + updatedList.get(i).price + "\n");
            }
            bufferedWriter.close();

            System.out.println("Updated Products added ...");
        } catch (Exception e) {
            System.out.println("Error..");
            System.out.println(e.getMessage());
        }

        System.out.println("Updated Product List:");
        try (BufferedReader reader = new BufferedReader(new FileReader(excelFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error.." +e.getMessage());
        }

    }
}
