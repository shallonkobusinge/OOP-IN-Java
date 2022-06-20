package Polymorphism.Intro;

public class AnimalMain {
    public static void main(String[] args) {
        AnimalSounds animalSounds = new AnimalSounds();
        AnimalSounds Cow = new Cow();
        AnimalSounds Dog = new Dog();
        AnimalSounds Cat = new Cat();
        animalSounds.Sound();
        Cow.Sound();
        Cat.Sound();
        Dog.Sound();
    }
}
