class Main
{
    public static void main (String[] args)
    {
        Student student = new Student();

        student.setName("Ram");
        student.setRollNumber(2);
        student.setMarks(98.5);

        System.out.println("Name:"+ student.getName());
        System.out.println("Roll Number:"+ student.getRollNumber());
        System.out.println("Marks:"+ student.getMarks());
    }
}