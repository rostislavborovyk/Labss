import java.util.*;

import lab_6.*;

//C2 = Set
//C3 = Однозв’язний список
public class lab_7 {
    public static void main(String[] args) {
        Bouquet bouquet1 = new Bouquet(5);
        bouquet1.addFlower(12, "Rose", 2);
        Bouquet bouquet2 = new Bouquet(2);
        bouquet2.addFlower(14, "asd", 6);
        Bouquet bouquet3 = new Bouquet(3);
        bouquet3.addFlower(14, "qqwrd", 4);
        ArrayList<Bouquet> list = new ArrayList<>();
        list.add(bouquet1);
        list.add(bouquet2);
        list.add(bouquet3);

        BouquetSet bs = new BouquetSet(list); // Construct from collection

        System.out.println(bs.contains(bouquet3));
        System.out.println(bs.containsAll(list));
        System.out.println(bs.size());
        bs.clear();
        System.out.println(bs.size());
    }
}

class BouquetSet implements Set<Bouquet> {
    private Node head;
    private int size;

    public BouquetSet(){
        this.head = null;
        this.size = 0;
    }
    public BouquetSet(Bouquet object){
        this.setHead(new Node(object));
        this.setSize(1);
    }
    public BouquetSet(List<Bouquet> list) throws ArrayIndexOutOfBoundsException{
        if (list.size() == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        Node prev, next;
        prev = new Node((Bouquet) list.toArray()[0]);
        this.setHead(prev);
        this.setSize(list.size());
        for (Bouquet element: list.subList(1, this.size())){
            next = new Node(element);
            prev.setNext(next);
            prev = prev.getNext();
        }
    }

    private void setHead(Node node) { this.head = node; }
    private void setSize(int size)  { this.size = size; }
    private Node getHead() { return this.head; }

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
    public boolean contains(Object o) throws NullPointerException{
        if (this.size() == 0){
            throw new NullPointerException();
        }
        for (Bouquet bouquet: this){
            if (bouquet.equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Bouquet> iterator() {
        class MyIterator implements Iterator{
            private Node current;
            MyIterator(BouquetSet ls){
                current = ls.getHead();
            }
            @Override
            public boolean hasNext() {
                if (current != null){
                    return true;
                }
                return false;
            }

            @Override
            public Object next() {
                Bouquet data = current.getData();
                current = current.getNext();
                return data;
            }
        }
        return new MyIterator(this);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (c.size() > this.size()){ return false; }
        for (Object obj: c){
            if (!this.contains(obj)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        this.getHead().setNext(null);
        this.setSize(0);
    }

    @Override
    public boolean addAll(Collection<? extends Bouquet> c) {
        return false;
    }

    @Override
    public boolean add(Bouquet bouquet) {
        return false;
    }
}
