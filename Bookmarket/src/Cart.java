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
      this.mCart[this.mCartItemCount]=new CartItem(book);
      this.mCartItemCount++;
    }

    public void t(String bookId){
        for(int i=0;i<this.mCartItemCount;i++){
            if(this.mCart[i].getBook().getId().equals(bookId)){
                this.mCart[i].setCount(this.mCart[i].getCount()+1);
                return;
            }
        }
    }


    public Book deCreaseBookCount(String bookId){
        Book book=null;
        for(int i=0;i<mCartItemCount;i++){
            if(this.mCart[i].getBook().getId().equals(bookId)){
                book=this.mCart[i].getBook();
                this.mCart[i].setCount(this.mCart[i].getCount()-1);
                if(this.mCart[i].getCount()==0){
                    System.out.println("수량이 0이되어 항목을 장바구니에서 삭제합니다");
                    this.removeCartItem(i);
                    break;
                }
            }
        }
        return book;
    }


    private void removeCartItem(int index){
        for(int i=index; i<this.mCartItemCount-1;i++){
            this.mCart[i]=this.mCart[i+1];
        }
        this.mCart[this.mCartItemCount-1]=null;
        this.mCartItemCount--;
    }


    public void printCart(){
        System.out.println("장바구니상품 목록보기");
        System.out.println("---------------------------");
        System.out.println("도서ID\t\t|수량\t\t\t|총가격");

        for(int i=0;i<this.mCartItemCount;i++){
            System.out.print((i+1)+" "+this.mCart[i].getBook().getId()+"\t|");
            System.out.print(this.mCart[i].getCount()+"\t\t\t|");
            System.out.print(this.mCart[i].getTotalPrice());
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void clearCart(){
        this.mCart=new CartItem[3];
        this.mCartItemCount=0;
    }

    public Book removeCartItem(String bookId){
        Book book=null;
        for(int i=0;i<this.mCartItemCount;i++){
            if(this.mCart[i].getBook().getId().equals(bookId)){
                book=this.mCart[i].getBook();
                this.removeCartItem(i);
                break;
            }
        }
        return book;
    }


}



