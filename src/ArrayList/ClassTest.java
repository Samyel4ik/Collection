package ArrayList;

public class ClassTest {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};

        myArrayList.setMyArrayList(people);


        System.out.println("исходный " + myArrayList);

        MyArrayList myArrayList1 = addElement(myArrayList, "10");

        System.out.println("добавили одно число " + myArrayList1);//10 в конце

        System.out.println("длинна списка " + myArrayList1.size());//4

        System.out.println("элемент по заданному индексу " + myArrayList1.getEssence(0));//5

        System.out.println("индекс по  заданому элементу " + myArrayList1.getIndex("Java"));//-1
        System.out.println("индекс по  заданому элементу " + myArrayList1.getIndex("100"));//-1

        System.out.println("наличие элемента " + myArrayList1.contains("100"));//false
        System.out.println("наличие элемента " + myArrayList1.contains("5"));//true
    }

    public static MyArrayList addElement(MyArrayList myArrayList, String str) {
        MyArrayList myArrayList1 = new MyArrayList();

        myArrayList1.setMyArrayList(myArrayList.addEssence(str));
        return myArrayList1;

    }

}