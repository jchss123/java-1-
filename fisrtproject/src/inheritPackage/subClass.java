package inheritPackage;


    class subclass extends superClass{
        String name;
        void printInfo(){
            System.out.println("아기 고양이입니다");
        }
        void printDetail(){
            super.printInfo();
            printInfo();
            super.name="SuperCat";
            name="subKitten";
        }
    }

