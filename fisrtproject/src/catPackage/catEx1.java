package catPackage;

public class catEx1 {
    public static void main(String[] args) {
        catEx2 cat1=new catEx2();
        catEx2 cat2=new catEx2("샴");
        catEx2 cat3=new catEx2("러시안불루","회색");

        cat3.breed="러시안불루";
        System.out.println("첫번쨰 고양이 품종"+cat1.breed+"\t색상"+cat1.color);
        System.out.println("첫번쨰 고양이 품종"+cat2.breed+"\t색상"+cat2.color);
        System.out.println("첫번쨰 고양이 품종"+cat3.breed+"\t색상"+cat3.color);
    }
}
