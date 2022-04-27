package entity;

import java.sql.SQLOutput;

public abstract class Fetus {
    public String name;
    public int mass;
    protected String test;

    public Fetus (String name, int mass) {
        this.name = name;
        this.mass = mass;


        System.out.println("Class = " + this.getClass());

    }


    public String getTaste (){
        return "No Taste";
    }

   // public abstract void printInfo ();

}
