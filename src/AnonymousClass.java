public class AnonymousClass {
    public static void main(String[] args){
        //AnnonymousClass - A class that doesnot have a name. Cannot be used
        //                  Add customer behaviour without having to create a new class
        //                  often used for one time uses (TimeTask, Runnable, callbacks)

        Dog dog = new Dog();
        Dog dog1 = new Dog() {
            @Override
            void speak() {
                System.out.println("The dog say Ruh Roh");
            }
        };


       dog.speak();
        dog1.speak();

    }
}
