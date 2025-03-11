package pckg_fst;

public class Dog {
    private String name;
    private String breed;
    private int years;

    public Dog(String name, String breed, int yrs) {
        this.breed = breed;
        this.name = name;
        years = yrs;

    }
    public void bark(int times){
        for (int k=0; k<times; k++){
            System.out.println("AV, AV Grrr");
        }
    }
    public void run(){
        System.out.println("This dog can run");
    }
    public void eat(){
        System.out.println("This dog loves...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", years=" + years +
                '}';
    }
}
