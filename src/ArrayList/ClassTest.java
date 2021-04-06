package ArrayList;

public class ClassTest {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList();

        list.add("aaa");
        list.add("ddd");
        list.add("ccc");

        System.out.println(list);

        System.out.println("длинна списка " + list.size());
        System.out.println("эл по индексу " + list.get(0));
        System.out.println("индекс эл " + list.indexOf("aaa"));
        System.out.println("индекс эл " + list.indexOf("vvv"));
        System.out.println("проверка эл " + list.contains("aaa"));
        System.out.println("проверка эл " + list.contains("vvv"));

        list.remove(1);
        System.out.println(list + " удаление по индексу");

        list.remove("ccc");
        System.out.println(list + " удаление по эл");

    }
}