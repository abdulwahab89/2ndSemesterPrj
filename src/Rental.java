import javax.swing.*;

public class Rental{
    public static void main(String[] args) {
        GUI frame = new GUI();
        ImageIcon img = new ImageIcon("../images/logo.GIF");
        frame.setIconImage(img.getImage());
        frame.setTitle("Wahab's Car Rental");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setVisible(true);
    }
}
