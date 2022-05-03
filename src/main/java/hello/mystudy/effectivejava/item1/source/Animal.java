package hello.mystudy.effectivejava.item1.source;

public class Animal {

    private String name;
    private String hometown;
    private int age;

    private Cow cow;

    public void setCow(Cow cow) {
        this.cow = cow;
    }

    public Cow getCow() {
        return cow;
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
    //컴파일 에러 발생
//    public Animal(String hometown) {
//
//    }

    public static Animal swimAbleAnimal() {
        return null;
    }

    public static Animal getAnimalByName(String name) {
        Animal animal = new Animal();
        animal.setName(name);
        return animal;
    }

    public static Animal getCatByHometown(String hometown) {
        Animal animal = new Animal();
        animal.setHometown(hometown);
        return animal;
    }

    public static Animal getCat() {
        return new Cat();
    }

    public static Animal getDog() {
        return new Dog();
    }

    public static Dog getDogByAge(int age) {
        if (age > 5) {
            return new OldDog();
        }
        return new YoungDog();
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
