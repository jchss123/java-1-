package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapEx3 {
    public static void main(String[] args) {
        HashMap<Integer,String> str=new HashMap<Integer,String>();

        str.put(1,"a");
        str.put(2,"b");
        str.put(3,"c");

        System.out.println(str);

        System.out.println("keys:");
        for(Integer key:str.keySet()){
            System.out.println(key);
            System.out.println(",");
        }
        System.out.println();
                System.out.print("Values : ");
                for (String value : str.values()) {
                        System.out.print(value);
                      System.out.print(", ");
                   }

                System.out.println();
                System.out.print("Keys=Values : ");
                for (Entry<Integer, String> entry : str.entrySet()) {
                            System.out.print(entry);
                          System.out.print(", ");
        }
    }
}
