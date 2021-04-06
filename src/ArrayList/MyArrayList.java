package ArrayList;


import java.util.Arrays;

public class MyArrayList {
    int[] array;

    public void setMyArrayList(int[] array) {
        this.array = array;
    }

    public int[] addElement(int x) {
        int[] array1 = Arrays.copyOf(this.array, this.array.length + 1);
        array1[array1.length - 1] = x;
        return array1;
    }

    public int size() {
        return this.array.length;
    }

    public int getElement(int index) {
        int element = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (index - 1 == i) {
                element = this.array[i];
            }
        }
        return element;
    }

    public int getIndex(int element) {
        int index = -1;

        for (int i = 0; i < this.array.length; i++) {
            if (element == this.array[i]) {
                index = i;
            }
        }
        return index;
    }

    public boolean contains(int element) {
        boolean contains = false;
        for (int i = 0; i < this.array.length; i++) {
            if (element == this.array[i]) {
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
