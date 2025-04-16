package thisPackage;

public class thisEx2 {
    String firstName;
    String country;
    int age;

    public thisEx2(){
        this("지창현");
    }
    public thisEx2(String mName){
        this(mName,20);
    }
    public thisEx2(String mName,int mAge){
        this(mName,mAge,"대한민국");
    }
    public thisEx2(String mName,int mAge,String mCountry){
        firstName = mName;
        age = mAge;
        country = mCountry;
    }

    void printInfo(){
        System.out.println("이름:"+firstName);
        System.out.println("국적:"+country);
        System.out.println("나이:"+age);

    }

}
