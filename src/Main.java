import entity.Berry;
import entity.Fetus;
import entity.Fruit;
import entity.Vegetable;

public class Main {
    static int mass;

    public static void main(String[] args) {


        Fruit fruit = new Fruit("Apple", 100);
        Vegetable vegetable = new Vegetable("Tomato", 150 , 47.7f );

        Fetus[] fetuses = new Fetus[2];
        fetuses[0] = fruit;
        fetuses[1] = vegetable;

        Berry berry = new Berry();

        berry.setName("cherry");
        berry.setMass(23);
        System.out.println(berry.getName() + "\n" + berry.getMass() );

        for (int i = 0; i < fetuses.length; i++)
        {
            System.out.println(fetuses[i].getTaste());
        }

        Fetus fetus = new Fruit("raspberry", 15);
        getInfoAboutPet(fetus);

        System.out.println(vegetable.getTaste());
        System.out.println(fruit.getTaste()  + "\nName: " + fruit.name + "; Mass: " + fruit.mass );

        System.out.println(vegetable.GetCalories());
    }

    private static void getInfoAboutPet( Fetus fetus ) {
        if (fetus  instanceof Fruit) {
            Fruit fruit = (Fruit) fetus;
            System.out.println( fruit.getTaste() );
        }
        if (fetus  instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) fetus;
            System.out.println( vegetable.getTaste() );
        }
    }
}
