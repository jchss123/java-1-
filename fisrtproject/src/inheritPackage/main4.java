package inheritPackage;

public class main4 {
    public static void main(String[] args) {
        superClass4 my=new superClass4();
        superClass4 dog=new subClass4();
        superClass4 pig=new sub2Class4();
        my.animalSound();
        dog.animalSound();
        pig.animalSound();
    }
}


