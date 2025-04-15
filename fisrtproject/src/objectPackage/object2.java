package objectPackage;

public class object2 {
    int id;
    String name;

    object2(){
        System.out.println("호출");
    }
    object2(int parm1,String parm2){
        System.out.println("일반 사용자 호출");
        id=parm1;
        name=parm2;
    }

    void insertRecord(int parm1,String parm2){

        id=parm1;
        name=parm2;
    }

    void printInfo(){
        System.out.println("아이디:"+id);
        System.out.println("이름:"+name);
    }
}
