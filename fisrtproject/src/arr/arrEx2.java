//package arr;
//
//public class arrEx2 {
//    public static void main(String[] args) {
//        int[][] myArr=new int[2][4];
//        myArr[0][0]=2;
//        myArr[0][1]=5;
//        myArr[0][2]=7;
//        myArr[0][3]=4;
//        myArr[1][0]=9;
//        myArr[1][1]=3;
//        myArr[1][2]=2;
//        myArr[1][3]=8;
//        int sum1=0,sum2=0;
//        for(int i=0;i<4;i++){
//            sum1 +=myArr[0][i];
//        }
//        System.out.println("첫번째 행의 합계:"+sum1);
//        for(int i=0;i<4;i++){
//            sum2 +=myArr[1][i];
//        }
//
//        System.out.println("두 번쨰 행의 합계:"+sum2);
//    }
//}
//package arr;
//
//import java.util.Scanner;
//
//public class arrEx2 {
//    public static void main(String[] args) {
//        double[][] marks=new double[2][3];
//        Scanner s=new Scanner(System.in);
//
//        for(int i=0;i<2;i++){
//            System.out.println("학생번호:"+(i+1));
//            System.out.print("국어점수:");
//            marks[i][0]=s.nextDouble();
//
//            System.out.print("수학점수:");
//            marks[i][1]=s.nextDouble();
//            marks[i][2]=(marks[i][0]+marks[i][1])/2;
//        }
//        for(int i=0;i<2;i++){
//            System.out.println("학생번호"+(i+1));
//            System.out.print("국어"+":"+marks[i][0]+" ");
//            System.out.print("수학"+":"+marks[i][1]+" ");
//            System.out.print("평균"+":"+marks[i][2]+" ");
//        }
//    }
//
//}

//package arr;
// public class arrEx2 {
//    public static void main(String[] args) {
//        int rows = 2, columns = 3;
//        int[][] firstMatrix = { {2, 3, 4}, {3, 2, 1} };
//        int[][] secondMatrix = { {1, 2, 3}, {-4, -2, 1} };
//        int[][] sum = new int[rows][columns];
//        for (int i = 0; i < rows; i++){
//            for(int j = 0; j < rows; j++){
//                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
//            }
//        }
//                   System.out.println("두 행렬의 합: ");
//                for (int i= 0; i< rows; i++) {
//                        for (int j = 0; j < columns; j++) {
//                                System.out.print(sum[i][j] + " ");
//                           }
//                      System.out.println();
//                 }
//            }
//        }

package arr;

import java.util.Scanner;

public class arrEx2 {
     public static void main(String[] args) {
         int[][] sumArr = new int[4][4];
         Scanner s = new Scanner(System.in);

         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 System.out.print(i + ", "+ j + "숫자를 입력하세요");
                 sumArr[i][j] = s.nextInt();
             }

         }
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 sumArr[i][3]=sumArr[i][3]+sumArr[i][j];
                 sumArr[3][j]=sumArr[3][j]+sumArr[i][j];
                 sumArr[3][3]=sumArr[3][3]+sumArr[i][j];

             }

         }
         for (int j = 0; j < 3; j++) {
           System.out.println(j+"행의합:"+sumArr[j][3]);

         }
         for(int i = 0; i < 3; i++){
             System.out.println(i+"열의합:"+sumArr[3][i]);
        }
         System.out.println("열과행의 총합:"+ sumArr[3][3]);
     }
}
