package karling.nicolas.pet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetApplication.class, args);

		Dog dog1 = new Dog(
				"Bolt",
				4,
				5,
				"White German Shepherd",
				"small");

		Cat cat1 = new Cat(
				"Mittens",
				4,
				7,
				"tuxedo cat");

		System.out.println(dog1);
		System.out.println(cat1);
	}

}
