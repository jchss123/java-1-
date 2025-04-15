//package arr;
//
//public class arrEx4 {
//    public static void main(String[] args) {
//        String s1="java";
//        String s2= "java";
//        String s3=new String("java");
//        String s4=new String ("java");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
//
//
//    }
//}

//package arr;
//public class arrEx4 {
//    public static void main(String[] args) {
//        String s=" JAVA Programming ";
//        System.out.println("s.lenght():"+s.length());
//        System.out.println("s.charAt(1):"+s.charAt(1));
//        System.out.println("s.substring(6):"+s.substring(6));
//        System.out.println("s.substring(5,13):"+s.substring(5,13));
//        System.out.println("s.indexOf('p'):"+s.indexOf("p"));
//        System.out.println("s.toLowerCase():"+s.toLowerCase());
//        System.out.println("s.toUpperCase():"+s.toUpperCase());
//
//
//    }
//}


//package arr;
//public class arrEx4 {
//    public static void main(String[] args) {
//        String s=" JAVA Programming ";
//        String s1="JAVA";
//        String s2=" Programming";
//        String s3=s1.concat(s2);
//        String s4=s.trim();
//        System.out.println("s3:"+s3);
//        System.out.println("s4:"+s4);
//        System.out.println("s3.equals(s4):"+s3.equals(s4));
//    }
//}


//package arr;
//public class arrEx4 {
//    public static void main(String[] args) {
//        String s1="JAVA";
//        String s2="JAVA";
//        String s3="java";
//        System.out.println(s1 == s2);
//        System.out.println(s1 != s2);
//
//        System.out.println(s2 == s3);
//        System.out.println(s2 != s3);
//        String s4=s2+s3;
//        System.out.println(s4);
//    }
//}

package arr;
public class arrEx4 {
    public static void main(String[] args) {
        String s1=new String("JAVA");
        String s2=new String("JAVA");
        String s3=s1;

        if(s1==s2){
            System.out.println("s1과 s2는 같다");
        }else {
            System.out.println("s1과s2는 같지 않다");
        }

        if(s1==s3){
            System.out.println("s1과 s3는 같다");
        }else {
            System.out.println("s1과s3는 같지 않다");
        }

        if(s1.equals(s2)){
            System.out.println("s1과 s2의값은 같다");
        }else {
            System.out.println("s1과s2의 값은 같지 않다");
        }

    }
}