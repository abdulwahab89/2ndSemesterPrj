import javax.swing.*;
import java.awt.*;

public class WarningThread extends JFrame  implements Runnable{
    private JPanel warningP;
    private JLabel textL, iconL;

    private Transaction aTrans = new Transaction();
    @Override
    public void run(){
    Container pane = getContentPane();
    warningP = new JPanel(null);
    warningP.setBackground(Color.WHITE);
    ImageIcon warningImage = new ImageIcon("images/warning_icon.GIF");
    iconL = new JLabel(warningImage);
    iconL.setBounds(20, 35, 50, 50);
    warningP.add(iconL);
    pane.add(warningP);
    pane.add(textL);
        textL.setText("please complete all details");
        textL.setFont(new Font("Serif", Font.BOLD, 15));
        textL.setForeground(Color.RED);
        textL.setBounds(80, 48, 200, 20);
        warningP.add(pane);
    }
}
