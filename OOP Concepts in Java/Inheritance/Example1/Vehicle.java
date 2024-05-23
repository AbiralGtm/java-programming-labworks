class Vehicle
{
    private String model;
    private String manufacturer;

    public Vehicle(String model,String manufacturer)
    {
        this.model = model;
        this.manufacturer = manufacturer;
    }
    
    public void selfStartVehicle()
    {
        System.out.println("Self starting vehicle");
    }
    
    public void stopVehicle()
    {
        System.out.println("Vehicle Stopped");
    }

    public void displayInfo()
    {
        System.out.println("Model: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        
    }
}