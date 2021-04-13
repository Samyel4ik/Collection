package MyList;

import static java.util.Objects.nonNull;

public class MyLinkedList<T> {
    int size = 0;
    Node<T> head;//first


    public void addTail(T entity) {
        this.size++;
        Node<T> node = new Node<>(entity);

        if (this.head != null) {
            Node<T> tail = findTail();
            node.setPrevious(tail);
            tail.setNext(node);
        } else {
            this.head = node;
        }
    }

    Node<T> findTail() {
        Node<T> tail = this.head;
        while (tail.getNext() != null) {
            tail = tail.getNext();
        }
        return tail;
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
