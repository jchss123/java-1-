//public class arr {
//    public static void main(String[] args) {
//        int[] myArr=new int[5];
//        myArr[0]= 10;
//        myArr[1]= 20;
//        myArr[2]= 30;
//        myArr[3]= 40;
//        myArr[4]= 50;
//        for(int i=0;i<5;i++){
//            System.out.println(i+"번째 요소값:"+myArr[i]);
//        }
//    }
//}

//import java.util.Scanner;
//
//public class arr {
//    public static void main(String[] args) {
//        String[] myArr=new String[3];
//        Scanner s=new Scanner(System.in);
//        System.out.println("3개의 문자열을 입력하세요");
//        for(int i=0;i<3;i++){
//            myArr[i]=s.nextLine();
//        }
//        for(int i=0;i<3;i++){
//            System.out.println(myArr[i]+" ");
//        }
//    }
//}
package arr;
public class arrEx1 {
     public static void main(String[] args) {
        double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};
        double sum = 0.0;
         for (double v : gradeArr) {
             sum += v;
         }

        double average = sum / gradeArr.length;
             System.out.println("합계: "+ sum);
             System.out.format("평균: %.2f", average);
     }

          }