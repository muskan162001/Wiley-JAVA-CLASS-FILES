package Collections;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args){
        TreeMap < Integer, String > tmap = new TreeMap<Integer, String>();

        tmap.put(1000, "Muskan");
        tmap.put(2000, "df");
        tmap.put(400, "gfg");

        System.out.println(tmap);

        tmap.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
        System.out.println("Last Key " + tmap.lastKey());
        System.out.println("First Value " + tmap.firstKey());

        Set < Integer > Keyslessthan3k = tmap.headMap(3000).keySet();
        System.out.println(Keyslessthan3k);
        
        Set < Integer >Keysmorethan3k = tmap.tailMap(3000).keySet();
        System.out.println(Keysmorethan3k);


        TreeMap < Integer, String > usermap = new TreeMap<Integer, String>();

        tmap.put(1000, "Muskan");
        tmap.put(2000, "df");
        tmap.put(400, "gfg");


    }
}
