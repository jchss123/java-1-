import java.util.Scanner;
public class ifIf {
    // 숫자를 10개 입력 받아 가장 큰숫자와 가장 작은 숫자비교
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int max = num;
        int min =num;


        for (int i = 1; i < 10; i++) {
            System.out.println("숫자를 입력하세요");
            num=s.nextInt();
            if (max < num) {
                max=num;
            }
            if(min>num){
                min=num;
            }
        }
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
    }
}
