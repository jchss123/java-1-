import java.util.Scanner;

public class BookMarketManger {
    Book[] Books=new Book[3];
   private Cart mCart =new Cart();



    public BookMarketManger() {

        Books[0] = new Book("ISBNI1234", "쉽게 배우는 JS웹 프로그래밍", "27000", "송미명", "단계별 쇼핑물을 구현하며 배우는 JSP웹 프로그래밍", "IT전문서", "2020/11/23");
        Books[1] = new Book("ISBNI3123", "안드로이드 프로그래밍", "33000", "우재남", "실습 단계별 명쾌한 멘토링", "IT전문서", "2023/3/5");
        Books[2] = new Book("ISBIN4123", "스크래치", "22000", "고광일", "컴퓨터 사교력을 키우는 블록 코딩", "컴퓨터 입문", "2019/10/20");
    }
        // 사용자에게 입력을 받기 위한 Scanner 객체 생성


//----------------------------------------------------------------------------
public void run() {
    Scanner s1 = new Scanner(System.in);

    // 사용자에게 이름 입력 받기
    System.out.print("당신의 이름을 입력하세요 : ");
    String name = s1.nextLine();

    // 사용자에게 연락처 입력 받기
    System.out.print(("연락처를 입려하세요:"));
    String phone = s1.nextLine();

    // 사용자에게 입력 받은 이름과 연락처로 Person 객체 생성
    Person user = new Person(name,phone);
    // 종료버튼 누르기 전까지 무한 반복
    while (true) {
        // 사용자에게 보여주는 UI(메뉴)
        System.out.println("\t\tWelcome to Shopping Mall!");
        System.out.println("\t\tWelcome to Book Market!");
        System.out.println("***************************************");
        System.out.print("1.고객 정보 확인하기\t\t");
        System.out.print("4.바구니 항목에 추가하기\n");
        System.out.print("2.장바구니 상품목록 보기\t");
        System.out.print("5.장바구니의 항목 추가하기\n");
        System.out.print("3.장바구니 비우기\t\t\t");
        System.out.print("6장바구니의 항목 삭제하기\n");
        System.out.print("7.영수증 표시하기\t\t\t");
        System.out.print("8.종료\n");
        System.out.println("***************************************");

        // 사용자에게 메뉴 번호 입력받기
        System.out.print("메뉴 번호를 선택해주세요");
        int cNum = s1.nextInt();

        // while 문을 false로 만들어서 나갈려고
        boolean endflag = false;

        //번호를 선택했을때 각번호에 해당하는 메서드를 불러온다
        switch (cNum) {
            case 1:
                menuGuestInfo(user);
                break;
            case 2:
                voidmenuCartItemList();
                break;
            case 3:
                menuCartClear();
                break;
            case 4:
                menuCartAddItem();
                break;
            case 5:
                menuCartRemoveItemCount();
                break;
            case 6:
                menuCartRemoveItem();
                break;
            case 7:
                menuCartBill();
                break;
            case 8:
                endflag = menuExit();
                break;
        }
        if (endflag) {
            break;
        }
    }

 }



    // 유저에 이름과 번호를 가지고 오기위해서
    public  void menuGuestInfo(Person user){
        System.out.println("고객님의 이름:" + user.getName() + "\n고객님의 번호:" + user.getPhone());
    }

    public  void voidmenuCartItemList(){
        System.out.println("2.장바구니 상품목록 보기\t");
    }

    public void menuCartClear(){
        System.out.println("3.장바구니 비우기\t\t\t");
    }

    public void menuCartAddItem(){
        mbook();
    }

    public void menuCartRemoveItemCount(){
        System.out.println("5.장바구니의 항목 추가하기\n");
    }

    public  void menuCartRemoveItem(){
        System.out.println("6장바구니의 항목 삭제하기\n");
    }

    public void menuCartBill(){
        System.out.println("7.영수증 표시하기\t\t\t");
    }

    public  boolean menuExit(){
        System.out.print("8.종료\n");
        return true;
    }




    public  void mbook() {

        Scanner addId = new Scanner(System.in);
        Scanner yn = new Scanner(System.in);
        boolean yesNo = true;





        for (int i = 0; i < 3; i++) {
            {
                System.out.print(Books[i].getId() +" | " + Books[i].getTitle() + " | "+ Books[i].getPrice()+ " | "+Books[i].getName()+ " | "+Books[i].getExplain()+ " | "+Books[i].getKind()+ " | "+Books[i].getDate());
            }
            System.out.println();
        }

        while (yesNo) {
            System.out.print("장바구니에 추가할 아이디를 입력하세요");
            String id = addId.nextLine();
            for (int i = 0; i < 3; i++) {
                if (Books[i].getId().equals(id)) {
                    System.out.println("장바구니에 추가하겠습니까? Y|N");
                    String yes = yn.nextLine();
                    if (yes.equals("y")) {
                        if (!this.mCart.isCartInBook(Books[i].id)) {
                            mCart[mCartItemCount] = new CartItem(Books[i]);
                            mCartItemCount++;
                        }
                        System.out.println(Books[i]+"장바구니에 추가되었습니다");
                        yesNo = false;
                        System.out.println();//안에 mBook[i][0]의값을 집어넣야된다
                    }else {
                        System.out.println("취소되었습니다");
                    }
                }
            }
        }
    }
}






