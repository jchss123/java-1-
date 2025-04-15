package arr;


import java.util.Random;
import java.util.Scanner;

public class arrEx3 {
    public static void main(String[] args) {
        int[] myResult = new int[3]; // 정답
        int[] answer = new int[3];   // 사용자 시도
        Scanner s = new Scanner(System.in);

//        System.out.println("🎯 정답 숫자 3개를 입력해주세요 (예: 1 2 3): ");
//        for (int i = 0; i < 3; i++) {
//            System.out.print((i + 1) + "번째 숫자 입력: ");
//            myResult[i] = s.nextInt();
//        }


        int answerCount = 0;
        Random rand=new Random();

        int index = 0;
        while (index < myResult.length){
            //
            int randomNumber = rand.nextInt(9) + 1;
            boolean duplicate = false;
            for(int i= 0; i < myResult.length; i++ ){
                if(myResult[i] == randomNumber) {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate) {
                myResult[index] = randomNumber;
            }
            index++;
        }




        while (true) {
            int strike = 0;
            int ball = 0;

            System.out.println("\n🚀 숫자 3개를 입력하세요 (시도 " + (answerCount + 1) + "): ");
            for (int i = 0; i < 3; i++) {
                System.out.print((i + 1) + "번째 숫자: ");
                answer[i] = s.nextInt();
            }
            answerCount++;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (myResult[i] == answer[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                        break;
                    }
                }
            }

            if (strike == 0 && ball == 0) {
                System.out.println("❌ OUT!");
            } else {
                System.out.println("✅ Strike: " + strike + ", Ball: " + ball);
            }

            if (strike == 3) {
                System.out.println("🎉 정답입니다!");
                break;
            }
        }

        System.out.println("총 " + answerCount + "   번 만에 정답을 맞췄습니다! 👏");
    }
}




