package pckg_trd;

import java.util.Stack;

public class TestApp {
    public static void main(String[] args) {
        Stack<Person> stackedPersons = new Stack<>();
        stackedPersons.add(new Person("Franko"));
        stackedPersons.add(new Person("Franka"));
        stackedPersons.add(new Person("Wayne"));
        stackedPersons.add(new Person("Lucynda"));
        System.out.println(stackedPersons);
        Person person = stackedPersons.pop();
        System.out.println(person);
        System.out.println(stackedPersons);
        reverseString("this is a string to reverse");


    }
    private static void reverseString(String someString){
        Stack<Character> chars = new Stack<>();
        for (int idxCh=0; idxCh<someString.length(); idxCh++){
           // System.out.println(someString.charAt(idxCh));
            chars.add(someString.charAt(idxCh));

        }
        System.out.println(chars);

        while (!chars.isEmpty()){
            String reversed = " ";
            Character ch = chars.pop();
            reversed += ch;
        }
        //System.out.println(reversed);
    }
}
