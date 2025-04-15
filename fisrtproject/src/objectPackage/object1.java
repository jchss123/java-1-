package objectPackage;

public class object1 {
    public static void main(String[] args) {


       System.out.println("******학생주소록*****");

        object2 st2=new object2();
        st2.insertRecord(2001,"지창현");
        st2.printInfo();

        object2 st3=new object2(2021,"넌누구야");
        st3.printInfo();
    }
}
