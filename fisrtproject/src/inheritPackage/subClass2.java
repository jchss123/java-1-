package inheritPackage;

public class subClass2 extends superClass2{
    String age ="2살";
    void printInfo(){
        System.out.println("아기고양이입니다");
    }

    void printDetail(){
        super.printInfo();
        System.out.println("품종은"+super.breed+"나이는"+super.age);
        printInfo();
        System.out.println("품종은"+this.breed+"나이는"+this.age);
    }
}
