package ArrayList;


import java.util.Arrays;

public class MyArrayList {
    String[] array;

    public void setMyArrayList(String[] array) {
        this.array = array;
    }

    public String[] addElement(String str) {
        String[] array1 = Arrays.copyOf(this.array, this.array.length + 1);
        array1[array1.length - 1] = str;
        return array1;
    }

    public int size() {
        return this.array.length;
    }

    public String getElement(int index) {
        String element = "";
        for (int i = 0; i < this.array.length; i++) {
            if (index == i) {
                element = this.array[i];
            }
        }
        return element;
    }

    public int getIndex(String element) {
        int index = -1;

        for (int i = 0; i < this.array.length; i++) {
            if (element.equals(this.array[i])) {
                index = i;
            }
        }
        return index;
    }

    public boolean contains(String element) {
        boolean contains = false;
        for (int i = 0; i < this.array.length; i++) {
            if (element.equals(this.array[i])) {
                contains = true;
            }
        }
        return contains;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
