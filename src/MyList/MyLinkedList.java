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
        int t = 0;
        Node now = this.head;
        if (now.getNext() != null) {
            t++;
            if (t == index) {
                return(T) now.getEntity();
            }
            now = now.getNext();

        }
        return (T) now.getEntity();
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
