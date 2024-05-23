class Motorcycle extends Vehicle
{
    private boolean hasABS;

    public Motorcycle(String model,String manufacturer, boolean hasABS)
    {
        super(model,manufacturer);
        this.hasABS = hasABS;
    }
    
    public void kickStart()
    {
        System.out.println("Kick start motorcycle");
    }

   @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Has ABS: " + hasABS);
    
        
    }
}