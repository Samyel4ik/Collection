package ArrayList;


import java.util.Arrays;

public class MyArrayList<T> {
    Object[] entities = new Object[0];

    public void add(T essence) {
        this.entities = Arrays.copyOf(this.entities, this.entities.length + 1);
        this.entities[entities.length - 1] = essence;

    }

    public int size() {
        return this.entities.length;
    }

    public T get(int index) {
        return (T) this.entities[index];
    }

    public int indexOf(T essence) {

        for (int i = 0; i < this.entities.length; i++) {
            if (essence.equals(this.entities[i])) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T essence) {
        int index = -1;

        for (int i = 0; i < this.entities.length; i++) {
            if (essence.equals(this.entities[i])) {
                index = i;
            }
        }
        return index;
    }


    public boolean contains(T essence1) {
        boolean contains = false;
        for (Object essence : this.entities) {
            if (essence1.equals(essence)) {
                contains = true;
            }
        }
        return contains;
    }

    public void remove(int index) {
        Object[] entities1 = new Object[this.entities.length - 1];
        int a = 0;
        for (int i = 0; i < this.entities.length; i++) {
            if (i != index) {
                entities1[a] = this.entities[i];
                a++;
            }
        }
        this.entities = entities1;
    }

    public void remove(T essence) {
        int index = indexOf(essence);
        remove(index);

    }


    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(entities) +
                '}';
    }
}
