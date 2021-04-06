package ArrayList;

public class ClassTest {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 22, 70, 3};

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.setMyArrayList(array);

        System.out.println("исходный " + myArrayList);

        MyArrayList myArrayList1 = addElement(myArrayList, 10);

        System.out.println("добавили одно число " + myArrayList1);//10 в конце

        System.out.println("длинна списка " + myArrayList1.size());//6

        System.out.println("элемент по заданному индексу " + myArrayList1.getElement(3));//22

        System.out.println("индекс по  заданому элементу " + myArrayList1.getIndex(70));//3
        System.out.println("индекс по  заданому элементу " + myArrayList1.getIndex(100));//-1

        System.out.println("наличие элемента " + myArrayList1.contains(100));//false
        System.out.println("наличие элемента " + myArrayList1.contains(5));//true
    }

    public static MyArrayList addElement(MyArrayList myArrayList, int x) {
        MyArrayList myArrayList1 = new MyArrayList();

        myArrayList1.setMyArrayList(myArrayList.addElement(x));
        return myArrayList1;

    }

}