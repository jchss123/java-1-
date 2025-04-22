package set;

import java.util.HashSet;

public class HashsetEx2 {
    public static void main(String[] args) {
        HashSet<String> str=new HashSet<String>();

        str.add("A");
        str.add("B");
        str.add("C");
        System.out.println(str);

        System.out.println("HashSet 요소:");
        for(String elemets:str){
            System.out.println(elemets+"");
        }
        String[]array=new String[str.size()];
        str.toArray(array);

        System.out.println();
        System.out.println("Array요소:");
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+"");
        }
    }
}
