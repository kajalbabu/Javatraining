
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Copyfiles {
     public static void main(String[] args) {
        // Create Files

        File fileObj1 = new File("C:/Users/KajalBabu/Desktop/samples/file1.txt");
        File fileObj2 = new File("C:/Users/KajalBabu/Desktop/samples/file2.txt");
        File fileObj3 = new File("C:/Users/KajalBabu/Desktop/samples/file3.txt");
        try {
            boolean str1 = fileObj1.createNewFile();
            boolean str2 = fileObj2.createNewFile();
            boolean str3 = fileObj3.createNewFile();
            if (str1) {
                System.out.println("New file 1 created...");
            } else {
                System.out.println("File 1 already exists...");
            }
            if (str2) {
                System.out.println("New file 2 created...");
            } else {
                System.out.println("File 2 already exists...");
            }
            if (str3) {
                System.out.println("New file 3 created...");
            } else {
                System.out.println("File 3 already exists...");
            }
        } catch (Exception e) {
            System.out.println("Error occured...");
        }

        // Write to Files

        try {

            FileWriter fw1 = new FileWriter(fileObj1);
            FileWriter fw2 = new FileWriter(fileObj2);
            FileWriter fw3 = new FileWriter(fileObj3);
            fw1.write("kajal " + " 1 \n");
            fw1.write("kajal babu " + " 2 \n");
            fw2.write("rajesh " + " 3 \n");
            fw2.write("rajesh kn " + " 4\n");
            fw3.write("pooja " + " 5 \n");
            fw3.write("pooja b " + " 6 \n");
            fw1.close();
            fw2.close();
            fw3.close();
        } catch (Exception e) {
            System.out.println("error...");
        }

        // Copy Files
try{
         BufferedReader bufferedReader = new BufferedReader(new FileReader(fileObj1));
         BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileObj2));
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileObj3,true));
         String str = " ";
         while ((str = bufferedReader.readLine()) != null) {
            bufferedWriter.write(str + "\n");
         }
         while ((str = bufferedReader1.readLine()) != null) {
            bufferedWriter.write(str + "\n");
         }
         bufferedReader.close();
         bufferedReader1.close();
         bufferedWriter.close();
     }catch(Exception e)
     {
         System.out.println("error");
     }
}
}







