package ArrayList;


import java.util.Arrays;

public class MyArrayList<T> {
    T[] entities;

    public void setMyArrayList(T[] entities) {
        this.entities = entities;
    }

    public T[] addEssence(T essence) {
        T[] array1 = (T[]) Arrays.copyOf(this.entities, this.entities.length + 1);
        array1[array1.length - 1] = essence;
        return array1;
    }

    public int size() {
        return this.entities.length;
    }

    public T getEssence(int index) {
        T essence = null;
        for (int i = 0; i < this.entities.length; i++) {
            if (index == i) {
                essence = this.entities[i];
            }
        }
        return essence;
    }

    public int getIndex(T essence) {
        int index = -1;

        for (int i = 0; i < this.entities.length; i++) {
            if (essence.equals(this.entities[i])) {
                index = i;
            }
        }
        return index;
    }

    public boolean contains(T essence) {
        boolean contains = false;
        for (int i = 0; i < this.entities.length; i++) {
            if (essence.equals(this.entities[i])) {
                contains = true;
            }
        }
        return contains;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(entities) +
                '}';
    }
}
