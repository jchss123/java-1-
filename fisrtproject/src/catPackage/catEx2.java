package catPackage;

public class catEx2 {
    String breed;
    String color;
    catEx2(){
        System.out.println("생성자를 호출합니다");
    }
    catEx2(String pBreed){
        System.out.println("생성자를 호출합니다");
        breed=pBreed;
    }

    catEx2(String pBreed,String pColor){
        breed=pBreed;
        color=pColor;
    }

    void eat(){
        System.out.println("먹이를 먹다");
    }
    void scratch(){
        System.out.println("발톱으로 할퀴다");
    }
    void meow(){
        System.out.println("야옹 하고 울다");
    }
}
