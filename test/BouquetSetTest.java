import junit.framework.TestCase;
import lab_6.Bouquet;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.*;

public class BouquetSetTest extends TestCase {
    private BouquetSet bs;
    private Bouquet bouquet1;
    private Bouquet bouquet2;
    private Bouquet bouquet3;

    @Before
    public void setUp() throws Exception {
        bouquet1 = new Bouquet(5);
        bouquet1.addFlower(12, "Rose", 2);
        bouquet2 = new Bouquet(2);
        bouquet2.addFlower(14, "asd", 6);
        bouquet3 = new Bouquet(3);
        bouquet3.addFlower(14, "qqwrd", 4);
        ArrayList<Bouquet> list = new ArrayList<>();
        list.add(bouquet1);
        list.add(bouquet2);
        list.add(bouquet3);
        bs = new BouquetSet(list);
        System.out.println("Set up is done!");
    }

    @After
    public void tearDown() throws Exception {
        bs = null;
        System.out.println("Torn down");
    }

    @Test
    public void testIsEmpty() {
        assertFalse(bs.isEmpty());
        System.out.println("isEmpty ok");
    }

    @Test
    public void testSize() {
        int expected = 3;
        int actual = bs.size();
        assertEquals(actual, expected);
        System.out.println("testSize ok");
    }

    @Test
    public void testToArray() {
        Object[] expected = new Object[3];
        expected[0] = bouquet1;
        expected[1] = bouquet2;
        expected[2] = bouquet3;
        Assert.assertArrayEquals(expected, bs.toArray());
        System.out.println("toArray ok");
    }

    @Test
    public void testIterator() {
        Iterator<Bouquet> iterator = bs.iterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(bouquet1, iterator.next());
        iterator.next();
        iterator.next();
        Assert.assertFalse(iterator.hasNext());
        System.out.println("iterator ok");
    }

    @Test
    public void testRemove() {
        Assert.assertTrue(bs.contains(bouquet1));
        bs.remove(bouquet1);
        Assert.assertFalse(bs.contains(bouquet1));
        System.out.println("remove ok");
    }

    @Test
    public void testContainsAll() {
        ArrayList<Bouquet> arr = new ArrayList<>();
        arr.add(bouquet1);
        arr.add(bouquet2);
        arr.add(bouquet3);
        Assert.assertTrue(bs.containsAll(arr));
        System.out.println("containsAll ok");
    }

    @Test
    public void testRetainAll() {
        ArrayList<Bouquet> arr = new ArrayList<>();
        arr.add(bouquet1);
        bs.retainAll(arr);
        Assert.assertFalse(bs.contains(bouquet1));
        Assert.assertTrue(bs.contains(bouquet2));
        Assert.assertTrue(bs.contains(bouquet3));
        System.out.println("retainAll ok");
    }


    @Test
    public void testRemoveAll() {
        ArrayList<Bouquet> arr = new ArrayList<>();
        arr.add(bouquet1);
        arr.add(bouquet2);
        bs.removeAll(arr);
        Assert.assertFalse(bs.contains(bouquet1));
        Assert.assertFalse(bs.contains(bouquet2));
        Assert.assertTrue(bs.contains(bouquet3));
        System.out.println("removeAll ok");
    }

    @Test
    public void testClear() {
        bs.clear();
        Assert.assertTrue(bs.isEmpty());
        System.out.println("clear ok");
    }

    @Test
    public void testAddAll() {
        bs.clear();
        ArrayList<Bouquet> list = new ArrayList<>();
        list.add(bouquet2);
        list.add(bouquet3);
        bs.addAll(list);
        Assert.assertTrue(bs.contains(bouquet2));
        Assert.assertTrue(bs.contains(bouquet3));
        System.out.println("addAll ok");
    }
//
    @Test
    public void testAdd() {
        bs.clear();
        bs.add(bouquet1);
        Assert.assertTrue(bs.contains(bouquet1));
        System.out.println("add ok");
    }
}