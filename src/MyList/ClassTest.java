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
        System.out.println("список от конца до начала");
        list.printTailHead();


    }
}
