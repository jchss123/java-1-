package Maptest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MaptestEx1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("x",10);
        map.put("y",20);

        Set<Map.Entry<String,Integer>>entries=map.entrySet();
        entries.removeIf(e->e.getValue()==20);
        System.out.println(map);
    }
}
