import javax.swing.*;
import java.awt.event.*;
//import java.awt.image.BufferedImage;
import java.awt.*;
//import java.io.File;

//import javax.imageio.ImageIO;


public class Traffic implements ActionListener
{
    JButton jr,jy,jg,reset;
    JFrame f;
     JPanel p1,p;
    Traffic()
    {
        f=new JFrame();
        f.setTitle("TRAFFIC LIGHT");
        jr=new JButton("red");
        jy =new JButton("yellow");
        jg = new JButton("green");
        reset=new JButton("reset");
        p = new JPanel();
        p1 = new JPanel();
        f.setLayout(new GridLayout(1,2));
        f.add(p);
        p.setLayout(new GridLayout(4,1));
        f.add(p1);
        p.add(jr);
        p.add(jy);
        p.add(jg);
        p.add(reset);
        jr.addActionListener(this);
        jy.addActionListener(this);
        jg.addActionListener(this);
        reset.addActionListener(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jr)
        {
            p1.setBackground(Color.red);

        }
        else if(e.getSource()==jy)
        {
            p1.setBackground(Color.yellow);
        }
        else if(e.getSource()==jg)
        {
            p1.setBackground(Color.GREEN);
        }
        else if (e.getSource() == reset) 
        {
            p1.setBackground(Color.white);
        }
    }
    public static void main(String args[])
    {
        new Traffic();
        
    }
}
