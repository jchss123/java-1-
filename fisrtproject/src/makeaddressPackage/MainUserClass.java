package makeaddressPackage;

import java.util.Scanner;

public class MainUserClass {



    static String[][] user= {
            //id   pw      이름   지역    번호
            {"aa", "123", "aa", "경기", "123"},
            {"bb", "123", "bb", "부산", "123"},
            {"cc", "123", "cc", "서울", "123"},
    };





    //주소록 검색하는 함수
    public static void findAddress(){
        Scanner s=new Scanner(System.in);
       System.out.println("검색할 유저의 이름을 입력하세요");
         String inputUser= s.nextLine();

         for(int i=0;i< user.length;i++) {
             if(inputUser.equals(user[i][3])){
                 System.out.println(user[i][3]+"님의 지역은"+user[i][4]+"번호는"+user[i][5]);
             }
         }


    }
    //전체 주소록 검색
    public static void findEverything(){

    }
    //내 정보 변경
    public static void changeInformation(){

    }


    //메인 페이지 불러오는 함수
    public static void mainPage(){
        Scanner s=new Scanner(System.in);


        while (true) {
            System.out.println("1.주소록 검색");
            System.out.println("2.전체 주소록검색");
            System.out.println("3.내정보변경");
            System.out.println("4.종료");
            int num = s.nextInt();
            if (num == 1) {
                findAddress();
            }
            if (num == 2) {
                findEverything();
            }
            if (num == 3) {
                changeInformation();
            }
            if (num == 4) {
                break;
            }
        }

    }


//로그인 페이지 불러오는 함수
    public static void log(){
        Scanner ss=new Scanner(System.in);
        System.out.println("아이디를 입력하세요");
        String inputId=ss.nextLine();
        System.out.println("비밀번호를 입력하세요");
        String inputPw=ss.nextLine();

        for(int i=0;i<3;i++){
            if(inputId.equals(user[i][0])){
                if(inputPw.equals(user[i][1])){
                    mainPage();
                }
            }

        }
    }

    //주소록 관리 로그인 종료 하는 화면
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        while (true) {
            System.out.println("<<주소록 관리>>");
            System.out.println("1.로그인");
            System.out.println("2.종료");
            int num =s.nextInt();
            if(num==2){
                break;
            }else if(num==1){
                log();

            }


        }
    }
}
//주수록 관리
//로그인
//종료
//로그인을 선택했을때 id님 환영합니다
//주소록검색 /전체 주소록 검색 /내정보 변경/로그아웃
//주소록 검색을 선택하면 검색할 유저이름/주소 /전화번호
//전체주소록 검색을 누르면 유저 전체 주소 보여주기
// 내정보변경 누르면 내정보값만 변경
//로그아웃누르면 기본페이지
//종료누르면 프로그램 끝