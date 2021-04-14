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
        if (this.head != null) {
            node.setNext(this.head);
            this.head.setPrevious(node);
            this.head = node;
        } else {
            this.head = node;
            this.tail = node;
        }
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

    public T get(int index) {
        Node<T> node = this.head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }

        return node.getEntity();
    }

    public Node<T> getNode(int index) {
        Node<T> node = this.head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }

        return node;
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
        remove(indexOf(entity));
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
        if (index > 0 & index < getSize()) {

            Node<T> delete = getNode(index);
            Node<T> nextDelete = delete.getNext();
            Node<T> prevDelete = delete.getPrevious();

            nextDelete.setPrevious(prevDelete);
            prevDelete.setNext(nextDelete);
        }

    }

    public void add(T entity, int index) {
        this.size++;

        if (index == getSize()) {
            addTail(entity);
        }

        if (index > 0 & index < getSize()) {

            Node<T> addNode = new Node<>(entity);

            Node<T> nodeIndex = getNode(index);
            Node<T> nextNodeIndex = getNode(index + 1);

            nodeIndex.setNext(addNode);
            nextNodeIndex.setPrevious(addNode);

            addNode.setNext(nextNodeIndex);
            addNode.setPrevious(nodeIndex);
        }
    }


    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
