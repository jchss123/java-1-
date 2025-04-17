public class Cart {
    CartItem[] mCart=new CartItem[3];
    int mCartItemCount=0;

    public boolean isCartInBook(String bookId){
        for(int i=0;i<this.mCartItemCount;i++){
            if(bookId.equals(this.mCart[i].getBook().getId())){
                return true;
            }
        }
        return false;
    }

    public void appendBook(Book book){
       for(int i=0;i<this.mCartItemCount;i++){
           if()
       }
    }

    public void inCreaseBookCount(String bookId){
        for(int i=0;i<this.mCartItemCount;i++){
            if(this.mCart[i].getBook().getId().equals(bookId)){
                this.mCart[i].setCount(this.mCart[i].getCount()+1);
                return;
            }
        }
    }
}
