package lab_6;


public class Flower{
    private int lenOfFlower;
    private String nameOfFlower;
    private int daysFromCut;
    public Flower(int lenOfFlower, String nameOfFlower, int daysFromCut){
        this.lenOfFlower = lenOfFlower;
        this.nameOfFlower = nameOfFlower;
        this.daysFromCut = daysFromCut;
    }

    public int getLenOfFlower() {
        return lenOfFlower;
    }

    public String getNameOfFlower() {
        return nameOfFlower;
    }

    public int getDaysFromCut() {
        return daysFromCut;
    }


    @Override
    public String toString(){
        return nameOfFlower + " with length of " + lenOfFlower + ", " + getDaysFromCut()
                + " days from cut";
    }

    public int compareTo(int x, int y){
        return Integer.compare(x, y);
    }
}
