package lab_6;


public class lab_6 {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet(7);
        bouquet.addFlower(12, "Rose", 2);
        bouquet.addFlower(15, "Lily", 3);
        bouquet.addRoyalFlower(10, "French violet",1, "Provence");
        bouquet.addFlower(9, "Carnation", 6);
        bouquet.addRoyalFlower(10, "British aster",0, "England");
        bouquet.addTropicalFlower(20, "Amazonian orchid",4, "Brazil");
        bouquet.addGreenHouseFlower(25, "Home daisy",5, "Ukraine");
        System.out.println(bouquet);
        System.out.println("-------------------------------\n");
        System.out.println("Flowers with particular length:");
        bouquet.findFlowerWithLen(10);
        System.out.println("\n-------------------------------\n");
        System.out.println("Bouquet, sorted with freshness:");
        bouquet.sortWithFreshness();
        System.out.println(bouquet);
    }
}
