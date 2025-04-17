package makeaddressPackage;

import java.util.Scanner;

public class MainUserClass {

    static UserClass[] users = new UserClass[3];
    static UserClass currentUser;

    //주소록 검색하는 함수
    public static void findAddress(){
        Scanner s=new Scanner(System.in);
       System.out.println("검색할 유저의 이름을 입력하세요");
         String inputUser = s.nextLine();
         if(inputUser.equals(users[0].getName())){
             System.out.println(users[0].getName()+"님의 주소는"+users[0].getName()+"번호는"+users[0].getNumber());
         }
        if(inputUser.equals(users[1].getName())){
            System.out.println(users[1].getName()+"님의 주소는"+users[1].getName()+"번호는"+users[1].getNumber());
        }
        if(inputUser.equals(users[2].getName())){
            System.out.println(users[2].getName()+"님의 주소는"+users[2].getName()+"번호는"+users[2].getNumber());
        }
    }
    //전체 주소록 검색
    public static void findEverything(){
        System.out.println(users[0].getName()+"님의 주소:"+users[0].getCountry()+users[0].getName()+"님의 번호는"+users[0].getNumber());
        System.out.println(users[1].getName()+"님의 주소:"+users[1].getCountry()+users[1].getName()+"님의 번호는"+users[1].getNumber());
        System.out.println(users[2].getName()+"님의 주소:"+users[2].getCountry()+users[2].getName()+"님의 번호는"+users[2].getNumber());
    }
    //내 정보 변경
    public static void changeInformation(){
        Scanner s=new Scanner(System.in);

        System.out.println(currentUser.getName()+"님에 현제비밀번호는"+currentUser.getPw()+"변경하실비밀번호를 입력하세요");
        String change=s.nextLine();
        currentUser.setPw(change);
        System.out.println(currentUser.getName()+"비밀번호가"+currentUser.getPw()+"로변경되었습니다");
        System.out.println(currentUser.getName()+"님에 현제 주소는"+currentUser.getCountry()+"변경하실주소를 입력하세요");
        String change1=s.nextLine();
        currentUser.setCountry(change1);
        System.out.println(currentUser.getName()+"주소가"+currentUser.getCountry()+"로변경되었습니다");
        System.out.println(currentUser.getName()+"님에 현제번호는"+currentUser.getNumber()+"변경하실번호를 입력하세요");
        String change2=s.nextLine();
        currentUser.setNumber(change2);
        System.out.println(currentUser.getName()+"번호가"+currentUser.getNumber()+"로변경되었습니다");
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
            if(inputId.equals(users[i].getId())){
                if(inputPw.equals(users[i].getPw())){
                    currentUser=users[i];
                    mainPage();
                }
            }
        }
    }

    //주소록 관리 로그인 종료 하는 화면
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        UserClass user=new UserClass("aa", "123", "aa", "경기", "123");
        UserClass user1=new UserClass("bb", "123", "bb", "부산", "123");
        UserClass user2=new UserClass("cc", "123", "cc", "서울", "123");
        users[0] = user;
        users[1] = user1;
        users[2] = user2;

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
