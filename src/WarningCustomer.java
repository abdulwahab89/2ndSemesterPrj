import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WarningCustomer extends JFrame{
    private JPanel warningP;
    private JLabel textL, iconL;

    private Transaction aTrans = new Transaction();
    WarningThread myRunnable=new WarningThread();
    Thread t1=new Thread(myRunnable);
    public WarningCustomer(){

        textL = new JLabel();
        t1.start();
    }
}