class PartTimeEmployee extends Employee
{
    private static final int FULL_TIME_HOURS = 40;

    public PartTimeEmployee(int empId, String name, String address, double hourlyRate)
    {
        super(empId, name, address, hourlyRate);
    }

    @Override
    public double calculateSalary()
    {
        return getHourlyRate() * FULL_TIME_HOURS;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Employement Time: Part time");
        System.out.println("Salary : " + calculateSalary());
    }
}