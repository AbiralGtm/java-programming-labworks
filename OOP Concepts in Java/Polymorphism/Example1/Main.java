public class Main {

    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3.4f);
        shapes[1] = new Rectangle(4.5f,5.5f);
        

        for (Shape shape : shapes) {
            shape.display();
            System.out.println();
        }
    }

}
