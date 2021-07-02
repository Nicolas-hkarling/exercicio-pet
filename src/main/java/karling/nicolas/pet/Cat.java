package karling.nicolas.pet;

public class Cat extends Pet{
    @Override
    public String ToCommunicate() {
        return "miau";
    }

    public Cat() {
    }

    public Cat(String name, int quantityPaws, int age, String breed) {
        super(name, quantityPaws, age, breed);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncomunicate = " + ToCommunicate();
    }


}
