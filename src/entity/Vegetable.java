package entity;

public class Vegetable extends Fetus {

    private float calories;
    String color;

    public Vegetable(String name, int mass, float calories, String color) {
        super(name, mass);
        this.calories = calories;
        this.color = color;
    }

    public Vegetable(String name, int mass, float calories){
        super(name, mass);
        this.calories = calories;
    }

    public Vegetable(String name) {
        super(name, -1);
    }
    public String getTaste () {

        return "INSIPID";
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public float GetCalories (){
        return this.calories;
    }
}
