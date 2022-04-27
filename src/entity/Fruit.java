package entity;

public class Fruit extends Fetus {

    private float calories;
    String color;

    public Fruit(String name, int mass){
        super(name, mass);
    }

    @Override
    public String getTaste () {

        return "SWEET";
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }
}
