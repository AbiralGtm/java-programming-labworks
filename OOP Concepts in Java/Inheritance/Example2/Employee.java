abstract class Employee
{
    private int empId;
    private String name;
    private String address;
    private double hourlyRate;
    
    public Employee(int empId,String name, String address, double hourlyRate)
    {
        this.empId = empId;
        this.name = name; 
        this.address = address;
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate()
    {
        return hourlyRate;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Hourly rate: " + hourlyRate);
    }
}