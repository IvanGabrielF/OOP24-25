package pckg_snd;

public class Student {

    private String name;
    private String univeristy;
    private static int cntID = 100;
    private int id;

    private int yOfS;


    public Student(String name, String univeristy){
        this.name = name;
        this.univeristy = univeristy;
        this.id = cntID++;

    }

    public Student(String name, String uni, int yOfS){
        this(name,uni);
        this.yOfS = yOfS;

    }
    public Student nextYearOfStudy(){
        System.out.println("Succes - enrolled in the next study year!");
        this.yOfS++;
        return this;


    }


}
