import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//package Codes_25_April.Stream Codes;

public class ByteStream {
    
    public static void main(String[] args) throws FileNotFoundException{
       // FileOutputStream fout = new FileOutputStream("M:\\wiley java\\data\\data1.txt");

       FileInputStream fin = new FileInputStream("M:\wiley java\data")
        BufferedOutputStream bof = new BufferedOutputStream(fout);

        String str = "I am a Programmer";

        byte[] b = str.getBytes();

        //System.out.println(b);

        try{
            bof.write(b);
            bof.flush();
            bof.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
