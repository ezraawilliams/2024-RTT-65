package org.ezrawilliams.introtojavabasics2;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> mapObj = new HashMap<>();
        mapObj.put(1, "Per Scholas New Yok, NY");
        mapObj.put(2, "Per Scholas Atlanta GA");
        mapObj.put(3, "Per Scholas Columbas, OH");
        mapObj.put(3, "Per Scholas  Florida, Orlando");
        mapObj.put(4, "Per Scholas Chicago, Ill");
        mapObj.put(5, "Per Scholas Chicago, Ill");
        mapObj.put(1, "Per Scholas New Jersey , NJ");
        mapObj.put(null, "Per Scholas Dallas , TX");
        mapObj.put(6, null);
        mapObj.put(null, "Per Scholas Atlanta, GA");
        mapObj.put(7,null);
        System.out.println(mapObj);
    }

}
