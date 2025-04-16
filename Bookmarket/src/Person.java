public class Person {
    // 맴버 변수
    private String name;
    private String phone;

    // 생성자는 맴버변수를 초기화시킨다
    public Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName(){
        return  this.name;
    }

    public String getPhone(){
        return  this.phone;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPhone(String phone){
        this.phone=phone;
    }
}
