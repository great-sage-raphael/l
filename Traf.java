import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Traf implements ActionListener, Runnable 
{
    JButton jb,jb1;
    JPanel jp, p1;
    JFrame jf;
    boolean Running = false;

    Traf() {
        jb = new JButton("start");
        jb1 = new JButton("stop");
        jf = new JFrame("TRAFFIC");
        jp = new JPanel();
        p1 = new JPanel();
        jf.setLayout(new GridLayout(1, 2));
        jf.add(jp);
        jp.setLayout(new GridLayout(1, 1));
        jf.add(p1);
        jp.add(jb);
        jp.add(jb1);
        jb.addActionListener(this);
        jb1.addActionListener(this);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 400);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == jb) 
        {
            if (!Running) 
            {
                Running = true;
                Thread t = new Thread(this);
                t.start();
            }
        }
        else if(e.getSource()== jb1)
        {
            p1.setBackground(Color.WHITE);
        }
    }

    public void run() 
    {
        while (Running) 
        {
            p1.setBackground(Color.RED);
            try {
                Thread.sleep(10000); // Sleep for 10 second
                p1.setBackground(Color.yellow);
                Thread.sleep(10000); // Sleep for 10 second
                p1.setBackground(Color.green);
                Thread.sleep(10000); // Sleep for 10 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        new Traf();
    }
}
