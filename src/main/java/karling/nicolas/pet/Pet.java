package karling.nicolas.pet;

public abstract class Pet {
    protected String name;
    protected int quantityPaws;
    protected int age;
    protected String breed;

    public Pet() {
        this.quantityPaws = 4;
    }

    public Pet(String name, int quantityPaws, int age, String breed) {
        this.name = name;
        this.quantityPaws = 4;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityPaws() {
        return quantityPaws;
    }

    public void setQuantityPaws(int quantityPaws) {
        this.quantityPaws = quantityPaws;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public abstract String ToCommunicate();

    @Override
    public String toString() {
        return
                "\nname = " + name +
                "\nquantityPaws = " + quantityPaws +
                "\nage = " + age +
                "\nbreed = " + breed;
    }
}
