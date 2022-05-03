package hello.mystudy.effectivejava.item1;

import hello.mystudy.effectivejava.item1.source.Animal;
import org.junit.jupiter.api.Test;

class AnimalTest {

    @Test
    void 이름을_가질수있다() {
        Animal animal = new Animal();
        Animal swimAbleAnimal = Animal.swimAbleAnimal();
    }

    @Test
    void 여러_시그니처가_가능하다() {
        Animal animal = new Animal();

        Animal animalByName = Animal.getAnimalByName("name");
        Animal animalByHomeTown = Animal.getCatByHometown("hometown");
    }

    @Test
    void 반환타입의_하위타입_반환가능() {
        Animal cat = Animal.getCat();
        Animal dog = Animal.getDog();
    }
}