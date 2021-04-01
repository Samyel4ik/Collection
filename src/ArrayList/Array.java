package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<String> familyNames = new ArrayList<>();

        familyNames.add("Tom");
        familyNames.add("Tim");
        familyNames.add("Met");
        familyNames.add("Jesica");
        System.out.println("длинна списка " + familyNames.size());

        System.out.println("заполненный списаок" + familyNames);

        familyNames.remove(2);
        System.out.println(familyNames);
        System.out.println("длинна списка " + familyNames.size());
        List<Person> list = new ArrayList<>();
        Person person = new Person("tom");
        Person person1 = new Person("Tim");
        list.add(person);
        list.add(person1);

        Person personFromCollection = list.get(1);
        System.out.println(personFromCollection);

    }
}
