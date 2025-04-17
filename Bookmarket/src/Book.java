public class Book {
    String id;
    String title;
    String price;
    String name;
    String explain;
    String kind;
    String date;



    public Book( String id,String title,String price,String name,String explain,String kind,String date){
        this.id=id;
        this.title=title;
        this.price=price;
        this.name=name;
        this.explain=explain;
        this.kind=kind;
        this.date=date;
    }

    public String getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }
    public String getExplain(){
        return this.explain;
    }
    public String getKind(){
        return this.kind;
    }
    public String getDate(){
        return this.date;
    }

}
