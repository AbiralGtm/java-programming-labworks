public class Main {
    public static void main (String[] args)
    {
        Car car = new Car("Land Cruiser", "Toyota", 4);

        car.selfStartVehicle();
        car.displayInfo();
        car.openDoor(2);
        car.stopVehicle();

        System.out.println();
        Motorcycle motorcycle = new Motorcycle("Gixxer", "Suzuki", true);
        motorcycle.kickStart();
        motorcycle.displayInfo();
        motorcycle.stopVehicle();

    }
}
