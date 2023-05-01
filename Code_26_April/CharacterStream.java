//package Code_26_April;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) throws IOException{
        Writer out = new OutputStreamWriter(System.out);
        Writer fw = new FileWriter("M:\\wiley java\\data\\data4.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("I like programming, what to do");

        bw.flush();
        bw.close();
        fw.close();
    }
}
