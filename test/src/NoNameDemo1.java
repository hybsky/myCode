public class NoNameDemo1 {
    public static void main(String[] args) {
        Pet p = new DogNoName() {
//            @Override
//            public void meng() {
//                run();
//                System.out.println("Pet is meng...");
//            }

            @Override
            public void meng() {
                run();
                super.meng();
            }

            public void run(){
                System.out.println("Pet is running...");
            }
        };
        p.meng();
        //p.run();抽象类中只有meng()，p是Pet类的子类，不能调用run()
//        new Pet() {
//            @Override
//            public void meng() {
//                run();
//                System.out.println("Pet is meng...");
//            }
//            public void run(){
//                System.out.println("Pet is running...");
//            }
//        }.run();
    }
}
abstract class Pet{
    abstract public void meng();
}

class DogNoName extends Pet{
    @Override
    public void meng() {
        System.out.println("Dog is meng~~~");
    }
}
