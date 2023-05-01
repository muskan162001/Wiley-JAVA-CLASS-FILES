//package Code_26_April;
import java.io.*;

public class FileStreams {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("M:\\wiley java\\data\\data4.txt");
        String str = "Wiley Project";

        byte[] b = str.getBytes();
        fos.write(b);
        fos.flush();
        fos.close();

        FileInputStream fin = new FileInputStream("M:\\wiley java\\data\\data4.txt");

        int i = 0;
        while((i = fin.read()) != -1){
            System.out.println((char)i);
        }
        fin.close();
    }
}
