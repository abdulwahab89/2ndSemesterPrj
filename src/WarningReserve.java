import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WarningReserve extends JFrame{

    private JPanel warningP;
    private JLabel textL, iconL;

    private Transaction aTrans = new Transaction(); //access my class Transaction as global declaration
    WarningThread myRunnable=new WarningThread();
    Thread t1=new Thread(myRunnable);
    public WarningReserve(){
        t1.start();
        textL = new JLabel("");
        textL.setText("oops invalid");
        textL.setFont(new Font("Serif", Font.BOLD, 15));
        textL.setForeground(Color.RED);
        textL.setBounds(80, 48, 100, 20);
        warningP.add(textL);
    }
}