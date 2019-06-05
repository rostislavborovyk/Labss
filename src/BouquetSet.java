import lab_6.Bouquet;

import java.util.*;

public class BouquetSet implements Set<Bouquet> {
    private Node head;
    private Node tail;
    private int size;

    public BouquetSet() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public BouquetSet(Bouquet object) {
        this.setHead(new Node(object));
        this.setTail(new Node(object));
        this.setSize(1);
    }

    public BouquetSet(List<Bouquet> list) {
        try {
            if (list.size() == 0) {
                throw new MyException();
            }
        } catch (MyException e){
            System.err.println("An exception is happened!");
        }

        Node prev, next;
        prev = new Node((Bouquet) list.toArray()[0]);
        this.setHead(prev);
        this.setSize(list.size());
        for (Bouquet element : list.subList(1, this.size())) {
            next = new Node(element);
            prev.setNext(next);
            prev = prev.getNext();
        }
        this.setTail(prev);
    }

    private void setHead(Node node) {
        this.head = node;
    }

    private void setSize(int size) {
        this.size = size;
    }

    private Node getHead() {
        return this.head;
    }

    private Node getTail() {
        return tail;
    }

    private void setTail(Node tail) {
        this.tail = tail;
    }

    private class Node {
        private Bouquet data;
        private Node next;


        public Node(Bouquet bouquet) {
            this.data = bouquet;
        }

        public Bouquet getData() {
            return this.data;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof Node
                    && data.equals(obj);
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return this.next;
        }
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) throws ClassCastException, NullPointerException {
        if (this.size() == 0) {
            throw new NullPointerException();
        }
        if (!(o instanceof Bouquet)) {
            throw new ClassCastException();
        }
        for (Bouquet bouquet : this) {
            if (bouquet.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Bouquet> iterator() {
        class MyIterator implements Iterator {
            private Node current;

            MyIterator(BouquetSet ls) {
                current = ls.getHead();
            }

            @Override
            public boolean hasNext() {
                if (current != null) {
                    return true;
                }
                return false;
            }

            @Override
            public Object next() throws NoSuchElementException {
                Bouquet data = current.getData();
                current = current.getNext();
                return data;
            }
        }
        return new MyIterator(this);
    }

    @Override
    public Object[] toArray() {
        Bouquet[] arr = new Bouquet[this.size()];
        int i = 0;
        for (Bouquet bouquet : this) {
            arr[i] = bouquet;
            i++;
        }
        return arr;
    }

    @Override
    public <T> T[] toArray(T[] a) throws NullPointerException, ArrayStoreException {
        if (a.length == 0) {
            throw new NullPointerException();
        }
        if (!(a instanceof Bouquet[])) throw new ArrayStoreException();
        if (this.size() > a.length) {
            return (T[]) this.toArray();
        }

        int i = 0;
        for (Object obj : this.toArray()) {
            a[i] = (T) obj;
            ++i;
        }
        return a;
    }


    @Override
    public boolean remove(Object o) throws ClassCastException, NullPointerException {
        if (o == null) {
            throw new NullPointerException();
        }
        if (!(o instanceof Bouquet)) {
            throw new ClassCastException();
        }
        Node current = this.getHead();
        if (current.getData().equals(o)) {
            this.setHead(current.getNext());
            this.setSize(this.size() - 1);
            return true;
        }
        Node previous = null;
        while (current != null) {
            if (current.getData().equals(o)) {
                previous.setNext(current.getNext());
                return true;
            }
            previous = current;
            current = current.getNext();
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) throws ClassCastException, NullPointerException {
        if (c.size() > this.size()) {
            return false;
        }
        for (Object obj : c) {
            if (obj == null) {
                throw new NullPointerException();
            }
            if (!(obj instanceof Bouquet)) {
                throw new ClassCastException();
            }
            if (!this.contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) throws ClassCastException, NullPointerException {
        for (Object obj : c) {
            if (obj == null) {
                throw new NullPointerException();
            }
            if (!(obj instanceof Bouquet)) {
                throw new ClassCastException();
            }
            this.remove(obj);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object bouquet : c) {
            if (bouquet == null) {
                throw new NullPointerException();
            }
            if (!(bouquet instanceof Bouquet)) {
                throw new ClassCastException();
            }
            this.remove(bouquet);
        }
        return true;
    }

    @Override
    public void clear() {
        this.getHead().setNext(null);
        this.setSize(0);
    }

    @Override
    public boolean addAll(Collection<? extends Bouquet> c) {
        for (Bouquet bouquet : c) {
            this.add(bouquet);
        }
        return true;
    }

    @Override
    public boolean add(Bouquet bouquet) {
        if (this.contains(bouquet)) {
            System.out.println("Already in collection");
            return true;
        }
        this.getTail().setNext(new Node(bouquet));
        this.setSize(this.size() + 1);
        return true;
    }
}