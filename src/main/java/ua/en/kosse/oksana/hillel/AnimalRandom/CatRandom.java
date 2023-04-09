package ua.en.kosse.oksana.hillel.AnimalRandom;

import ua.en.kosse.oksana.hillel.Animal;
import ua.en.kosse.oksana.hillel.Cat;

public class CatRandom implements AnimalRandom{

    @Override
    public Animal createAnimal() {
        return new Cat(); //создаем обьект Cat
    }
}
