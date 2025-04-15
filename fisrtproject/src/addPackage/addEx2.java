package addPackage;

public class addEx2 {
    addEx2(){
        System.out.println("기본 add()호출");
    }
    addEx2(int a,int b){
        System.out.println("일반 생성자 add(int a,int b)호출");
        System.out.println(a+"+"+b+"="+(a+b));
    }
    addEx2(double a,double b){
        System.out.println("일반 생성자 add(double a,double b)호출");
        System.out.println(a+"+"+b+"="+(a+b));
    }
    addEx2(int a,double b){
        System.out.println("일반 생성자 add(int a,double b)호출");
        System.out.println(a+"+"+b+"="+(a+b));
    }
}
