package lab_6;
import java.util.Arrays;

public class Bouquet {
    private int numOfFlowers;
    private Flower[] flowers;
    private int counter = 0;
    public Bouquet(int sizeOfBouquet){
        this.numOfFlowers = sizeOfBouquet;
        flowers = new Flower[sizeOfBouquet];
    }

    public void addFlower(int lenOfFlower, String nameOfFlower, int daysFromCut){
        if (counter < numOfFlowers){
            flowers[counter++] = new Flower(lenOfFlower, nameOfFlower, daysFromCut);
        }else {
            System.out.println("Bouquet size is exceeded!");
        }
    }
    public void addRoyalFlower(int lenOfFlower, String nameOfFlower,int daysFromCut, String origin){
        if (counter < numOfFlowers){
            flowers[counter++] = new RoyalFlower(lenOfFlower, nameOfFlower, daysFromCut, origin);
        }else {
            System.out.println("Bouquet size is exceeded!");
        }
    }

    @Override
    public String toString(){
        String res = "Bouquet of flowers contains " + counter + " flowers:\n";
        for (int i = 0; i < counter; i++) {
            res += flowers[i].toString() + '\n';
        }
        return res;
    }
    public void findFlowerWithLen(int len){
        for (int i = 0; i < flowers.length; i++) {
            if(flowers[i].getLenOfFlower() == len){
                System.out.println(flowers[i]);
            }

        }
    }
    public void sortWithFreshness(){
        Arrays.sort(flowers, new ComparatorByFreshness());
    }

}
