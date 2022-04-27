package entity;

public class Berry {
    private String name;
    private int mass;
    protected  float calories;
    String color;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

}
