package order;

import immutables.User;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Order {

    public void orderingHash(){
        Map<User, Integer> orderMap = new HashMap<>();
        for(int i=0;i<20;i++) {
            orderMap.put(new User("Test" + String.valueOf(i)), i);
        }
        System.out.println("Order map: " + orderMap);
    }

    public void orderingLinked(){
        Map<User, Integer> orderMap = new LinkedHashMap<>();
        for(int i=0;i<20;i++) {
            orderMap.put(new User("Test" + String.valueOf(i)), i);
        }
        System.out.println("Order map: " + orderMap);
    }

    public void orderingTree(){
        Map<User, Integer> orderMap = new TreeMap<>();
        for(int i=0;i<20;i++) {
            orderMap.put(new User("Test" + String.valueOf(i)), i);
        }
        System.out.println("Order map: " + orderMap);
    }

}
