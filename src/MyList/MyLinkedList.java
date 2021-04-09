package MyList;

public class MyLinkedList<T> {
    int size = 0;
    Node<T> head;

    public void add(T entity) {
        Node now = this.head;

        if (this.head == null) {
            this.head = new Node(entity);
            this.size++;
            return;
        }

        while (now.getNext() != null) {
            now = now.getNext();
        }
        now.setNext(new Node(entity));
        this.size++;

    }

    public T get(int index) {
        T ttt = null;
        int t = 0;
        Node now = this.head;
        while (now.getNext() != null) {
            t++;
            if (t == index) {
                ttt = (T) now.getEntity();
                break;
            }
            now = now.getNext();
        }
        return ttt;
    }


    public int getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
