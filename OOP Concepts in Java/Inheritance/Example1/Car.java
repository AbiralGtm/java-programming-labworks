class Car extends Vehicle
{
    private int numberOfDoors;

    public Car(String model,String manufacturer, int numberOfDoors)
    {
        super(model,manufacturer);
        this.numberOfDoors = numberOfDoors;
    }
    
    public void openDoor(int numberOfDoors)
    {
        System.out.println(numberOfDoors+ " Doors opened");
    }


   @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
        
        
    }
}