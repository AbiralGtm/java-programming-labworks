import javax.swing.*;
class  Main
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame();

        jFrame.setSize(400,400);
        jFrame.setTitle("Hello world");
        JLabel label1 = new JLabel("Hello world");
        jFrame.add(label1);
        jFrame.setVisible(true);
    }
}