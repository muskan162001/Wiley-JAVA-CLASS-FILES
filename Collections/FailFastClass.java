package Collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastClass {
    public static void main(String[] args){
        List < String > list = new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("b");
        list.add("d");

        Iterator < String > it = list.iterator();

        while(it.hasNext()){
            String el = it.next();
            System.out.println(el);
            list.add("c");
        }

        System.out.println(list);
    }
}
