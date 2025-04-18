package inheritPackage;

public class subClass3 extends superClass3{
    String name;
    String age="2살";
    public subClass3(String n1,String n2){
        super(n1);
        this.name=n2;
        System.out.println("아기고양이입니다"+"이름은"+name);

    }
}
