package dogPackage;

public class dogEx1 {
    public static void main(String[] args) {
        dogEx2 obj=new dogEx2();

        obj.breed ="포메";
        obj.color="갈색";

        System.out.println("강아지 품종:"+obj.breed);
        System.out.println("강아지색상:"+obj.color);


        obj.bowwow();
        obj.age=10;
        System.out.println("강아지 나이:"+obj.age);
        obj.run();

//        obj.name="다운";
//        System.out.println("강아지 이름:"+obj.name);
//        obj.sleep();

    }
}
