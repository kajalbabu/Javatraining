import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.Signature;
import javax.crypto.Cipher;

public class EncryptAndDecrypt {
    public static void main(String[] args) throws Exception{
        File fileObj = new File("C:/Users/KajalBabu/Desktop/filetesting.txt");
        String str = " ";
        try {
            FileReader fileRead = new FileReader(fileObj);
            BufferedReader bufferedReader = new BufferedReader(fileRead);
            String tempStr = " ";
            while ((tempStr = bufferedReader.readLine()) != null) {
                str = str + tempStr + "\n";
                
            }
            bufferedReader.close();
            fileRead.close();
        } catch (Exception e) {
            System.out.println("Error occured...");
        }
        System.out.println("The plain text from filetesting is:\n" + str);

        //Encryption

        KeyPairGenerator keyPairGen= KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(2048);
        KeyPair pair=keyPairGen.generateKeyPair();
        Cipher cipher=Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, pair.getPublic());
        byte[] encryptedoutput=str.getBytes();
        cipher.update(encryptedoutput);
        byte[] encryptedText=cipher.doFinal();
       
        //Writing the encrypted text to newfile encryptedfiltesting
        try {
        FileWriter fileWrite = new FileWriter("C:/Users/KajalBabu/Desktop/encryptedfiletesting.txt");
        fileWrite.write(new String(encryptedText,"UTF8"));
         fileWrite.close();
        }
        catch (Exception e) {
        System.out.println("Error occured...");
        }


        //Reading from the new file encrypted file to decrypt the text
        String encryptedStr = " ";
        try {
            FileReader fileRead = new FileReader("C:/Users/KajalBabu/Desktop/encryptedfiletesting.txt");
            BufferedReader bufferedReader = new BufferedReader(fileRead);
            String tempStr = " ";
            while ((tempStr = bufferedReader.readLine()) != null) {
                encryptedStr = encryptedStr + tempStr + "\n";
            }
            bufferedReader.close();
            fileRead.close();
        } catch (Exception e) {
            System.out.println("Error occured...");
        }


        //Decryption

        byte[] encryptedInput=encryptedStr.getBytes();
        cipher.update(encryptedInput);
        cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());
        byte[] decryptedOutput=cipher.doFinal(encryptedText);
        System.out.println("Decrypted text from encrypted file: \n "+new String(decryptedOutput,"UTF8"));
    }}

