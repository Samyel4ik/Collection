package MyList;

import java.util.LinkedList;

public class ClassTest {
    public static void main(String[] args) {

        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("ttt");
        list.add("aaa");
        list.add("ccc");
        list.add("nnn");
        list.add("mmm");


        System.out.println("длинна списка"+list.getSize());

        System.out.println(list);

        System.out.println(list.get(2));


    }
}
