package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String>cats=new ArrayList<String>();

        cats.add("페르시안");
        cats.add(null);
        cats.add(1,"샴");

        System.out.println(cats.get(0));

     Iterator iter=cats.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
