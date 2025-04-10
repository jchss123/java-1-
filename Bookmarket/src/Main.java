import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner s1 =new Scanner(System.in);
        System.out.println("당신의 이름을 입력하세요");
        String name=s1.nextLine();
        System.out.println(("연락처를 입려하세요"));
        int num=s1.nextInt();
        System.out.println(name);
        System.out.println(num);

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
        int cNum=s1.nextInt();

        System.out.println(cNum+"번을 선택하셨습니다");
    }
}
//공부