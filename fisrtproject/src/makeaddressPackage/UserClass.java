package makeaddressPackage;

public class UserClass {
   private String name;
   private String number;
   private String country;
   private String id;
   private String pw;

   public UserClass(String id,String pw,String name,String country,String number){
       this.name=name;
       this.number=number;
       this.country=country;
       this.id=id;
       this.pw=pw;
   }

   public String getName(){
       return this.name;
   }
    public String getCountry(){
        return this.country;
    }
    public String getNumber(){
        return this.number;
    }
    public String getId(){
        return this.id;
    }
    public String getPw(){
        return this.pw;
    }


    public void setName(String name){
        this.name=name;
    }
    public void setCountry(String country){
         this.country=country;
    }
    public void setNumber(String number){
         this.number=number;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
