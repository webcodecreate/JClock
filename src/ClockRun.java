import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
import java.text.*;
 
public class ClockRun {
 
    public static void main(String[] args) {
        
        ClockLabel timeLable = new ClockLabel();
 
        JFrame f = new JFrame("Digital Clock");
        f.setSize(300,120);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(timeLable);
        f.getContentPane().setBackground(Color.yellow);
        f.setVisible(true);
    }
}
 
class ClockLabel extends JLabel implements ActionListener {
 
    SimpleDateFormat simpleDateFormat;
 
    public ClockLabel() {

        setForeground(Color.blue);

        simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        setFont(new Font("sans-serif", Font.PLAIN, 50));
        setHorizontalAlignment(SwingConstants.CENTER);
 
        Timer t = new Timer(1000, this);
        t.start();
    }
 
    public void actionPerformed(ActionEvent ae) {
        Date d = new Date();
        setText(simpleDateFormat.format(d));
    }
}