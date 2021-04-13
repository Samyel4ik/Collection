package MyList;

import static java.util.Objects.nonNull;

public class MyLinkedList<T> {
    int size = 0;
    Node<T> head;//first
    Node<T> tail;


    public void addTail(T entity) {
        this.size++;
        Node<T> node = new Node<>(entity);

        if (this.head != null) {
            this.tail = findTail();
            node.setPrevious(tail);
            tail.setNext(node);
        } else {
            this.head = node;
            this.tail = node;
        }
    }

    Node<T> findTail() {
        while (this.tail.getNext() != null) {
            this.tail = this.tail.getNext();
        }
        return this.tail;
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
        Node<T> now = findTail();
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
        this.size--;
        Node<T> node = this.head;

        if (index == 0) {
            this.head = this.head.getNext();
        }
        if (index == getSize()) {
            this.tail = this.tail.getPrevious();
            this.tail.setNext(null);
        }
        while (index > 0 & index < getSize()) {
            Node<T> node1 = get(index);
            Node<T> node2 = get(index - 1);
            Node<T> node3 = get(index + 1);

            if (node == node1) {
                node2.setNext(node3);
                node3.setPrevious(node2);
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


    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
