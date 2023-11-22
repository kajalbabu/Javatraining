import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class MoveContent {
    public static void main(String[] args) {
    File inFile = new File("C:/Users/KajalBabu/Desktop/samples/sample.txt");
    File outFile=new File("C:/Users/KajalBabu/Desktop/samples/file2.txt");
    try {
    outFile.createNewFile();
    } catch (Exception e) {
        System.out.println("Error occured..");
    }
    // try
    // {
    //     FileReader fr = new FileReader(inFile);
    //     FileWriter fw = new FileWriter(outFile);
    //     BufferedReader bufferedReader = new BufferedReader(fr);
    //     BufferedWriter bufferedWriter = new BufferedWriter(fw);
    //     String str = " ";
    //     while ((str = bufferedReader.readLine()) != null) {
    //         bufferedWriter.write(str + "\n");
    //     }
    // }catch(
    // Exception e)
    // {
    //     System.out.println("error..");
    // }
try {
    FileInputStream fin=new FileInputStream(inFile);
    FileOutputStream fout=new FileOutputStream(outFile);
    int str;
    while ((str=fin.read())!=-1) {
        fout.write(str);
        
    }
    System.out.println("The content is copied from sample file to file2");
} catch (Exception e) {
     System.out.println("error..");
}
}
}
