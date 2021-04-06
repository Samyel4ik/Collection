package ArrayList;

public class ClassTest {
    public static void main(String[] args) {
        String[] array = new String[]{"5", "Java", "22"};

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.setMyArrayList(array);

        System.out.println("исходный " + myArrayList);

        MyArrayList myArrayList1 = addElement(myArrayList, "10");

        System.out.println("добавили одно число " + myArrayList1);//10 в конце

        System.out.println("длинна списка " + myArrayList1.size());//4
        String str = myArrayList1.getElement(0);

        System.out.println("элемент по заданному индексу " + str);//5

        System.out.println("индекс по  заданому элементу " + myArrayList1.getIndex("Java"));//1
        System.out.println("индекс по  заданому элементу " + myArrayList1.getIndex("100"));//-1

        System.out.println("наличие элемента " + myArrayList1.contains("100"));//false
        System.out.println("наличие элемента " + myArrayList1.contains("5"));//true
    }

    public static MyArrayList addElement(MyArrayList myArrayList, String str) {
        MyArrayList myArrayList1 = new MyArrayList();

        myArrayList1.setMyArrayList(myArrayList.addElement(str));
        return myArrayList1;

    }

}