import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FileModifiation {
    public static void main(String[] args) {
        File file=new File("C:/Users/KajalBabu/Desktop/samples/sample.txt");
        long time=file.lastModified();
        DateFormat date=new SimpleDateFormat();
        System.out.println("sample file modified date is : "
                           + date.format(time));
    }
}
