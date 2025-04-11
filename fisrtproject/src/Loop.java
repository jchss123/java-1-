import java.util.Scanner;

//public class Loop {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.print("길이");
//
//        int len= s.nextInt();
//
//        for(int i =0;i<len;i++){
//
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//
//            for(int j=0;j<(2*len)-1-(i*2);j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
//}

public class Loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("개수를 입력하세요");

        int len = s.nextInt();

        // 직각삼각형의 높이를 결정
        for (int i = 0; i < len; i++) {
            // 별 출력 하나씩 줄어들도록
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
              // 공백 출력 하나씩 증가
            for(int j=0; j < len - i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
