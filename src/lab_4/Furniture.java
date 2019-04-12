package lab_4;
// C11 = 8 - Визначити клас меблі, який складається як мінімум з 5-и полів.
public class Furniture {
    private String type;
    private int cost;
    private String material;
    private String origin;
    private int mass;
    Furniture(String type, int cost, String material, String origin, int mass){
        this.type = type;
        this.cost = cost;
        this.material = material;
        this.origin = origin;
        this.mass = mass;
    }
    @Override
    public String toString(){
        return type + "\t\t" + cost + " uah" + "\t\t" +    //type or this.type ?
                material + "\t\t" + origin + "\t\t" + mass + " kg";
    }

    String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }

    int getCost(){
        return this.cost;
    }
    public void setCost(int cost){
        this.cost = cost;
    }

    String getMaterial(){
        return this.material;
    }
    public void setMaterial(String material){
        this.material = material;
    }

    int getMass(){
        return this.mass;
    }
    public void setMass(int mass){
        this.mass = mass;
    }

    String getOrigin(){
        return this.origin;
    }
     void setOrigin(String origin){
        this.origin = origin;
    }

    }
