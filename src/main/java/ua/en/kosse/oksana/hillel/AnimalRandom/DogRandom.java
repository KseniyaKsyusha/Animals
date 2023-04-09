package ua.en.kosse.oksana.hillel.AnimalRandom;

import ua.en.kosse.oksana.hillel.Animal;
import ua.en.kosse.oksana.hillel.Dog;

public class DogRandom implements AnimalRandom{

    @Override
    public Animal createAnimal() {
        return  new Dog( ); // создаем обьект собака
    }
}
