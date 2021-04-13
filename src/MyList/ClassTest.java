package MyList;


public class ClassTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.addTail("ttt");
        list.addTail("aaa");
        list.addTail("ccc");

        list.addHead("mmm");
        list.addHead("ggg");
        list.addHead("www");
        System.out.println("список от начала до конца");
        list.printHeadTail();
        System.out.println("--------------");
//        System.out.println("список от конца до начала");
//        list.printTailHead();
        System.out.println("длинна списка: " + list.getSize());
        System.out.println(list.get(0));
        System.out.println(list.indexOf("ttt"));
        System.out.println(list.contains("ttt"));

        list.remove(6);
        list.printHeadTail();
        System.out.println(list.getSize());

        list.remove("www");
        list.printHeadTail();

        System.out.println("+++++++++++");
        list.add("lll",1);
        list.printHeadTail();
    }
}
