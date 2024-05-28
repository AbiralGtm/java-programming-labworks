public class Main {
    public static void main(String[] args) {
        // Create an immutable Person object
        Person person = new Person("Ram", 20);

        // Display the person's details
        System.out.println(person);

        // Trying to modify the person's attributes would require a new object
        Person updatedPerson = new Person("Ram", 21);

        // Display the updated person's details
        System.out.println(updatedPerson);
    }
}
