package MyList;

public class Node<T> {
    T entity;
    Node<T> next;
    Node<T> previous;

    public Node(T entity) {
        this.entity = entity;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
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

    public Node<T> getPrevious() {
        return previous;
    }

    @Override
    public String toString() {
        return "Node{" +
                "entity=" + entity +
                '}';
    }
}
