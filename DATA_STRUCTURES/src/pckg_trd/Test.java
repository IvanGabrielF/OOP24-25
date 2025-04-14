package pckg_trd;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<Person> persons = new LinkedList<>();
        Person person = new Person("EDI");
        persons.add(person);
        persons.add(person);
        persons.add(new Person("Goga"));
        persons.add(new Person("Mišela"));
        persons.add(new Person("Adi"));
        persons.add(new Person("EDIt"));
        persons.add(2, new Person("NOVItada"));
        System.out.println(persons);
        TreeSet<Person> tpersons = new TreeSet<>(persons);
        System.out.println(tpersons);
        LinkedHashSet<Person> lpersons = new LinkedHashSet<>(persons);
        System.out.println(lpersons);
        HashSet<Person> setPersons = new HashSet<>(persons);
        System.out.println(setPersons);

    }
}
