package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Linked {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<>();

        Person person = new Person("Tim");
        Person person1 = new Person("Tom");
        Person person3 = new Person("Pit");

        list.add(person);
        list.add(person1);
        list.add(person3);
        System.out.println(list);
        System.out.println("длинна списка" + list.size());

        list.remove(1); // удалили сместили
        System.out.println(list.get(1));
    }
}
