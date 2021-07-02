package karling.nicolas.pet;

public class Dog extends Pet {
    private String bearing;

    public Dog() {
    }

    public Dog(String name, int quantityPaws, int age, String breed, String bearing) {
        super(name, quantityPaws, age, breed);
        this.bearing = bearing;
    }

    public String getBearing() {
        return bearing;
    }

    public void setBearing(String bearing) {
        this.bearing = bearing;
    }

    @Override
    public String ToCommunicate() {
        return "auauau";

    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncomunicate = " + ToCommunicate() +
                "\nbearing='" + bearing;
    }
}
