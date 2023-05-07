package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapClassess {
    public static void main(String[] args){
        Map < String, String> ss = new HashMap<String, String>();
        ss.put("a", "a");
        ss.put(null, null);
        ss.put("b", null);
        ss.put("c", null);
        ss.put(null, "f");

        System.out.println(ss);


        HashMap <String, Integer> empId = new HashMap<String, Integer>();
        empId.put("a", 1);
        empId.put("a", 2);
        

    }
}
