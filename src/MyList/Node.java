package MyList;

public class Node <T> {
    T entity;
    Node<T> next ;

    public Node(T entity) {
        this.entity = entity;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getEntity() {
        return entity;
    }

    @Override
    public String toString() {
        return "Node{" +
                "entity=" + entity +
                '}';
    }
}
