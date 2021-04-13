package MyList;


public class MyLinkedList<T> {
    int size = 0;
    Node<T> head;//first
    Node<T> tail;


    public void addTail(T entity) {
        this.size++;
        Node<T> node = new Node<>(entity);

        if (this.head != null) {
            node.setPrevious(this.tail);
            this.tail.setNext(node);
            this.tail = node;
        } else {
            this.head = node;
            this.tail = node;
        }
    }

    public void addHead(T entity) {
        this.size++;
        Node<T> node = new Node<>(entity);

        node.setNext(this.head);
        this.head.setPrevious(node);
        this.head = node;
    }

    public void printHeadTail() {
        Node<T> now = head;
        while (now != null) {
            System.out.println(now);
            now = now.getNext();
        }
    }

    public void printTailHead() {
        Node<T> now = this.tail;
        while (now != null) {
            System.out.println(now);
            now = now.getPrevious();
        }
    }


    public Node<T> get(int index) {
        Node<T> node = this.head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }

        return node;
    }

    public void remove(int index) {

        Node<T> node = this.head;

        if (index == 0) {
            this.head = this.head.getNext();
            this.size--;
        }
        if (index == getSize()) {
            this.tail = this.tail.getPrevious();
            this.tail.setNext(null);
            this.size--;
        }
        while (index > 0 & index < getSize()) {
            Node<T> node1 = get(index);
            Node<T> node2 = get(index - 1);
            Node<T> node3 = get(index + 1);

            if (node == node1) {
                node2.setNext(node3);
                node3.setPrevious(node2);
                this.size--;
                break;
            }
            node = node.getNext();
        }

    }

    public int indexOf(T entity) {
        Node<T> node = this.head;

        for (int i = 0; i < getSize(); i++) {
            if (entity.equals(node.getEntity())) {
                return i;
            }
            node = node.getNext();
        }
        return -1;
    }

    public boolean contains(T entity) {
        Node<T> node = this.head;

        for (int i = 0; i < getSize(); i++) {
            if (entity.equals(node.getEntity())) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public void remove(T entity) {
    }


    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
