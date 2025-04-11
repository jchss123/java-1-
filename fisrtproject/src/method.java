
//public class method {
//    public static int div(){
//        int a=10,b=5;
//        int result = a/b;
//        return result;
//    }
//    public static void main(String[] args) {
//        int num=div();
//        System.out.println(num);
//    }
//
//}

//public class method {
//    public static  int add(int x, int y){
//        return x+y;
//    }
//    public static void main(String[] args) {
//     int a=5,b=6;
//     int sum= add(a,b);
//     System.out.println((a+"와"+b+"합은"+sum+"입니다"));
//    }
//}

//public class method {
//    public static void calculate(int x, double y){
//        System.out.println(2*x*y);
//    }
//    public static void main(String[] args) {
//        int a=4;
//        double pi =3.14;
//        System.out.println("원의 둘레 구하는 공식:2x반지름x원주율");
//        System.out.print("2X"+a+"X"+pi+"=");
//        calculate(a,pi);
//    }
//}


//public class method {
//    public static void calculate(int x,int y){
//        System.out.println(x*y);
//    }
//    public static void calculate(int x){
//        System.out.println(x*x);
//    }
//    public static void calculate(int x,double y){
//        System.out.println(x*y);
//    }
//    public static void calculate(double x){
//        System.out.println(x*x);
//    }
//
//    public static void main(String[] args) {
//        calculate(2,3);
//        calculate(2,3.14);
//        calculate(2);
//        calculate(2.5);
//    }
//}

public class method {
    public static int sum(int x,int y){
        return (x+y);
    }
    public static int sum(int x,int y,int z){
        return (x+y+z);
    }
    public static double sum(double x,double y){
        return (x+y);
    }

    public static void main(String[] args) {
        System.out.println("sum(10,20)의 값:"+sum(10,20));
        System.out.println("sum(10,20,30)의 값:"+sum(10,20,30));
        System.out.println("sum(10.5,20.5)의 값:"+sum(10.5,20.5));
    }
}