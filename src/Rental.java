import javax.swing.*;

public class Rental{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 400;

    //////////////////////////////////////////////////////////MAIN//////////////////////////////////////////
    public static void main(String[] args) {
        GUI frame = new GUI(); //Using the frame already made.
        ImageIcon img = new ImageIcon("../images/logo.GIF"); //Image
        frame.setIconImage(img.getImage()); //Setting icon image
        frame.setTitle("Wahab's Car Rental");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
}
