import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void menuGuestInfo(String name, String num){
        System.out.println("고객님의 이름:" + name + "\n고객님의 번호:" + num);
    }
    public static void voidmenuCartItemList(){
        System.out.println("2.장바구니 상품목록 보기\t");
    }
public static void menuCartClear(){
    System.out.println("3.장바구니 비우기\t\t\t");
}
    public static void menuCartAddItem(){
        System.out.println("4.바구니 항목에 추가하기\n");
    }
    public static void menuCartRemoveItemCount(){
        System.out.println("5.장바구니의 항목 추가하기\n");
    }
    public static void menuCartRemoveItem(){
        System.out.println("6장바구니의 항목 삭제하기\n");
    }
    public static void menuCartBill(){
        System.out.println("7.영수증 표시하기\t\t\t");
    }
    public static boolean menuExit(){

        System.out.print("8.종료\n");
        return true;
    }








    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String name = s1.nextLine();
        System.out.print(("연락처를 입려하세요:"));
        String num = s1.nextLine();


        while (true) {

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


            System.out.print("메뉴 번호를 선택해주세요");
            int cNum = s1.nextInt();
            boolean endflag = false;
            switch (cNum) {
                case 1:
                    menuGuestInfo(name,num);
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
}