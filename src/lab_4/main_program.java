package lab_4;

import java.util.Arrays;
import java.util.Comparator;

public class main_program {

    public static void main(String[] args) {
//        Furniture example = new Furniture("Chair", 1000,
//                                        "Wood", "France", 10);
        Furniture[] furnitureArray = new Furniture[3];
        furnitureArray[0] = new Furniture("Table", 2000,
                "Plastic", "Ukraine", 15);
        furnitureArray[1] = new Furniture("Chair", 1000,
                "Wood", "France", 10);
        furnitureArray[2] = new Furniture("Sofa", 5000,
                "Wood", "Spain", 80);
        System.out.println("Array before sorting");
        for (Furniture elem : furnitureArray) {
            System.out.println(elem);
        }
        System.out.println("\nArray sorted with cost");
        Arrays.sort(furnitureArray, Comparator.comparing(Furniture :: getCost));
        for (Furniture elem : furnitureArray) {
            System.out.println(elem);
        }
        System.out.println("\nArray sorted with origin");
        Arrays.sort(furnitureArray, Comparator.comparing(Furniture :: getOrigin).reversed());
        for (Furniture elem : furnitureArray) {
            System.out.println(elem);
        }


    }

}
