class Main {
    public static void main(String[] args) {
        // Create an array of Animal type
        Animal[] animals = new Animal[3];

        // Fill the array with different Animal subclasses
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();

        // Use polymorphism to call the makeSound method on each object
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
