package lab_6;


public class lab_6 {

    public static void main(String[] args) {
        Bouquet bouquet1 = new Bouquet(5);
        bouquet1.addFlower(12, "Rose", 2);
        bouquet1.addFlower(15, "Lily", 3);
        bouquet1.addRoyalFlower(10, "French violet",1, "Provence");
        bouquet1.addFlower(9, "Carnation", 6);
        bouquet1.addRoyalFlower(10, "British aster",0, "England");
        System.out.println(bouquet1);
        System.out.println("-------------------------------\n");
        System.out.println("Flowers with particular length:");
        bouquet1.findFlowerWithLen(10);
        System.out.println("\n-------------------------------\n");
        System.out.println("Bouquet, sorted with freshness:");
        bouquet1.sortWithFreshness();
        System.out.println(bouquet1);
    }

}
