package lab_6;

public class RoyalFlower extends Flower{
    private String origin;
    public RoyalFlower(int lenOfFlower, String nameOfFlower,int daysFromCut, String origin){
        super(lenOfFlower,nameOfFlower, daysFromCut);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }
    @Override
    public String toString(){
        return this.getNameOfFlower() + " with length of " + this.getLenOfFlower()
                + " from " + origin +", " + getDaysFromCut() + " days from cut";
    }
}
