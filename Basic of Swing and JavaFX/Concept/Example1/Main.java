import javax.swing.*;

class Main
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame();
        
        JLabel label1 = new JLabel("Hello world");
        jFrame.add(label1);
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}