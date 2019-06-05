import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import junit.framework.*;
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

//        System.out.println(bs.contains(bouquet3));
//        System.out.println(bs.containsAll(list));
//        System.out.println(bs.size());
//        bs.clear();
//        System.out.println(bs.size());
        System.out.println(bs.size());
        for (Bouquet bouquet : bs) {
            System.out.println(bouquet);
        }
//        bs.remove(bouquet3);
//        bs.removeAll(list);

        System.out.println(bs.size());
        for (Bouquet bouquet : bs) {
            System.out.println(bouquet);
        }
        Bouquet[] arr = (Bouquet[]) bs.toArray();
        Bouquet[] arr2 = new Bouquet[5];
        System.out.println("=====================");
        bs.toArray(arr2);
        for (Bouquet bouquet : arr2) {
            System.out.println(bouquet);
        }


    }
}

class MyException extends Exception {
    public MyException() {
        super();
        System.err.println("You have been stopped by the police of errors!\n" +
                "Don't do mistakes anymore!");
    }
    public  MyException(String message){
        super(message);

    }
}

