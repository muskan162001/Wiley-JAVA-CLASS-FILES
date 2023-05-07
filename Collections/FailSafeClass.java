package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeClass {
    public static void main(String[] args){
        Map < Integer, String> mymap = new ConcurrentHashMap<Integer, String>();
        mymap.put(1 , "java");
        mymap.put(2 , "python");

        Iterator it = mymap.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println(key + " : " + mymap.get(key));
            mymap.put(3, "react");
        }
    }
}
