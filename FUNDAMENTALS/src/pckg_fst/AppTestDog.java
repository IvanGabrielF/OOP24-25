package pckg_fst;

public class AppTestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bubby", "Doberman", 2);
        dog1.bark(3);
        dog1.run();
        dog1.eat();
        Dog dog2 = new Dog("Bupsy", "Labrador", 7);
        dog2.bark(3);
        dog2.run();
        dog2.eat();
        System.out.println(dog2);
        System.out.println(dog1);
    }

}
