class Main
{
    public static void main(String[] args)
    {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1,"Ram","Pokhara",300);
        fullTimeEmployee.displayInfo();
       
        System.out.println();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2,"Hari","Tanahun",100);
        partTimeEmployee.displayInfo();
    }
}