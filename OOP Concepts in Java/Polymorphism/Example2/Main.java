class Main
{
    public static void main(String[] args)
    {
        Calculator basicCalc = new BasicCalculator();
        System.out.println("Basic Calculator Operations:");
        System.out.println("Addition: " + basicCalc.add(5, 3));
        System.out.println("Subtraction: " + basicCalc.subtract(5, 3));
        System.out.println("Multiplication: " + basicCalc.multiply(5, 3));
        try {
            System.out.println("Division: " + basicCalc.divide(5, 0)); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Using ScientificCalculator
        ScientificCalculator sciCalc = new ScientificCalculator();
        System.out.println("\nScientific Calculator Operations:");
        System.out.println("Addition: " + sciCalc.add(5, 3));
        System.out.println("Power: " + sciCalc.power(2, 3));
        System.out.println("Square Root: " + sciCalc.squareRoot(16));
    }
}