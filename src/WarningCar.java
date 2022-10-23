import javax.swing.*;
import java.awt.*;
public class WarningCar extends JFrame {
    private JPanel warningP;
    private JLabel textL, iconL;

    private Transaction aTrans = new Transaction();
    WarningThread myRunnable=new WarningThread();
    Thread t1=new Thread(myRunnable);
    public WarningCar(){
t1.start();
        textL = new JLabel("");
        textL.setText("Click a Car");
        textL.setFont(new Font("Serif", Font.BOLD, 15));
        textL.setForeground(Color.RED);
        textL.setBounds(80, 48, 200, 20);
        warningP.add(textL);
    }
}